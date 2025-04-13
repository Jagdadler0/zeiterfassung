<script setup>
import { ref } from 'vue'
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
  <div></div>
  <div class="login">
    <div class="time-display" id="clock">09:26</div>

    <input v-model="userName" type="text" placeholder="Username" id="username" />
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
body {
  margin: 0;
  font-family: sans-serif;
  background: #fdfcf6;
  display: flex;
  flex-direction: column;
}
header {
  background: #ede6d6;
  padding: 1rem;
  font-size: 2rem;
  display: flex;
  align-items: center;
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
