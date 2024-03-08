package com.pokemonapi.pokemonrest.mapper

import com.pokemonapi.pokemonrest.dto.PokemonDTO
import com.pokemonapi.pokemonrest.entity.PokemonEntity

fun PokemonDTO.toEntity() = PokemonEntity(
        id = id,
        name = name
)

fun PokemonEntity.toDTO() = PokemonDTO(
        id = id,
        name = name
)