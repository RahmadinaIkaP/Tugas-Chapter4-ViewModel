package binar.academy.tugas_viewmodel_navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import binar.academy.tugas_viewmodel_navigationcomponent.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private var _binding : FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val args : DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBackHome.setOnClickListener {
            Navigation.findNavController(view).navigateUp()
        }

        val dataBerita = args.dataBerita

        binding.run {
            tvJudulDetail.text = dataBerita.judul
            tvJurnalisDetail.text = dataBerita.namaJurnalis
            tvTanggalDetail.text = dataBerita.tanggalPublish
            ivBeritaDetail.setImageResource(dataBerita.imgBerita)
            tvIsiBerita.setText(dataBerita.isiBerita)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}