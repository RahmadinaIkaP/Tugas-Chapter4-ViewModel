package binar.academy.tugas_viewmodel_navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.tugas_viewmodel_navigationcomponent.adapter.BeritaAdapter
import binar.academy.tugas_viewmodel_navigationcomponent.databinding.FragmentHomeBinding
import binar.academy.tugas_viewmodel_navigationcomponent.model.Berita
import binar.academy.tugas_viewmodel_navigationcomponent.viewmodel.BeritaViewModel

class HomeFragment : Fragment(), BeritaAdapter.BeritaInterface {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel : BeritaViewModel by viewModels()
    private lateinit var adapter : BeritaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setDataBerita()
        viewModel.getDataBerita()
        viewModel.vmBeritaList.observe(viewLifecycleOwner){
            adapter.setData(it as ArrayList<Berita>)
        }
    }

    private fun setDataBerita(){
        adapter = BeritaAdapter(ArrayList(), this)

        binding.run {
            rvBerita.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvBerita.adapter = adapter
        }
    }

    override fun onItemClick(berita: Berita) {
        var action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(berita)
        Navigation.findNavController(requireView()).navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}