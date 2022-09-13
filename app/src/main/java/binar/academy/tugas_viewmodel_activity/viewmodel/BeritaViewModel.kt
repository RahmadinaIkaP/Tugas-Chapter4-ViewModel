package binar.academy.tugas_viewmodel_activity.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import binar.academy.tugas_viewmodel_activity.R
import binar.academy.tugas_viewmodel_activity.model.Berita

class BeritaViewModel : ViewModel() {

    val vmBeritaList : MutableLiveData<List<Berita>> = MutableLiveData()

    val listBerita = arrayListOf(
        Berita(
            "Hotman Paris Bicara Hukuman yang Pantas untuk Ferdy Sambo", "13 Sep 2022",
            "Tim detikcom",
            R.string.isi_berita1,
            R.drawable.hotman_paris
        ),
        Berita(
            "Anggunnya Member NewJeans Berpose dalam Hanbok untuk Sambut Chuseok",
            "11 Sep 2022",
            "Ratnaning Asih",
            R.string.isi_berita2,
            R.drawable.newjeans_hanbok
        ),
        Berita(
            "Pasar Kripto Kembali Cerah, Ini Sentimen Pendorongnya Sepekan ke Depan",
            "12 Sep 2022",
            "Gagas Yoga Pratomo",
            R.string.isi_berita3,
            R.drawable.bitcoin
        ),
        Berita(
            "BBM Naik, Tarif Jip Wisata Bromo dari Malang Melonjak hingga Rp 100.000 Per Paket",
            "13 Sep 2022",
            "Imron Hakiki",
            R.string.isi_berita4,
            R.drawable.bromo
        ),
        Berita(
            "Fans Rayakan Hari Kelahiran Yeonjun TXT, Intip Kemeriahannya!",
            "13 Sep 2022",
            "Tim WowKeren",
            R.string.isi_berita5,
            R.drawable.yeonjun
        ),
        Berita(
            "Ratu Elizabeth Wafat, Netizen Heboh Pelangi Hiasi Istana Buckingham",
            "09 Sep 2022",
            "CNN Indonesia",
            R.string.isi_berita6,
            R.drawable.pelangi_istana_buckingham
        ),
        Berita(
            "Demo BBM di Patung Kuda Ricuh, Botol Air Terbang ke Arah Aparat",
            "13 Sep 2022",
            "CNN Indonesia",
            R.string.isi_berita7,
            R.drawable.demo_bbm
        ),
        Berita(
            "Keren! Ngeri-Ngeri Sedap Dikirim ke Oscar",
            "13 Sep 2022",
            "Atmi Ahsani Yusron",
            R.string.isi_berita8,
            R.drawable.poster_film
        ),
        Berita(
            "NCT 127 Konser di Jakarta, Tiket Mulai Rp 1 Jutaan",
            "12 Sep 2022",
            "Delia Arnindita",
            R.string.isi_berita9,
            R.drawable.nct
        ),
        Berita(
            "Anggota Tim Khusus Bentukan Jokowi untuk Respons Serangan Bjorka",
            "13 Sep 2022",
            "Tim 20Detik",
            R.string.isi_berita10,
            R.drawable.bjorka
        )
    )

    fun getDataBerita(){
        vmBeritaList.value = listBerita
    }

}