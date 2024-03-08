package com.pokemonapi.pokemonrest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokemonRestApplication

fun main(args: Array<String>) {
	runApplication<PokemonRestApplication>(*args)
}
