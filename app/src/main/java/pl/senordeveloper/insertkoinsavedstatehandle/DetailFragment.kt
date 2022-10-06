package pl.senordeveloper.insertkoinsavedstatehandle

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import org.koin.androidx.viewmodel.ext.android.sharedStateViewModel
import pl.senordeveloper.insertkoinsavedstatehandle.databinding.DetailFragmentBinding
import java.lang.IllegalStateException

class DetailFragment: Fragment(R.layout.detail_fragment) {
    private val detailFragmentBinding: DetailFragmentBinding by lazy {
        view?.let { DetailFragmentBinding.bind(it) } ?: throw IllegalStateException("View is null")
    }

    private val viewModel by sharedStateViewModel<DetailViewModel>(owner = {
    findNavController().currentBackStackEntry!!})

    private val viewModel2 by viewModels<DetailViewModel2>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // FIXME it crashes
        viewModel.message.observe(viewLifecycleOwner) {
            detailFragmentBinding.textView.text = it
        }

        viewModel2.message.observe(viewLifecycleOwner) {
            detailFragmentBinding.textView.text = it
        }
    }

}