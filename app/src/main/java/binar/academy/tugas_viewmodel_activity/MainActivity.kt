package binar.academy.tugas_viewmodel_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.tugas_viewmodel_activity.adapter.BeritaAdapter
import binar.academy.tugas_viewmodel_activity.databinding.ActivityMainBinding
import binar.academy.tugas_viewmodel_activity.model.Berita
import binar.academy.tugas_viewmodel_activity.viewmodel.BeritaViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val viewModel : BeritaViewModel by viewModels()
    private lateinit var adapter: BeritaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDataBerita()
        viewModel.getDataBerita()
        viewModel.vmBeritaList.observe(this) {
            adapter.setData(it as ArrayList<Berita>)
        }
    }

    private fun setDataBerita() {
        adapter = BeritaAdapter(ArrayList())

        binding.rvBerita.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvBerita.adapter = adapter

        adapter.onClick = {
            val bundle = Bundle()
            bundle.putParcelable("dataBerita", it)

            val intent = Intent(this, DetailBeritaActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}