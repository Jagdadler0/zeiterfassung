<script setup>
import { ref, onMounted, onUnmounted, computed } from 'vue'
//--> Uhrzeit <--
let intervalId = null
const time = ref(new Date().toLocaleTimeString())
onMounted(() => {
intervalId = setInterval(() => {
time.value = new Date().toLocaleTimeString('de-DE', {
hour: '2-digit',
minute: '2-digit'})
}, 1000)
})
//--> Buttons <--
const isRunning = ref(false)
const totalSeconds = ref(0)

//--> Zeit als HH:MM:SS anzeigen
const formattedTime = computed(() => {
const hours = String(Math.floor(totalSeconds.value / 3600)).padStart(2, '0')
const minutes = String(Math.floor((totalSeconds.value % 3600) / 60)).padStart(2, '0')
const seconds = String(totalSeconds.value % 60).padStart(2, '0')
return `${hours}:${minutes}:${seconds}`
})

function toggleTimer() {
isRunning.value = !isRunning.value

if (isRunning.value) {
intervalId = setInterval(() => {
totalSeconds.value++
}, 1000)
} else {
clearInterval(intervalId)
}
}
const buttonStyle = computed(() => ({
backgroundColor: isRunning.value ? '#9a463d': '#90AC8F', 
color: isRunning.value ? '#F2EDDB': 'black'
}))
</script>
<template>
    <div class="wrapper">
      <header class="header">
        <nav class="nav-bar">
          <a href="#">Tagesanzeige</a>
          <a href="#">Übersicht</a>
          <a href="#">Einstellungen</a>
        </nav>
      </header>
  
      <main class="content">
        <div class="clock" id="clock">{{ time }}</div>
        <div class="timer-box">
            <h1 class="title">Zeiterfassung</h1>
            <h2 class="title">{{ formattedTime }}</h2>
            <div class="info">
                <p><strong>LAST:</strong> Start 8:02</p>
                <p><strong>Status:</strong> -6:34</p>
      </div>
      <button @click="toggleTimer" :style="buttonStyle"> {{ isRunning ? 'Stop' : 'Start' }} </button>
        </div>
      </main>
    </div>
  </template>
  
  <style scoped>
  * {
    box-sizing: border-box;
  }
  
  body, html {
    margin: 0;
    padding: 0;
    height: 100%;
    font-family: Arial, sans-serif;
    background-color: #F2EDDB;
    color: black;
  }
  .clock {
    font-size: 60px;
    margin-bottom: 100px;
  }
  .info {
  font-size: 18px;
}
  .wrapper {
    display: flex;
    flex-direction: column;
    min-height: 100vh;
    background-color: #F2EDDB;
  }
  
  .header {
    background-color: #F2EDDB;
    padding: 20px;
    border-bottom: 1px solid black;
    display: flex;
    align-items: center;
    justify-content: center;
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
  
  .timer {
    font-size: 60px;
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
  }
  
  button:hover {
    transform: scale(1.05);
  }
  
  .start {
    background-color: #90AC8F;
  }
  
  .stop {
    background-color: red;
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
  </style>