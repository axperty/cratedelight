<template>
  <div class="feedback-form-container">
    <form v-if="!submitted" @submit.prevent="submitForm" class="feedback-form">
      <!-- Web3Forms Public Access Key -->
      <input type="hidden" name="access_key" value="907d924a-6142-408f-8468-4613f8edce35">
      
      <!-- Spam Protection -->
      <input type="checkbox" name="botcheck" class="hidden" style="display: none;">
      
      <div class="form-group">
        <label for="message">What's on your mind?</label>
        <textarea 
          id="message" 
          name="message" 
          v-model="message" 
          rows="6" 
          placeholder="I'd like to suggest a feature..." 
          required
        ></textarea>
      </div>

      <button type="submit" class="submit-btn" :disabled="isSubmitting">
        {{ isSubmitting ? 'Sending...' : 'Send Feedback' }}
      </button>
      <p v-if="error" class="error-msg">Your message could not be sent. Please try again later.</p>
    </form>
    
    <div v-else class="success-message">
      <h3>Thank you for your feedback!</h3>
      <p>Your message helps to improve the modpack for everyone.</p>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const message = ref('');
const isSubmitting = ref(false);
const submitted = ref(false);
const error = ref(false);

const submitForm = async () => {
  isSubmitting.value = true;
  error.value = false;
  
  try {
    const response = await fetch('https://api.web3forms.com/submit', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Accept': 'application/json'
      },
      body: JSON.stringify({
        access_key: '907d924a-6142-408f-8468-4613f8edce35',
        message: message.value
      })
    });
    
    if (response.status === 200) {
      submitted.value = true;
    } else {
      error.value = true;
    }
  } catch (err) {
    error.value = true;
  } finally {
    isSubmitting.value = false;
  }
};

const resetForm = () => {
  submitted.value = false;
  message.value = '';
};
</script>

<style scoped>
.feedback-form-container {
  margin-top: 1.5rem;
  padding: 2rem;
  background-color: var(--vp-c-bg-soft);
  border-radius: 12px;
  border: 1px solid var(--vp-c-divider);
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.05);
}

.form-group {
  margin-bottom: 1.5rem;
}

label {
  display: block;
  font-weight: 600;
  margin-bottom: 0.75rem;
  color: var(--vp-c-text-1);
}

textarea {
  width: 100%;
  padding: 1rem;
  border-radius: 8px;
  border: 1px solid var(--vp-c-divider);
  background-color: var(--vp-c-bg);
  color: var(--vp-c-text-1);
  font-family: inherit;
  font-size: 1rem;
  transition: border-color 0.2s, box-shadow 0.2s;
  resize: vertical;
}

textarea:focus {
  outline: none;
  border-color: var(--vp-c-brand);
  box-shadow: 0 0 0 2px var(--vp-c-brand-soft);
}

.submit-btn {
  background-color: var(--vp-button-brand-bg, #5A821E);
  color: #ffffff;
  border: none;
  padding: 0.75rem 1.5rem;
  border-radius: 8px;
  font-size: 1rem;
  font-weight: 600;
  cursor: pointer;
  transition: background-color 0.2s;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.submit-btn:hover:not(:disabled) {
  background-color: var(--vp-button-brand-hover-bg, #374C17);
}

.submit-btn:disabled {
  opacity: 0.7;
  cursor: not-allowed;
}

.reset-btn {
  margin-top: 1.5rem;
}

.error-msg {
  color: var(--vp-c-danger-1);
  margin-top: 1rem;
  font-size: 0.9rem;
}

.success-message {
  text-align: center;
  padding: 2rem 0;
}

.success-message h3 {
  color: var(--vp-c-brand);
  margin-bottom: 0.5rem;
}
</style>
