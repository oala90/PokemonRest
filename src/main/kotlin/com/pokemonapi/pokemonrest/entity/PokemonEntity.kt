package com.pokemonapi.pokemonrest.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class PokemonEntity(
        @Id
        var id: Int,
        var name: String
)
