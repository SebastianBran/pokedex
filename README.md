# Web Services - PokeApi - Spring Boot

## Usage

1. Clone the repository

```
    git clone https://github.com/SebastianBran/pokedex.git
```

2. Open the proyect in you IDE

```
    pokedex\web-services
```

## Endpoints

### GET

* /pokemon

```
    getPokemons(@RequestParam Integer offset, @RequestParam Integer limit)
```

* /pokemon/{name}

```
    getPokemonByName(@PathVariable String name)
```

* /pokemon-species/{id}

```
    getPokemonSpeciesById(@PathVariable Integer id)
```

## Documentation

Documentation with swagger

```
    http://localhost:8080/web-service-poke-api-docs-ui.html
```

# Fronent Web Application - Pokedex - Vue.js

## Usage

1. Clone the repository

```
    git clone https://github.com/SebastianBran/pokedex.git
```

2. Open the proyect in you IDE

```
    pokedex\frontend-pokedex
```

3. Install dependencies

```
    npm install
```

4. Compile for development

```
    npm run serve
```

5. Open localhost in your browser

```
    http://localhost:4200/
```

## Views

* /
* /pokemons
* /pokemons/information/:name