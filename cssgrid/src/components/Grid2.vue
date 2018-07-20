<template>
  <v-container class="container">
    <div class="part">
      Lorem ipsum dolor sit amet.
    </div>
    <div class="part-1">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ex voluptatem at itaque voluptates tempora, dicta assumenda! Qui itaque quia rem praesentium aut vel earum quod. Cupiditate modi reprehenderit harum dolore voluptatibus, vitae odio ex, sit, rem asperiores culpa, sapiente ut magnam aspernatur maiores qui expedita odit laboriosam impedit. Tenetur possimus architecto ad numquam a autem neque est atque, culpa fugiat quod similique, quae voluptas minima recusandae, perferendis praesentium perspiciatis laborum molestiae velit. Enim ipsa nemo doloremque labore quibusdam, unde fugiat! Cum illum eum eveniet quidem, velit dignissimos rerum tempora maiores, omnis saepe, sed quo ratione cupiditate aperiam aspernatur quisquam repellendus.
    </div>
    <div class="part-2">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, quo odio quis quas quia. Ab voluptatem voluptatibus repudiandae omnis nihil, laudantium odit laborum optio, ex nam animi dicta, voluptas beatae accusamus ut vitae illum alias deserunt? Obcaecati numquam odio labore, hic eligendi et! Dolorem laboriosam obcaecati eius maxime eligendi, sed harum rerum enim quis deserunt cupiditate aliquid, tenetur nobis aperiam veniam, perferendis illum amet. Dolore laboriosam deleniti, id culpa omnis quaerat aspernatur obcaecati voluptatibus vel nemo est qui consequuntur, voluptatem perspiciatis facilis vero eum dicta vitae doloremque. Numquam molestias esse, quia. Rerum nulla similique molestias voluptates enim ducimus et eos ipsam autem, numquam consequuntur. Nobis ut corporis laudantium quidem ipsum quae quisquam, magni odio temporibus asperiores modi, esse laborum quaerat placeat non iusto ratione iste libero sunt dignissimos omnis vitae. Aliquid id quia tempore debitis, ipsum suscipit quo ab eveniet! Soluta dolores deserunt, placeat animi cupiditate, nesciunt molestiae atque recusandae totam, quas numquam nam sint error quia quam nobis deleniti mollitia alias impedit optio culpa. Cupiditate neque doloremque odit repellat hic molestiae sequi sit necessitatibus delectus dicta! Porro voluptatum vel perferendis ullam odio ab animi officia tenetur! Quae voluptas doloremque labore ab odio, voluptate voluptatum illo consequuntur ratione quasi. Illum at pariatur
    </div>
    <div class="part-3">
      <img src="https://cdn.britannica.com/700x450/80/126680-004-73FCA2D2.jpg" alt="China">
    </div>
  </v-container>
</template>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.container {
  display: grid;
  grid-template-columns: 20% auto;
  grid-template-rows: minmax(100px, auto);
  background-color: #8cffa0;
  justify-items: stretch; 
  height: 100%;
  width: 100%;
  box-sizing: border-box;
  grid-gap: 5px;
}
.part {
  background-color: orange;
  grid-column: auto;
  font-size: 20px;
  padding: 30px;
}
.part-1 {
  background-color: teal;
  grid-column-start: 2;
  grid-column-end: span 3;
  font-size: 20px;
  font-family: sans-serif;
  font-weight: bolder;
  padding: 50px;
}
.part-2 {
  background-color: teal;
  grid-row-start: 2;
  grid-row-end: span 2;
  grid-column-start: 2;
  grid-column-end: span 3;
  font-size: 15px;
  text-align: justify-space-between;
  padding: 50px;
}
.part-3 {
  grid-row-start: 4;
  grid-column-start: 2;
  box-sizing: border-box;
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
