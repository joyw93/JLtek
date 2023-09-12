import { createRouter, createWebHistory, type RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Estimate from '../views/Estimate.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/estimate',
    name: 'Estimate',
    component: Estimate
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
