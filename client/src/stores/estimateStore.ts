import { defineStore } from 'pinia'
import { ref } from 'vue'

export const useEstimateStore = defineStore('estimate', () => {
  const title = ref('')
  const content = ref('')

  return { title, content }
})
