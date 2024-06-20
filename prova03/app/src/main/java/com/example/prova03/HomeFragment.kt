package com.example.prova03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prova03.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {
    private lateinit var binding : FragmentHomeBinding

    private lateinit var adapter: PokemonAdapter
    private lateinit var pokemonList: List<Pokemon>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout para esse fragmento
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.recyclerviewHome.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL,
            false,
        )

        // lista dos pokemons
        pokemonList = listOf(
            Pokemon("Arcanine", "Fogo", R.drawable.img_pkm_arcanine),
            Pokemon("Umbreon", "Sombrio", R.drawable.img_pkm_umbreon),
            Pokemon("Banette", "Fantasma", R.drawable.img_pkm_banette),
            Pokemon("Luxray", "Elétrico", R.drawable.img_pkm_luxray),
            Pokemon("Buizel", "Água", R.drawable.img_pkm_buizel),
            Pokemon("Regigigas", "Normal", R.drawable.img_pkm_regigigas),
            Pokemon("Wooloo", "Normal", R.drawable.img_pkm_wooloo)
        )

        adapter = PokemonAdapter(pokemonList)
        binding.recyclerviewHome.adapter = this.adapter

        return binding.root

    }

    companion object {
        @JvmStatic
        fun instance() = HomeFragment()
    }
}