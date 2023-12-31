package com.example.pokedexcompose.pokemonDetail

import androidx.lifecycle.ViewModel
import com.example.pokedexcompose.data.remote.responses.Pokemon
import com.example.pokedexcompose.repository.PokemonRepository
import com.example.pokedexcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}