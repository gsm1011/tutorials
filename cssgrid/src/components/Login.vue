<template lang="html">
  <v-container fill-height justify-center align-center class="login">

    <div class="loginform">
      <div class="loginicon">
        <img src="../../static/img/lock.png" width="80px" alt="Lock">
        <!-- <v-icon x-large color="teal darken-2">home</v-icon> -->
      </div>
      <h1>Welcome back!</h1>
      <div>
        <p>Log back into your account below.</p>
      </div>
      <v-text-field
        v-model="username"
        :counter="50"
        label="Username"
        required>
      </v-text-field>
      <v-text-field
        v-model="password"
        label="Password"
        type="password"
        required>
      </v-text-field>
      <v-checkbox v-model="remember" label="Remember Me"></v-checkbox>
      <v-btn block x-large class="login_btn" color="primary">
        Login
      </v-btn>
      <div class="forgotpass">
        <a href="/">Forgot password?</a>
      </div>

    </div>

  </v-container>
</template>

<script>
export default {
  props: {

  },
  data () {
    return {
      username: '',
      password: '',
      remember: ''
    }
  },
  methods: {

  },
  computed: {

  }
}
</script>

<style lang="css">
@supports (display: grid) {
  html,
  body {
    min-height: 100%;
    margin: 0;
    padding: 0;
  }

  .login {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    grid-template-rows: 30% 40% auto;
    grid-gap: 10px;
    background-color: #73A0C3;
  }
  .loginform {
    background-color: white;
    border: 1em;
    height: 600px;
    grid-column: 2/2;
    grid-row: 2/2;
    margin-top: 30%;
    margin-bottom: 30%;
    padding: 80px;
    border-radius: 10px;
  }
  .loginicon {
    height: 200px;
    width: 200px;
    text-align: center;
    background-color: white;
    font-size: 50px;
    border-radius: 50%;
    margin-left: 120px;
    margin-top: -150px;
    margin-bottom: 20px;
    padding: 50px;
  }
  div.loginform > h1 {
    text-align: center;
    color: #2A5F86;
  }
  div.loginform > div > p {
    text-align: center;
    padding-bottom: 20px;
  }
  .login_btn {
    margin-top: 30px;
    margin-bottom: 30px;
    display: block;
    color: green;
    font-size: 20px;
  }
  .forgotpass {
    font-size: 20px;
    font-family: sans-serif;
    text-align: center;
  }
}
</style>
