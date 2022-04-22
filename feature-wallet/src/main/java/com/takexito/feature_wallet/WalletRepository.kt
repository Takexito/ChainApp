package com.takexito.feature_wallet

interface WalletRepository {
    fun walletBalance(walletId: String): Int

    class Base:WalletRepository{
        override fun walletBalance(walletId: String): Int {
            return 1000
        }

    }
}