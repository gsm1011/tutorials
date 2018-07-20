<template>
  <v-container class="site">
    <div class="child">
      <span>
        NOT FOUND
      </span>
    </div>
  </v-container>
</template>

<style scoped>
  .site {
    display: grid;
    grid-template-columns: 100%;
    grid-template-rows: 100%;
    grid-gap: 10px;
    background-color: blue;
  }
  .child {
    grid-column: 1;
    grid-row: 1;
    font-size: 50px;
    font-variant: small-caps;
    font-weight: bold;
    color: yellow;
  }
</style>
