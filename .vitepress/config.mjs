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
    ['link', { rel: 'icon', href: '/cratedelight/assets/cratedelight_icon_hero.png' }],
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
    ja: {
      label: 'Japanese',
      lang: 'ja',
      themeConfig: {
        nav: [
          { text: 'Home', link: '/ja/' },
          { text: 'Wiki', link: '/ja/wiki/about' },
          { text: 'Donate', link: 'ja/donate' }
        ],
        sidebar: {
          '/ja/wiki/': getSidebar('/ja')
        }
      }
    },
    es: {
      label: 'Spanish',
      lang: 'es',
      themeConfig: {
        nav: [
          { text: 'Home', link: '/es/' },
          { text: 'Wiki', link: '/es/wiki/about' },
          { text: 'Donate', link: 'es/donate' }
        ],
        sidebar: {
          '/es/wiki/': getSidebar('/es')
        }
      }
    },
    zh: {
      label: 'Chinese',
      lang: 'zh',
      themeConfig: {
        nav: [
          { text: 'Home', link: '/zh/' },
          { text: 'Wiki', link: '/zh/wiki/about' },
          { text: 'Donate', link: 'zh/donate' }
        ],
        sidebar: {
          '/zh/wiki/': getSidebar('/zh')
        }
      }
    },
    ko: {
      label: 'Korean',
      lang: 'ko',
      themeConfig: {
        nav: [
          { text: 'Home', link: '/ko/' },
          { text: 'Wiki', link: '/ko/wiki/about' },
          { text: 'Donate', link: 'ko/donate' }
        ],
        sidebar: {
          '/ko/wiki/': getSidebar('/ko')
        }
      }
    },
    ru: {
      label: 'Russian',
      lang: 'ru',
      themeConfig: {
        nav: [
          { text: 'Home', link: '/ru/' },
          { text: 'Wiki', link: '/ru/wiki/about' },
          { text: 'Donate', link: 'ru/donate' }
        ],
        sidebar: {
          '/ru/wiki/': getSidebar('/ru')
        }
      }
    }
  },

  themeConfig: {
    search: {
      provider: 'local'
    },
    logo: '/assets/cratedelight_icon_hero.png',
    nav: [
      { text: 'Home', link: '/' },
      { text: 'Wiki', link: '/wiki/about' },
      { text: 'Donate', link: '/donate' }
    ],
    sidebar: {
      '/wiki/': getSidebar('')
    },
    socialLinks: [
      { icon: 'github', link: 'https://github.com/axperty/cratedelight' },
      { icon: 'discord', link: 'https://discord.gg/e2BQx4bbsU' },
      { icon: 'youtube', link: 'https://www.youtube.com/@axperty' }
    ],
    footer: {
      message: '<a href="/cratedelight/privacy">Privacy Policy</a><br/> Crate Delight is licensed under the <a href="https://github.com/axperty/cratedelight/blob/26.2-neoforge/LICENSE" target="_blank" rel="noopener">MIT License</a>.<br/> Not an official Minecraft product. Not approved by or associated with Mojang or Microsoft.<br/> All other trademarks and logos are property of their respective owners.',
      copyright: 'Copyright © 2026 Axperty. Website source code is under the MIT License.'
    }
  }
})
