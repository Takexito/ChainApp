package com.takexito.feature_wallet

import com.takexito.common.Feature

class WalletFeature : Feature {
    private var _walletComponent: WalletComponent? = null
    val walletComponent: WalletComponent
        get() = _walletComponent ?: throw IllegalStateException("Wallet component is null")

    override fun init() {
        _walletComponent = DaggerWalletComponent.create()
    }

    override fun deInit() {
        _walletComponent = null
    }
}