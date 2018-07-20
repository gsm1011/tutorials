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
      abcdef
    </div>

    <div class="part-4">
      Lorem ipsum dolor sit amet.
    </div>
    <div>
      albjlsdjl
    </div>
    <div>
      ljdsljfaljrioejgidjgodvnzflkdkfl
    </div>
    <div>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequatur, reiciendis.
    </div>
    <div>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ratione expedita quaerat, aperiam ea sapiente incidunt dolorem! Ea error nostrum delectus!
    </div>
    <div>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est nemo, facere quidem, recusandae unde animi, hic quo ea cum aspernatur voluptas sapiente in voluptatem dolor, ipsa suscipit veniam ab non omnis voluptate.
    </div>
    <div class="part-5">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero vel ipsa omnis commodi dolores ut, eligendi quaerat. Est doloribus sequi assumenda qui quis iusto nam voluptates, numquam atque quia ipsum unde, rem odit excepturi esse possimus. Fuga, tenetur, ea. Tenetur quos provident delectus, veritatis cumque dolor, neque, aspernatur atque aliquid numquam vel doloremque hic quaerat fuga maiores enim. Ipsa reiciendis id quas, consequuntur ea natus vel at ipsum debitis suscipit cum deleniti. Porro aut voluptates vitae repudiandae expedita commodi at dignissimos aperiam debitis, ad, facere, quidem saepe molestias sapiente iusto et adipisci obcaecati enim error aspernatur. Perferendis itaque, porro enim.
    </div>
  </v-container>
</template>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.container {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  grid-template-rows: minmax(20px, auto);
  grid-auto-columns: 10% 40% 40% 10%;
  grid-auto-rows: minmax(100px, auto);
  grid-template-areas:
  "header header header1 header1"
  "body1 body1 body1 body1"
  "body2 body2 body2 body2"
  "footer footer footer footer";
  justify-items: stretch;
  align-items: stretch;
  justify-content: space-around;
  align-content: space-around;

  background-color: #8cffa0;
  height: 100%;
  width: 100%;
  box-sizing: border-box;
  grid-gap: 5px;
}
.part {
  background-color: blue;
  grid-area: header;
  font-size: 20px;
  padding: 10px;
}
.part-1 {
  background-color: yellow;
  grid-area: header1;
  padding: 10px;
}
.part-2 {
  background-color: red;
  grid-area: body1;
  padding: 20px;
}
.part-3 {
  background-color: green;
  grid-area: body2;
  font-size: 20px;
  font-family: sans-serif;
  font-weight: bolder;
  padding: 30px;
}
.part-4 {
  background-color: #E8CA26;
  grid-area: footer;
  padding: 10px;
  text-align: center;
  font-size: 20px;
}
.part-5 {
  grid-column-start: 2;
  grid-column-end: span 3;
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
div {
  background-color: blue;
  font-size: 15px;
  font-family: monospace;
  text-align: center;
  padding: 50px;
  padding-top: 100px;
}
</style>
