<script setup>
import { ref } from 'vue'
import uhrzeit from '@/components/uhrzeit.vue'
import navigation from '@/components/navigation.vue'
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
  <div class="wrapper">
    <navigation></navigation>
    <main class="content">
      <uhrzeit />
      <div class="timer-box">
        <h1 class="title">Login</h1>
        <div class="info">
          <input v-model="userName" type="text" placeholder="E-Mail" id="username" />
          <input v-model="passWord" type="password" placeholder="Password" id="password" />
          <div class="buttons">
            <button @click="userLogin" id="login">Login</button>
          </div>
        </div>
      </div>
    </main>
  </div>
</template>
<style scoped>
.wrapper {
    display: flex;
    flex-direction: column;
    min-height: 100vh;
    background-color: #F2EDDB;
  }
h1 {
  color: #333;
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
  padding: 14px 55px;
  border-radius: 12px;
  border: 1px solid #ccc;
  text-align: center;
  height: 25px;
  margin-bottom: 20px; 
  display: block; 
}
button {
  padding: 14px 55px;
  font-size: 25px;
  border-radius: 12px;
  border: none;
  cursor: pointer;
  background-color: #90AC8F;
  font-family: "Georgia", serif;
  transition: background-color 0.3s ease, transform 0.2s ease;
  margin-top: 10px;
  align-self: center; /* zentriert ihn, falls nötig */
}

button:hover {
    transform: scale(1.05);
  }
  .timer-box {
  background-color: #F2EDDB;
  padding: 30px;
  border: 2px solid black;
  border-radius: 25px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 5px;
  width: 450px;
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

.title {
  font-size: 36px;
  margin-bottom: 20px;
  margin-top: 0;
}
</style>
