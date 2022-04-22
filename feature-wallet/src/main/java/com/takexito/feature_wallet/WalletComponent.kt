package com.takexito.feature_wallet

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Scope


@Scope
annotation class WalletScope

@WalletScope
@Component(modules = [WalletModule::class])
interface WalletComponent {
    fun inject(walletFragment: WalletFragment)
}

@Module
class WalletModule{

    @Provides
    fun bindWalletRepository(): WalletRepository = WalletRepository.Base()

}