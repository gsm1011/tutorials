import Vue from 'vue'
import Router from 'vue-router'
import Grid1 from '@/components/Grid1'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: () => import('@/components/Login')
    },
    {
      path: '/',
      name: 'GridBasics',
      component: () => import('@/components/GridBasics')
    },
    {
      path: '/grid1',
      name: 'Grid1',
      component: Grid1
    },
    {
      path: '/grid2',
      name: 'Grid2',
      component: () => import('@/components/Grid2')

    },
    {
      path: '/grid3',
      name: 'Grid3',
      component: () => import('@/components/Grid3')
    },
    {
      path: '/about',
      name: 'About',
      component: () => import('@/components/About')
    },
    {
      path: '/404',
      name: '404',
      component: () => import('@/components/404')
    }
  ]
})
