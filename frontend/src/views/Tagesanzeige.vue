<script setup>
import { ref, onMounted, onUnmounted, computed } from 'vue'
import uhrzeit from '@/components/uhrzeit.vue'
import navigation from '@/components/navigation.vue'
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
      <navigation></navigation>
      <main class="content">
      <uhrzeit></uhrzeit>
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
  
  .info {
  font-size: 18px;
}
.wrapper {
    display: flex;
    flex-direction: column;
    min-height: 100vh;
    background-color: #F2EDDB;
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