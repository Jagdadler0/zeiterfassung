// import { defineStore } from 'pinia';
// import jwtDecode from 'jwt-decode';

// export function getToken() {
//     return localStorage.getItem('token');
// }

// export function decodeToken() {
//     const token = getToken();
//     if (!token) return null;
//     return jwtDecode(token);
// }

// export function hasRole(requiredRole) {
//     const decoded = decodeToken();
//     return decoded?.roles?.includes(requiredRole);
// }

// export const useAuthStore = defineStore('auth', {
//     state: () => ({
//       token: localStorage.getItem('token') || '',
//       user: localStorage.getItem('token') ? jwtDecode(localStorage.getItem('token')) : null
//     }),
  
//     getters: {
//       isAuthenticated: (state) => !!state.token,
//       roles: (state) => state.user?.roles || [],
//       isAdmin: (state) => state.roles.includes('ADMIN'),
//       username: (state) => state.user?.sub || 'Gast'
//     },
  
//     actions: {
//       login(token) {
//         this.token = token
//         this.user = jwtDecode(token)
//         localStorage.setItem('token', token)
//       },
//       logout() {
//         this.token = ''
//         this.user = null
//         localStorage.removeItem('token')
//       }
//     }
//   })
