Write-Host "What type of storage do you want to create? e.g., crate, bag"
$storageType = Read-Host "> "
$storageType = $storageType.Trim().ToLower()

Write-Host "Enter the items you want to create $storageType blocks for, separated by commas e.g., apple, potato, leaf_litter:"
$inputItems = Read-Host "> "

$items = $inputItems -split "," | ForEach-Object { $_.Trim().Replace(" ", "_").ToLower() }

$baseAssets = "src/main/resources/assets/cratedelight"
$baseData = "src/main/resources/data/cratedelight"

$blockstatesDir = Join-Path $baseAssets "blockstates"
$itemsDir = Join-Path $baseAssets "items"
$blockModelsDir = Join-Path $baseAssets "models/block"
$itemModelsDir = Join-Path $baseAssets "models/item"
$advancementsDir = Join-Path $baseData "advancement/recipes/building_blocks"
$lootTablesDir = Join-Path $baseData "loot_table/blocks"
$recipesDir = Join-Path $baseData "recipe"

$directories = @($blockstatesDir, $itemsDir, $blockModelsDir, $itemModelsDir, $advancementsDir, $lootTablesDir, $recipesDir)
foreach ($dir in $directories) {
    if (-not (Test-Path $dir)) {
        New-Item -ItemType Directory -Force -Path $dir | Out-Null
    }
}

foreach ($item in $items) {
    if ([string]::IsNullOrWhiteSpace($item)) { continue }

    $objectName = "${item}_${storageType}"
    $filename = "${objectName}.json"

    # 1. Blockstates
    $blockstatesContent = @"
{
  "variants": {
    "": { "model": "cratedelight:block/$objectName" }
  }
}
"@
    $blockstatesContent | Out-File -FilePath (Join-Path $blockstatesDir $filename) -Encoding utf8

    # 2. Items definition
    $itemsContent = @"
{
  "model": {
    "type": "minecraft:model",
    "model": "cratedelight:item/$objectName"
  }
}
"@
    $itemsContent | Out-File -FilePath (Join-Path $itemsDir $filename) -Encoding utf8

    # 3. Block Models
    $blockModelContent = @"
{
  "parent": "minecraft:block/cube_bottom_top",
  "textures": {
    "side": "cratedelight:block/${objectName}_side",
    "bottom": "cratedelight:block/${storageType}_bottom",
    "top": "cratedelight:block/${objectName}_top"
  }
}
"@
    $blockModelContent | Out-File -FilePath (Join-Path $blockModelsDir $filename) -Encoding utf8

    # 4. Item Models
    $itemModelContent = @"
{
  "parent": "cratedelight:block/$objectName"
}
"@
    $itemModelContent | Out-File -FilePath (Join-Path $itemModelsDir $filename) -Encoding utf8

    # 5. Advancements
    $advancementContent = @"
{
  "parent": "minecraft:recipes/root",
  "criteria": {
    "has_${item}": {
      "conditions": {
        "items": [
          {
            "items": [
              "minecraft:$item"
            ]
          }
        ]
      },
      "trigger": "minecraft:inventory_changed"
    },
    "has_the_recipe": {
      "conditions": {
        "recipe": "cratedelight:$objectName"
      },
      "trigger": "minecraft:recipe_unlocked"
    }
  },
  "requirements": [
    [
      "has_${item}",
      "has_the_recipe"
    ]
  ],
  "rewards": {
    "recipes": [
      "cratedelight:$objectName"
    ]
  },
  "sends_telemetry_event": false
}
"@
    $advancementContent | Out-File -FilePath (Join-Path $advancementsDir $filename) -Encoding utf8

    # 6. Loot Tables
    $lootTableContent = @"
{
  "type": "minecraft:block",
  "pools": [
    {
      "name": "pool1",
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "cratedelight:$objectName"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
"@
    $lootTableContent | Out-File -FilePath (Join-Path $lootTablesDir $filename) -Encoding utf8

    # 7. Recipes
    $recipeContent = @"
{
  "type": "minecraft:crafting_shaped",
  "category": "misc",
  "pattern": [
    "###",
    "###",
    "###"
  ],
  "key": {
    "#": "minecraft:$item"
  },
  "result": {
    "count": 1,
    "id": "cratedelight:$objectName"
  }
}
"@
    $recipeContent | Out-File -FilePath (Join-Path $recipesDir $filename) -Encoding utf8

    Write-Host "Generated all standard files for $objectName"
}

if ($storageType -eq "crate") {
    $axeTagDir = "src/main/resources/data/minecraft/tags/block/mineable"
    if (-not (Test-Path $axeTagDir)) {
        New-Item -ItemType Directory -Force -Path $axeTagDir | Out-Null
    }

    $axeTagFile = Join-Path $axeTagDir "axe.json"
    $currentValues = @()

    if (Test-Path $axeTagFile) {
        $existingJson = Get-Content $axeTagFile -Raw | ConvertFrom-Json
        if ($null -ne $existingJson.values) {
            $currentValues = @($existingJson.values)
        }
    }

    $addedCount = 0
    foreach ($item in $items) {
        if ([string]::IsNullOrWhiteSpace($item)) { continue }

        $crateEntry = "cratedelight:${item}_crate"
        if ($currentValues -notcontains $crateEntry) {
            $currentValues += $crateEntry
            $addedCount++
        }
    }

    if ($addedCount -gt 0) {
        # Manually format the JSON to keep 2-space indentation
        $valuesFormatted = ($currentValues | ForEach-Object { "    `"$_`"" }) -join ",`n"
        $finalJson = "{`n  `"replace`": false,`n  `"values`": [`n$valuesFormatted`n  ]`n}"

        $finalJson | Out-File -FilePath $axeTagFile -Encoding utf8
        Write-Host "Added $addedCount new crates to axe.json."
    } else {
        Write-Host "No new crates needed to be added to axe.json."
    }
}

Write-Host "Finished generating all files!"