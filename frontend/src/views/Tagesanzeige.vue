<script setup></script>
<template>
      <div class="container">
   <header>
  
  <!-- Container für Icon + Dropdown -->
  <div class="burger-container">
    <div class="burger-menu" onclick="toggleMenu()">&#9776;</div>
    <div id="dropdown" class="dropdown-content">
      <a href="#">Platzhalter</a>
      <a href="#">Platzhalter</a>
      <a href="#">Platzhalter</a>
    </div>
  </div>
</header>
<div class="container">
        <h1 class="title">Zeiterfassung</h1>
        <div class="timer" id="timer">00:00:00</div>
        <button id="toggleBtn" class="start">Start</button>
    </div>
  </div>
</template>
<style scoped>
body {
  margin: 0;
  font-family: Arial, sans-serif;
  background-color: #F2EDDB;
  color: black;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}
header {
  background-color: #F2EDDB;
  padding: 20px;
  border-bottom: 1px solid black;
  display: flex;
  align-items: center;
}

.logo {
  height: 50px;
}

main {
  text-align: center;
  padding: 40px 20px;
}

.clock {
  font-size: 60px;
  margin-bottom: 20px;
}

.info {
  font-size: 18px;
  margin-bottom: 40px;
}

.buttons {
  display: flex;
  justify-content: center;
  gap: 30px;
}

button {
    padding: 14px 32px;
    font-size: 20px;
    border-radius: 12px;
    border: none;
    cursor: pointer;
    background-color: white;
    font-family: "Georgia", serif;
    transition: background-color 0.3s ease, transform 0.2s ease;
}

button:hover {
  background-color: #ddd;
  transform: scale(1.05);
}

.start {
    background-color: #90AC8F;
}
.stop {
    background-color: red;
}
/* Burger-Icon Container */
.burger-container {
  position: relative;
  margin-left: auto;
  padding-right: 20px;
}

/* Burger-Icon */
.burger-menu {
  font-size: 26px;
  cursor: pointer;
}

/* Dropdown-Menü */
.dropdown-content {
  display: none;
  position: absolute;
  top: 36px; /* Abstand unter dem Icon */
  right: 0;
  background-color: #ffffff;
  border: 1px solid #ccc;
  z-index: 10;
  width: 180px;
  border-radius: 8px;
  box-shadow: 0px 4px 10px rgba(0,0,0,0.1);
}

.dropdown-content a {
  display: block;
  padding: 12px 16px;
  text-decoration: none;
  color: #000;
  border-bottom: 1px solid #eee;
}

.dropdown-content a:hover {
  background-color: #f2eddb;
}

.dropdown-content a:last-child {
  border-bottom: none;
}</style>