package com.example.pizzafacil

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pizzafacil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var clicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAll.setOnClickListener {
            clicked=true
            if (clicked){
                binding.btAll.setBackgroundResource(R.drawable.bg_button_enabled)
                binding.btAll.setTextColor(Color.WHITE)
                binding.btChicken.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btChicken.setTextColor(R.color.dark_gray)
                binding.btKebab.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btKebab.setTextColor(R.color.dark_gray)
                binding.btPizza.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btPizza.setTextColor(R.color.dark_gray)
                binding.recyclerViewProducts.visibility= View.INVISIBLE
                binding.txtListTitle.text = "All"

            }
        }

        binding.btChicken.setOnClickListener {
            clicked=true
            if (clicked){
                binding.btChicken.setBackgroundResource(R.drawable.bg_button_enabled)
                binding.btChicken.setTextColor(Color.WHITE)
                binding.btAll.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btAll.setTextColor(R.color.dark_gray)
                binding.btKebab.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btKebab.setTextColor(R.color.dark_gray)
                binding.btPizza.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btPizza.setTextColor(R.color.dark_gray)
                binding.recyclerViewProducts.visibility= View.INVISIBLE
                binding.txtListTitle.text = "Chicken"

            }
        }


    }
}