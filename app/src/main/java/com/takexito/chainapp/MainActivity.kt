package com.takexito.chainapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.takexito.feature_wallet.DaggerWalletComponent
import com.takexito.feature_wallet.WalletComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        findViewById<FragmentContainerView>(R.id.fragment_container)
    }
}