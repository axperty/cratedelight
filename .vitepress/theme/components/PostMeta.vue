<template>
  <div class="post-meta" v-if="frontmatter.date || frontmatter.category || (frontmatter.tags && frontmatter.tags.length)">
    <div class="meta-item category" v-if="frontmatter.category">
      {{ frontmatter.category }}
    </div>
    <div class="meta-item date" v-if="frontmatter.date">
      {{ formatDate(frontmatter.date) }}
    </div>
    <div class="meta-item tags" v-if="frontmatter.tags && frontmatter.tags.length">
      <span class="tag" v-for="tag in frontmatter.tags" :key="tag">#{{ tag }}</span>
    </div>
  </div>
</template>

<script setup>
import { useData } from 'vitepress'
const { frontmatter } = useData()

const formatDate = (date) => {
  // Check if date is a string or date object
  const d = new Date(date)
  if (isNaN(d.getTime())) return date;
  
  return d.toLocaleDateString(undefined, { 
    year: 'numeric', 
    month: 'long', 
    day: 'numeric',
    timeZone: 'UTC' // Frontmatter dates without time often shift backwards without UTC
  })
}
</script>

<style scoped>
.post-meta {
  display: flex;
  flex-wrap: wrap;
  gap: 2rem;
  margin-top: 1rem;
  margin-bottom: 2.5rem;
  padding-bottom: 1rem;
  border-bottom: 1px solid var(--vp-c-divider);
  font-size: 0.95rem;
  color: var(--vp-c-text-2);
}

.meta-item {
  display: flex;
  align-items: center;
  gap: 0.4rem;
}

.category {
  color: var(--vp-c-brand-1);
  font-weight: 600;
}

.tag {
  background-color: var(--vp-c-bg-soft);
  padding: 0.2rem 0.6rem;
  border-radius: 6px;
  font-size: 0.8rem;
  margin-right: 0.4rem;
  color: var(--vp-c-text-1);
  border: 1px solid var(--vp-c-divider);
}
</style>
