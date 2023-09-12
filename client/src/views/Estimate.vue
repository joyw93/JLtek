<template>
  <div class="container">
    <div class="header">견적문의</div>
    <v-text-field class="title" v-model="title" label="제목 입력" variant="outlined"></v-text-field>
    <v-textarea class="content" v-model="content" label="내용" variant="outlined"></v-textarea>
    <div class="buttons">
      <v-btn class="cancel" @click="resetForm">취소</v-btn>
      <v-btn class="submit" @click="submitForm">등록</v-btn>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useEstimateStore } from '@/stores/estimateStore.ts'
import { postEstimate } from '@/service/estimateService.ts'

const title = ref('')
const content = ref('')

const submitForm = async () => {
  const post = {
    title: title.value,
    content: content.value
  }
  await postEstimate(post) // 서비스 레이어의 함수 호출
  resetForm()
}

const resetForm = () => {
  title.value = ''
  content.value = ''
}
</script>

<style scoped>
.container {
  margin-left: calc(10%);
  margin-right: calc(10%);
  height: 100vh;
}
.header {
  margin-top: 20px;
  font-size: 1.8rem;
  font-weight: bolder;
}
.title {
  margin-top: 20px;
}
.buttons {
  float: right;
}
.submit {
  background-color: #1c2042;
  color: white;
}
.cancel {
  margin-right: 10px;
}
</style>
