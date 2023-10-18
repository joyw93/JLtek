<template>
  <div class="banner">
    <div class="nav">
      <span class="logo">JLtek</span>
      <span class="tabs">
        <v-tabs v-model="tab">
          <v-tab class="tab" @click="onClick('/')">회사소개</v-tab>
          <v-tab class="tab" @click="onClick('estimate')">견적문의</v-tab>
        </v-tabs>
      </span>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRoute, useRouter } from 'vue-router'
const tab = ref('')
const router = useRouter()
const onClick = (route) => {
  router.push(route)
}
</script>
<style>
.banner {
  width: 100%;
  height: 50vh;
  background-size: 100% 100%;
  background-image: url('../assets/images/banner3.jpg');
}

.nav {
  display: inline-block;
  display: flex;
  height: 10vh;
  align-items: center;
  background-color: rgba(255, 0, 0, 0);
  color: aliceblue;
}

.logo {
  font-size: 3rem;
  font-weight: bolder;
  margin-left: 20px;
  margin-right: auto;
}

.tabs {
  font-size: 200px;
  margin-right: 50px;
}

.v-btn__content {
  font-size: 1.3rem;
}
</style>
