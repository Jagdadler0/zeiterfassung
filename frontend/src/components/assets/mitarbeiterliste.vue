<script setup>
import { ref } from 'vue'
const show = ref(false)
function addUser() {
  console.log('add')
}
</script>
<template>
  <div class="cardd" id="mitarbeiter">
    <h2>Mitarbeiterliste <button @click="show = !show" id="toggleButton">hinzufügen</button></h2>
    <div v-if="show" id="formular">
      <h3>Benutzter hinzufügen</h3>
      <form id="benutzerForm">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required /> <br />
        <label for="email">E-Mail:</label>
        <input type="email" id="email" name="email" required /> <br />
        <label for="passwort">Passwort:</label>
        <input type="password" id="passwort" name="passwort" required /> <br />
        <label for="arbeitsmodell">Arbeitsmodell:</label>
        <select id="arbeitsmodell" name="arbeitsmodell" required>
          <option value="">Bitte wählen</option>
          <option value="Vollzeit">Vollzeit</option>
          <option value="Teilzeit">Teilzeit</option>
        </select>
        <br />
        <p></p>
        <button @click="addUser" type="submit">Hinzufügen</button>
      </form>
    </div>
  </div>
</template>
<style scoped>
body {
  margin: 0;
  font-family: 'Segoe UI', sans-serif;
}
.cardd {
  padding: 20px;
  border-radius: 12px;
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
}
.cardd h2 {
  margin-top: 0;
  font-size: 1.4rem;
}
#formular {
  margin-top: 20px;
  padding: 10px;
  border: 1px solid #ccc;
  width: 400px;
  background-color: #f9f9f9;
  border-radius: 8px;
}
button {
  padding: 8px 12px;
  cursor: pointer;
}
label {
  margin: 10px;
}
header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 20px;
}
input {
  display: block;
  margin: 10px 0;
  width: 80%;
  padding: 8px;
}
</style>
