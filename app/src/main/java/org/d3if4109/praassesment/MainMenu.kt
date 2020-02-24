package org.d3if4109.praassesment


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4109.praassesment.databinding.ActivityMainBinding
import org.d3if4109.praassesment.databinding.FragmentMainMenuBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainMenu : Fragment() {

//    private lateinit var binding: FragmentMainMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding = DataBindingUtil.inflate<FragmentMainMenuBinding>(
            inflater, R.layout.fragment_main_menu, container, false)

        binding.btPersegiPanjang.setOnClickListener {view: View ->
            view.findNavController().navigate(
                R.id.action_mainMenu_to_persegiPanjang
            )
        }

        binding.btSegitiga.setOnClickListener {view: View ->
            view.findNavController().navigate(
                R.id.action_mainMenu_to_segitiga
            )
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,
            view!!.findNavController()) ||  super.onOptionsItemSelected(item)
    }
}
