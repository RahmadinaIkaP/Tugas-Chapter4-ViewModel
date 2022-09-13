package binar.academy.tugas_viewmodel_navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.academy.tugas_viewmodel_navigationcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}