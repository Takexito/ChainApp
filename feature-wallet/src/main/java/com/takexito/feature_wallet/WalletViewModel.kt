package com.takexito.feature_wallet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

internal class WalletViewModel(
    private val walletRepository: WalletRepository
) : ViewModel() {

    fun getWalletBalance(walletId: String): Int{
        return walletRepository.walletBalance(walletId)
    }

    class Factory @Inject constructor(
        private val walletRepository: WalletRepository
    ) : ViewModelProvider.Factory {

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//            require(modelClass == WalletViewModel::class)
            return WalletViewModel(walletRepository) as T
        }
    }
}