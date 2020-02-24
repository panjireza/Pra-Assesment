package org.d3if4109.praassesment


import android.content.ActivityNotFoundException
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if4109.praassesment.databinding.ActivityMainBinding
import org.d3if4109.praassesment.databinding.FragmentMainMenuBinding
import org.d3if4109.praassesment.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjang : Fragment() {

    private var panjang = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(
            inflater, R.layout.fragment_persegi_panjang, container, false
        )

        binding.apply {
            btHitung.setOnClickListener {
                var panjang = etPanjang.text.toString().toInt()
                var lebar = etLebar.text.toString().toInt()
                var luas = panjang*lebar
                var keliling = 2*(panjang+lebar)
                tvNilaiLuas.text = luas.toString()
                tvNilaiKeliling.text = keliling.toString()
            }
        }
        return binding.root
    }

//    private fun onShare() {
//        val shareIntent = ShareCompat.IntentBuilder.from(get)
//            .setText(getString("aku", 2, 3))
//            .setType("text/plain")
//            .intent
//        try {
//            startActivity(shareIntent)
//        } catch (ex: ActivityNotFoundException) {
//            Toast.makeText(this, getString(R.string.sharing_not_available),
//                Toast.LENGTH_LONG).show()
//        }
//    }
}
