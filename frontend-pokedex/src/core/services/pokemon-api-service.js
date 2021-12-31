import http from "./http-common";

class PokemonApiService {
    getAllPokemons(offset, limit) {
        return http.get("/pokemon", { params: { offset: offset, limit: limit }});
    }

    getPokemonByName(name) {
        return http.get(`/pokemon/${name}`);
    }

    getPokemonSpeciesById(id) {
        return http.get(`/pokemon-species/${id}`);
    }
}

export default new PokemonApiService();