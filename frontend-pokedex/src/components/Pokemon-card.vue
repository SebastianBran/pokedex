<template>
  <v-card :to="`pokemons/information/${name}`">
    <v-img :src="imagePath"></v-img>
    <v-card-title>{{ name }}</v-card-title>
    <v-card-subtitle class="text-start">Id: {{ id }}</v-card-subtitle>
  </v-card>
</template>

<script>
export default {
  name: "Pokemon-card",
  props: {
    imagePath: String,
    name: String,
    id: Number,
  }
}
</script>

<style scoped>

</style>