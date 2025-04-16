<script setup> 
import { ref, onMounted } from 'vue'

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
</script>
<template><div class="clock" id="clock">{{ time }}</div></template>
<style scoped>
.clock {
    font-size: 60px;
    margin-bottom: 100px;
  }</style>