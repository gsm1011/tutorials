<template>
  <v-app>
    <v-navigation-drawer
      width="250"
      class="blue-grey darken-4"
      persistent
      dark
      :mini-variant="miniVariant"
      :clipped="clipped"
      v-model="drawer"
      enable-resize-watcher
      fixed
      app
    >
    <v-toolbar flat class="transparent" dense>
        <v-list class="pa-0" :class="{'list-border-bottom' : miniVariant}">
            <v-list-tile>
                <v-list-tile-action v-if="!miniVariant">
                    <v-icon large color="orange">invert_colors</v-icon>
                </v-list-tile-action>
                <v-list-tile-content v-if="!miniVariant">
                    <v-list-tile-title><h2>CSS Grid</h2></v-list-tile-title>
                </v-list-tile-content>
                <v-list-tile-action>
                    <v-btn icon @click.stop="miniVariant = !miniVariant">
                        <v-icon v-html="miniVariant ? 'chevron_right' : 'chevron_left'"></v-icon>
                    </v-btn>
                </v-list-tile-action>
            </v-list-tile>
        </v-list>
    </v-toolbar>

      <v-list>
        <v-list-tile
          value="true"
          v-for="(item, i) in items"
          :to="item.link"
          :key="i"
        >
          <v-list-tile-action>
            <v-icon v-html="item.icon"></v-icon>
          </v-list-tile-action>
          <v-list-tile-content>
            <v-list-tile-title v-text="item.title"></v-list-tile-title>
          </v-list-tile-content>
        </v-list-tile>
      </v-list>
    </v-navigation-drawer>

    <v-toolbar app color="primary" flat>
      <v-spacer></v-spacer>
      <v-toolbar-title v-text="title"></v-toolbar-title>
    </v-toolbar>

    <v-content>
      <router-view/>
    </v-content>
    <v-footer :fixed="fixed" app>
      <v-layout row justify-center wrap class="footer">
        <span>Shumin Guo <strong>Tutorials</strong> &copy; 2018</span>
      </v-layout>
    </v-footer>
  </v-app>
</template>

<script>
export default {
  data () {
    return {
      clipped: false,
      drawer: true,
      fixed: false,
      items: [{
        icon: 'grade',
        title: 'Login',
        link: '/login'
      }, {
        icon: 'home',
        title: 'Home',
        link: '/'
      }, {
        icon: 'chat',
        title: 'Grid1',
        link: '/grid1'
      }, {
        icon: 'business',
        title: 'Grid2',
        link: '/grid2'
      }, {
        icon: 'phone',
        title: 'Zhengdao',
        link: '/zhengdao'
      }, {
        icon: 'phone',
        title: 'Table',
        link: '/grid3'
      }, {
        icon: 'person',
        title: 'About',
        link: '/about'
      }],
      miniVariant: true,
      title: 'CSS Grid Tutorials using VUE PWA.'
    }
  },
  name: 'App'
}
</script>

<style media="screen">
.footer {
  background-color: blue-grey, darken-4;
  font-size: 20px;
  padding: 30px;
}

</style>
