package pl.senordeveloper.insertkoinsavedstatehandle

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import pl.senordeveloper.insertkoinsavedstatehandle.databinding.MasterFragmentBinding
import java.lang.IllegalStateException

class MasterFragment: Fragment(R.layout.master_fragment) {
    private val masterFragmentBinding by lazy {
        view?.let(MasterFragmentBinding::bind) ?: throw IllegalStateException("View was null")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        masterFragmentBinding.button.setOnClickListener {
            val action = MasterFragmentDirections.actionMasterFragmentToDetailFragment(message = masterFragmentBinding.editText.text.toString())
            findNavController().navigate(action)
        }
    }
}