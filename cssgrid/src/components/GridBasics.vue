<template>
  <v-container class="container">
    <div class="part-1">
      abc
    </div>
    <div class="part">
      ddd
    </div>
    <div class="part-2">
      sfsafljljl
    </div>
    <div class="part">
      dljflsjfls
    </div>
    <div class="part-3">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </div>
  </v-container>
</template>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.container {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  grid-template-rows: minmax(200px, auto);
  background-color: #8cffa0;
  height: 100%;
  width: 100%;
  box-sizing: border-box;
  grid-gap: 1px;
}
.part {
  background-color: blue;
  grid-column: auto;
  font-size: 20px;
  padding: 10px;
}
.part-1 {
  background-color: yellow;
  padding: 10px;
}
.part-2 {
  background-color: red;
  padding: 20px;
}
.part-3 {
  background-color: green;
  grid-column: 2/4;
  font-size: 20px;
  font-family: sans-serif;
  font-weight: bolder;
  padding: 30px;
}
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
