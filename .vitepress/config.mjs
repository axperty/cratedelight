import { defineConfig } from 'vitepress'
import { tabsMarkdownPlugin } from 'vitepress-plugin-tabs'

const sharedSidebar = [
  {
    text: 'Wiki',
    items: [
      { text: 'About', link: '/wiki/about' },
      { text: 'Installation', link: '/wiki/installation' },
      { text: 'Features', link: '/wiki/features' },
      {
        text: 'All Blocks',
        collapsed: true,
        items: [
          { text: 'Apple Crate', link: '/wiki/items/apple_crate' },
          { text: 'Beetroot Crate', link: '/wiki/items/beetroot_crate' },
          { text: 'Beetroot Seeds Bag', link: '/wiki/items/beetroot_seeds_bag' },
          { text: 'Berry Crate', link: '/wiki/items/berry_crate' },
          { text: 'Blue Egg Crate', link: '/wiki/items/blue_egg_crate' },
          { text: 'Bread Bag', link: '/wiki/items/bread_bag' },
          { text: 'Brown Egg Crate', link: '/wiki/items/brown_egg_crate' },
          { text: 'Brown Mushroom Crate', link: '/wiki/items/brown_mushroom_crate' },
          { text: 'Carrot Crate', link: '/wiki/items/carrot_crate' },
          { text: 'Cocoa Beans Bag', link: '/wiki/items/cocoa_beans_bag' },
          { text: 'Cod Crate', link: '/wiki/items/cod_crate' },
          { text: 'Cookie Bag', link: '/wiki/items/cookie_bag' },
          { text: 'Egg Crate', link: '/wiki/items/egg_crate' },
          { text: 'Glow Berry Crate', link: '/wiki/items/glow_berry_crate' },
          { text: 'Golden Apple Crate', link: '/wiki/items/golden_apple_crate' },
          { text: 'Golden Carrot Crate', link: '/wiki/items/golden_carrot_crate' },
          { text: 'Gunpowder Bag', link: '/wiki/items/gunpowder_bag' },
          { text: 'Leaf Litter Bag', link: '/wiki/items/leaf_litter_bag' },
          { text: 'Melon Seeds Bag', link: '/wiki/items/melon_seeds_bag' },
          { text: 'Poisonous Potato Crate', link: '/wiki/items/poisonous_potato_crate' },
          { text: 'Potato Crate', link: '/wiki/items/potato_crate' },
          { text: 'Pufferfish Crate', link: '/wiki/items/pufferfish_crate' },
          { text: 'Pumpkin Seeds Bag', link: '/wiki/items/pumpkin_seeds_bag' },
          { text: 'Pumpkin Slice Crate', link: '/wiki/items/pumpkin_slice_crate' },
          { text: 'Red Mushroom Crate', link: '/wiki/items/red_mushroom_crate' },
          { text: 'Salmon Crate', link: '/wiki/items/salmon_crate' },
          { text: 'Sugar Bag', link: '/wiki/items/sugar_bag' },
          { text: 'Tropical Fish Crate', link: '/wiki/items/tropical_fish_crate' },
          { text: 'Wheat Seeds Bag', link: '/wiki/items/wheat_seeds_bag' }
        ]
      },
      { text: 'Translations', link: '/wiki/translations' },
      { text: 'Feedback & Suggestions', link: '/wiki/feedback' }
    ]
  }
];

function getSidebar(prefix) {
  const sidebar = JSON.parse(JSON.stringify(sharedSidebar));
  function appendPrefix(items) {
    items.forEach(item => {
      if (item.link) item.link = prefix + item.link;
      if (item.items) appendPrefix(item.items);
    });
  }
  appendPrefix(sidebar);
  return sidebar;
}

export default defineConfig({
  base: '/cratedelight/',

  markdown: {
    config(md) {
      md.use(tabsMarkdownPlugin)
    }
  },
  title: "Crate Delight",
  description: "Crate Delight is a Minecraft mod that adds useful crates and bags that will save you storage and look great.",
  head: [
    ['link', { rel: 'icon', href: '/cratedelight/assets/cratedelight_icon.png' }],
    ['meta', { name: 'theme-color', content: '#b38b59' }],
    ['meta', { property: 'og:title', content: 'Crate Delight' }],
    ['meta', { property: 'og:description', content: 'Crate Delight is a Minecraft mod that adds useful crates and bags that will save you storage and look great.' }],
    ['meta', { property: 'og:image', content: 'https://axperty.github.io/cratedelight/assets/cratedelight_1.png' }],
    ['meta', { name: 'twitter:card', content: 'summary_large_image' }],
    ['meta', { name: 'twitter:image', content: 'https://axperty.github.io/cratedelight/assets/cratedelight_1.png' }]
  ],
  sitemap: {
    hostname: 'https://axperty.github.io/cratedelight/'
  },

  locales: {
    root: {
      label: 'English',
      lang: 'en'
    },
    zh: {
      label: 'Chinese',
      lang: 'zh',
      themeConfig: {
        nav: [
          { text: 'Home', link: '/zh/' },
          { text: 'Wiki', link: '/zh/wiki/about' },
          { text: 'News & Updates', link: '/zh/posts/' }
        ],
        sidebar: {
          '/zh/wiki/': getSidebar('/zh')
        }
      }
    }
  },

  themeConfig: {
    search: {
      provider: 'local'
    },
    logo: '/assets/cratedelight_icon.png',
    nav: [
      { text: 'Home', link: '/' },
      { text: 'Wiki', link: '/wiki/about' },
      { text: 'News & Updates', link: '/posts/' }
    ],
    sidebar: {
      '/wiki/': getSidebar('')
    },
    socialLinks: [
      { icon: 'github', link: 'https://github.com/axperty/cratedelight' },
      { icon: 'discord', link: 'https://discord.gg/e2BQx4bbsU' }
    ],
    footer: {
      message: 'Not an official Minecraft product. Not approved by or associated with Mojang or Microsoft. All other trademarks and logos are property of their respective owners.',
      copyright: 'Copyright © 2026 Axperty.'
    }
  }
})
