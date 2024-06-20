package com.example.prova03

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.prova03.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var home : HomeFragment
    private lateinit var perfil : ProfileFragment

    private var previousSelectedItem: Int = R.id.bottomnav_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.actionbar)

        // Instanciando os fragmentos utilizados
        home = HomeFragment.instance()
        perfil = ProfileFragment.instance()

        // Seta qual fragmento sera o padrao
        switchFragment(home)

        // Implementa a funcionalidade dos botoes do bottom navigation buttons
        binding.bottomnav.setOnItemSelectedListener {
            var isHandled = true
            when(it.itemId){
                R.id.bottomnav_home -> {
                    switchFragment(home)
                    previousSelectedItem = R.id.bottomnav_home
                }
                R.id.bottomnav_map -> {
                    val latitude = -25.42430438493774
                    val longitude = -49.317870217580115
                    val query = "Universidade Tuiuti do Paraná"

                    // Criando uma Uri de uma string de intent. Usando o resultado para criar uma Intent.
                    val gmmIntentUri = Uri.parse("geo:$latitude,$longitude?q=${Uri.encode(query)}")

                    // Cria uma Intent de uma gmmIntentUri. Seta a ação para ACTION_VIEW
                    val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)

                    // Faz o Intent ser explicito setando a package como Google Maps package
                    mapIntent.setPackage("com.google.android.apps.maps")

                    // Tenta iniciar uma atividade que consegue lidar com o Intent
                    startActivity(mapIntent)
                }
                R.id.bottomnav_camera -> {
                    val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    try {
                        startActivityForResult(takePictureIntent, 1)
                    } catch (e: ActivityNotFoundException) {
                        onError(e.message)
                    }
                }
                R.id.bottomnav_profile -> {
                    switchFragment(perfil)
                    previousSelectedItem = R.id.bottomnav_profile
                }
                else -> isHandled = false
            }
            isHandled
        }
    }

    override fun onResume() {
        super.onResume()
        // Se o usuário utiliza os botões que o levam para outro app, ele é levado para a ultíma tela vizualizada
        binding.bottomnav.selectedItemId = previousSelectedItem
    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)    // Sets transition animation
            replace(R.id.main_fl, fragment)                             // Changes the fragment
            commit()
        }
    }

    // Tratativa de erro
    private fun onError(message: String?) {
        Toast.makeText(this, "ERRO: $message", Toast.LENGTH_SHORT).show()
    }
}