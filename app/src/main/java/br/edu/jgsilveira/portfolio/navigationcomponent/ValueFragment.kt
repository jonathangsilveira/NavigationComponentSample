package br.edu.jgsilveira.portfolio.navigationcomponent


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_value.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [ValueFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ValueFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_value, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
        view.next.setOnClickListener {
            findNavController().navigate(R.id.descript)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment ValueFragment.
         */
        @JvmStatic
        fun newInstance( ) =
            ValueFragment().apply {
                arguments = Bundle()
            }
    }
}
