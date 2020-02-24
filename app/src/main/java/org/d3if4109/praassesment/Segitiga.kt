package org.d3if4109.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4109.praassesment.databinding.FragmentPersegiPanjangBinding
import org.d3if4109.praassesment.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Segitiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(
            inflater, R.layout.fragment_segitiga, container, false
        )

        binding.apply {
            btHitung.setOnClickListener {
                var alas = etAlas.text.toString().toFloat()
                var tinggi = etTinggi.text.toString().toFloat()
                var luas = 0.5*(alas*tinggi)
                var keliling = alas+tinggi+((alas*alas)+(tinggi*tinggi))
                tvNilaiLuas.text = luas.toString()
                tvNilaiKeliling.text = keliling.toString()
            }
        }
        return binding.root
    }


}
