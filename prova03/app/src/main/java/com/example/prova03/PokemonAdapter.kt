package com.example.prova03

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PokemonAdapter(private val pokemonList: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_pokemon, parent, false)
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = pokemonList[position]
        holder.tvPokemonName.text = pokemon.Name
        holder.tvPokemonType.text = pokemon.Type
        holder.imgPokemon.setImageResource(pokemon.ImageResId)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPokemon: ImageView = itemView.findViewById(R.id.pkm_img)
        val tvPokemonName: TextView = itemView.findViewById(R.id.tv_pkm_name)
        val tvPokemonType: TextView = itemView.findViewById(R.id.tv_pkm_type)
    }
}