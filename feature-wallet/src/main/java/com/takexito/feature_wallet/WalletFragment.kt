package com.takexito.feature_wallet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.takexito.feature_wallet.databinding.WalletFragmentBinding
import javax.inject.Inject

class WalletFragment : Fragment() {

    private lateinit var viewModel: WalletViewModel
    private lateinit var walletComponent: WalletComponent

    private val binding: WalletFragmentBinding
    get() = _binding ?: throw IllegalStateException("WalletFragmentBinding is null")
    private var _binding: WalletFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        walletComponent = DaggerWalletComponent.create()
        walletComponent.inject(this)
        _binding = WalletFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.calculateButton.setOnClickListener {
            val res = viewModel.getWalletBalance("123")
            binding.walletValueTextView.text = res.toString()
        }
    }

    @Inject
    internal fun initViewModel(factory: WalletViewModel.Factory){
        viewModel = ViewModelProvider(this, factory).get(WalletViewModel::class.java)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}