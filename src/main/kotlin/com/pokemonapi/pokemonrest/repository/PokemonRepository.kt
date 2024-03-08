package com.pokemonapi.pokemonrest.repository

import com.pokemonapi.pokemonrest.entity.PokemonEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PokemonRepository: JpaRepository<PokemonEntity, Int>