import { createRouter, createWebHistory } from 'vue-router';
import Homepage from '../views/Homepage.vue';
import Login from '../views/Login.vue';
//import { hasRole } from '../utils/auth';

const routes = [
    { path: '/', component: Login },
    { path: '/login', component: Login },
    { path: '/homepage', component: Homepage }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;