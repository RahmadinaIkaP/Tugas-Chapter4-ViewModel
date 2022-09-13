package binar.academy.tugas_viewmodel_activity.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import binar.academy.tugas_viewmodel_activity.databinding.ItemBeritaBinding
import binar.academy.tugas_viewmodel_activity.model.Berita

class BeritaAdapter(private var listBerita : ArrayList<Berita>) :
    RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder>() {

    var onClick : ((Berita) -> Unit)? = null

    inner class BeritaViewHolder(private val binding : ItemBeritaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(berita: Berita){
            binding.run {
                tvJudulBerita.text = berita.judul
                tvJurnalis.text = berita.namaJurnalis
                tvTanggalPublish.text = berita.tanggalPublish
                ivBerita.setImageResource(berita.imgBerita)
                itemView.setOnClickListener {
                    onClick?.invoke(berita)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaViewHolder {
        val view = ItemBeritaBinding.inflate(LayoutInflater
            .from(parent.context), parent, false)
        return BeritaViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaViewHolder, position: Int) {
        val berita = listBerita[position]
        holder.bind(berita)
    }

    override fun getItemCount() = listBerita.size

    fun setData(data : ArrayList<Berita>){
        this.listBerita = data
    }
}