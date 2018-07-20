<template>
  <v-container class="container">
    <v-layout justify-center>
      <div class="part">
        <h1>About me</h1>
        <p>
          This is the about me page.
          <br>
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia earum mollitia ullam molestiae unde odit, repellat at? Aut provident aspernatur magnam, quia eveniet. Amet, excepturi incidunt accusamus, rerum praesentium beatae sapiente, architecto, enim magnam voluptatem nobis id itaque. Iure est optio velit dolorum incidunt. Adipisci repellendus quos vitae aliquam, praesentium officiis illo repudiandae necessitatibus maxime quam itaque ullam quod temporibus id quia minus amet, architecto doloremque reiciendis distinctio dignissimos saepe veritatis. Atque consectetur quibusdam, dolores eius perspiciatis nesciunt labore hic eligendi. Iure numquam officiis ducimus illo doloremque modi, molestias est, ab quam rerum provident nulla possimus iste aliquam eligendi odit.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Provident autem nesciunt eos, optio molestiae, natus repellat fugiat ex corrupti dolorum commodi eum atque neque excepturi quas, consequuntur animi quasi id.
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolor ipsam expedita facilis sint molestiae commodi soluta, repudiandae voluptatibus vel voluptates impedit illum voluptas ad velit sit porro nobis magni odit.
        </p>
        <p>
          Go to <a href="grid1">Grid one</a>. 
        </p>
      </div>
    </v-layout>
  </v-container>
</template>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.container {
  display: grid;
  grid-template-columns: 1fr;
  height: 100%;
  width: 100%;
  box-sizing: border-box;
  grid-gap: 1px;
}
.part {
  grid-column: 1/2;
  font-size: 20px;
  padding: 10px;
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
