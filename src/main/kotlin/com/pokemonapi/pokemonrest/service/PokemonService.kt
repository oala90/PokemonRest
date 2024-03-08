package com.pokemonapi.pokemonrest.service

import com.pokemonapi.pokemonrest.dto.PokemonDTO
import com.pokemonapi.pokemonrest.entity.PokemonEntity

interface PokemonService {
    fun savePokemon(pokemonDTO: PokemonDTO)
    fun getAllPokemon(): List<PokemonEntity>
    fun deletePokemon(id: Int)
    fun updatePokemon(id: Int, newPokemonName: String)
}