<template>
  <v-container class="text-center">
    <h1 class="display-2 font-weight-bold mb-4">Pokemons</h1>

    <v-progress-circular
        :size="70"
        :width="7"
        color="red"
        indeterminate
        class="mx-auto my-5"
        v-bind:class="[(pokemonListInfo.length === 0) ? '' : 'd-none']"
    ></v-progress-circular>

    <v-row>
      <v-col
          v-for="pokemon in pokemonListInfo"
          :key="pokemon.name"
          cols="12"
          sm="6"
          md="4"
          lg="3"
      >
        <PokemonCard
            v-bind:image-path="pokemon.sprites.front_default"
            v-bind:name="pokemon.name"
            v-bind:id="pokemon.id"
        ></PokemonCard>
      </v-col>
    </v-row>

    <template>
      <div class="text-center my-5">
        <v-pagination
            v-model="page"
            :length="paginationLength"
        ></v-pagination>
      </div>
    </template>
  </v-container>
</template>

<script>
import PokemonApiService from "@/core/services/pokemon-api-service";
import PokemonCard from "@/components/Pokemon-card";

export default {
  name: "Pokemons",
  components: {
    PokemonCard,
  },
  data() {
    return {
      pokemonList: [],
      pokemonListInfo: [],
      offset: 0,
      limit: 12,
      page: 1,
      paginationLength: 6
    }
  },
  methods: {
    async retrievePokemonListWithInfo() {
      await this.retrievePokemonList();

      let pokemonListInfo = [];

      for (let pokemon of this.pokemonList) {
        let pokemonInfo = await this.retrievePokemonInfo(pokemon);
        pokemonListInfo.push(pokemonInfo);
      }

      this.pokemonListInfo = pokemonListInfo;
    },
    async retrievePokemonList() {
      await PokemonApiService.getAllPokemons(this.offset, this.limit)
          .then(response => {
            this.paginationLength = Math.ceil(response.data.count / 12);
            this.pokemonList = response.data.results;
          })
          .catch(e => {
            console.log(e);
          });
    },
    async retrievePokemonInfo(pokemon) {
      let pokemonInfo;

      await PokemonApiService.getPokemonByName(pokemon.name)
          .then(response => {
            pokemonInfo = response.data;
          })
          .catch(e => {
            console.log(e);
          });

      return pokemonInfo;
    },
  },
  watch: {
    page: function (val) {
      this.offset = (val - 1) * this.limit;
      this.pokemonListInfo = [];
      this.retrievePokemonListWithInfo();
    }
  },
  mounted() {
    this.retrievePokemonListWithInfo();
  }
}
</script>

<style scoped>

</style>