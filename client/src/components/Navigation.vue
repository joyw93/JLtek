<template>
  <div class="banner">
    <div class="nav">
      <span class="logo">JLtek</span>
      <span class="tabs">
        <v-tabs v-model="tab">
          <v-tab @click="onClick('/')">회사소개</v-tab>
          <v-tab @click="onClick('estimate')">견적문의</v-tab>
        </v-tabs>
      </span>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRoute, useRouter } from 'vue-router'
const tab = ref('')
const items = ['회사소개', '견적문의']
const route = useRoute()
const router = useRouter()
const onClick = (index) => {
  router.push(index)
}
</script>
<style>
.banner {
  width: 100%;
  height: 100vh;
  background-size: 100% 100%;
  background-image: url('../assets/images/banner3.jpg');
}

.nav {
  display: inline-block;
  display: flex;
  align-items: center;
  height: 100px;
  background-color: rgba(255, 0, 0, 0);
  color: aliceblue;
}

.logo {
  font-size: 1.8rem;
  font-weight: bolder;
  margin-left: 20px;
  margin-right: auto;
}

.tabs {
  margin-right: 50px;
}
</style>
