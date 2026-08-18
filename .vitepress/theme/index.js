import DefaultTheme from 'vitepress/theme'
import { enhanceAppWithTabs } from 'vitepress-plugin-tabs/client'
import FeedbackForm from './components/FeedbackForm.vue'
import PostMeta from './components/PostMeta.vue'
import './style.css'

export default {
  extends: DefaultTheme,
  enhanceApp({ app }) {
    enhanceAppWithTabs(app)
    app.component('FeedbackForm', FeedbackForm)
    app.component('PostMeta', PostMeta)
  }
}
