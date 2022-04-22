package com.takexito.chainapp.presentation.ui

import android.app.Application
import android.content.Context
import com.takexito.chainapp.presentation.di.AppComponent
import com.takexito.chainapp.presentation.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .setDependencies(Base(applicationContext))
            .build()
    }

    class Base(override val context: Context): AppComponent.Dependencies
}