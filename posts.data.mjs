import { createContentLoader } from 'vitepress'

export default createContentLoader('posts/*-*.md', {
  transform(raw) {
    return raw
      .map(({ url, frontmatter, excerpt }) => ({
        title: frontmatter.title,
        url,
        date: frontmatter.date,
      }))
      .sort((a, b) => b.date - a.date)
  }
})
