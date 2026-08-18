---
title: News & Updates
---

# News & Updates

<script setup>
import { data as posts } from '../posts.data.mjs'
import { withBase } from 'vitepress'
</script>

<ul style="list-style-type: none; padding: 0;">
  <li v-for="post of posts" :key="post.url" style="margin-bottom: 1rem;">
    <a :href="withBase(post.url)" style="font-size: 1.2rem; font-weight: bold; text-decoration: none;">{{ post.title }}</a>
    <span style="display: block; font-size: 0.9em; color: var(--vp-c-text-2);">{{ new Date(post.date).toLocaleDateString(undefined, { year: 'numeric', month: 'long', day: 'numeric' }) }}</span>
  </li>
</ul>
