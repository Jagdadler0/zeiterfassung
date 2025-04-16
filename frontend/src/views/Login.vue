<script setup>
import { ref } from 'vue'
import uhrzeit from '@/components/uhrzeit.vue'
const userName = ref('')
const passWord = ref('')
function userLogin() {
  console.log('Login')
  if (userName.value === 'admin' && passWord.value === 'admin') {
    console.log('admin')
  }
}
</script>
<template>
   <header class="header">
        <nav class="nav-bar">
          <a href="#">Tagesanzeige</a>
          <a href="#">Übersicht</a>
          <a href="#">Einstellungen</a>
        </nav>
      </header>
  <div></div>
  <div class="login">
<uhrzeit></uhrzeit>
    <input v-model="username" type="text" placeholder="E-Mail" id="username" />
    <input v-model="passWord" type="password" placeholder="Password" id="password" />
    <div class="buttons">
      <button @click="userLogin" id="login">Login</button>
    </div>
  </div>
</template>
<style scoped>
h1 {
  color: #333;
}
.nav-bar {
    display: flex;
    gap: 30px;
  }
  
  .nav-bar a {
    text-decoration: none;
    font-weight: bold;
    color: black;
    font-family: Georgia, serif;
    padding: 8px 12px;
    border-radius: 8px;
    transition: background-color 0.3s ease;
  }
  
  .nav-bar a:hover {
    background-color: #ddd;
  }
header {
  background: #ede6d6;
  padding: 1rem;
  font-size: 2rem;
  display: flex;
  align-items: center;
}
.content {
    flex: 1;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    text-align: center;
    padding: 40px 20px;
  }
main {
  display: flex;
  padding: 2rem;
}
.login {
  display: flex;
  flex-direction: column;

  align-items: center;
}
input {
  padding: 0.7rem;
  border-radius: 20px;
  border: 1px solid #ccc;
  text-align: center;
}

button {
  padding: 0.7rem 1.5rem;
  border-radius: 20px;
  border: none;
  cursor: pointer;
}
</style>
