package com.pokemonapi.pokemonrest.service

import com.pokemonapi.pokemonrest.dto.PokemonDTO
import com.pokemonapi.pokemonrest.entity.PokemonEntity
import com.pokemonapi.pokemonrest.mapper.toEntity
import com.pokemonapi.pokemonrest.repository.PokemonRepository
import org.springframework.stereotype.Service


@Service
class PokemonServiceImpl(
        private val pokemonRepository: PokemonRepository
) : PokemonService {

    override fun savePokemon(pokemonDTO: PokemonDTO) {
        pokemonRepository.save(pokemonDTO.toEntity())
    }

    override fun getAllPokemon(): List<PokemonEntity> {
        return pokemonRepository.findAll().toList()
    }

    override fun deletePokemon(id: Int) {
        pokemonRepository.deleteById(id)
    }

    override fun updatePokemon(id: Int, newPokemonName: String) {
        val savedPokemon = pokemonRepository.findById(id).orElseThrow {
            NoSuchElementException("Pokemon with id $id not found")
        }

        savedPokemon.name = newPokemonName
        pokemonRepository.save(savedPokemon)
    }
}