<template>
  <v-container>
    <v-btn
        to="/pokemons"
        class="mx-2"
        color="primary"
    >
      <v-icon dark>
        mdi-arrow-left
      </v-icon>
    </v-btn>

    <h1 class="display-2 font-weight-bold mb-4 text-center">Information</h1>

    <v-row>
      <v-col
          cols="12"
          sm="6"
      >
        <v-card class="grey">
          <v-img :src="pokemonInformation.sprites.front_default"></v-img>
        </v-card>
      </v-col>
      <v-col
          class=""
          cols="12"
          sm="6"
      >
        <h1>{{ pokemonInformation.name }}</h1>
        <v-container class="green">
          <p class="white--text">
            Height: {{ pokemonInformation.height * 10 }} cm
          </p>
          <p class="white--text">
            Weight: {{ pokemonInformation.weight / 10 }} kg
          </p>
          <p class="white--text">
            Base experience: {{ pokemonInformation.base_experience }}
          </p>
        </v-container>
      </v-col>
    </v-row>

    <v-row>
      <v-col>

      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import PokemonApiService from "@/core/services/pokemon-api-service";

export default {
  name: "Information",
  data() {
    return {
      pokemonName: this.$route.params.name,
      pokemonInformation: {},
    }
  },
  methods: {
    async retrievePokemonInfo() {
      await PokemonApiService.getPokemonByName(this.pokemonName)
          .then(response => {
            this.pokemonInformation = response.data;
          })
          .catch(e => {
            console.log(e);
          });
    },
  },
  async mounted() {
    await this.retrievePokemonInfo();
  }
}
</script>

<style scoped>

</style>