package com.pokemonapi.pokemonrest.web.rest

import com.pokemonapi.pokemonrest.dto.PokemonDTO
import com.pokemonapi.pokemonrest.service.PokemonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pokemon/")
class PokemonResource(
        private val pokemonService: PokemonService
) {

    @PostMapping
    fun savePokemon(@RequestBody pokemonDTO: PokemonDTO) {
        pokemonService.savePokemon(pokemonDTO)
    }

    @GetMapping
    fun getAllPokemon() = pokemonService.getAllPokemon()

    @DeleteMapping("/{id}/")
    fun deletePokemon(@PathVariable id: Int) { pokemonService.deletePokemon(id) }

    @PutMapping("/{id}/")
    fun updatePokemon(@PathVariable id: Int, @RequestParam name: String) {
        pokemonService.updatePokemon(id, name)
    }
}