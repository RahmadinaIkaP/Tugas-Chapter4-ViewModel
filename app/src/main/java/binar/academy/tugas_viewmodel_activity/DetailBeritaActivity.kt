package binar.academy.tugas_viewmodel_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.academy.tugas_viewmodel_activity.databinding.ActivityDetailBeritaBinding
import binar.academy.tugas_viewmodel_activity.model.Berita

class DetailBeritaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackHome.setOnClickListener {
            onBackPressed()
        }

        val getData = intent.getParcelableExtra<Berita>("dataBerita") as Berita

        binding.run {
            tvJudulDetail.text = getData.judul
            tvJurnalisDetail.text = getData.namaJurnalis
            tvTanggalDetail.text = getData.tanggalPublish
            ivBeritaDetail.setImageResource(getData.imgBerita)
            tvIsiBerita.setText(getData.isiBerita)
        }
    }
}