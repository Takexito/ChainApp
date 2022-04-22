package com.takexito.chainapp.presentation.di

import android.content.Context
import com.takexito.chainapp.ResourceManager
import dagger.*
import javax.inject.Scope

@Scope
annotation class AppScope

@AppScope
@Component(modules = [AppModule::class], dependencies = [AppComponent.Dependencies::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        fun setDependencies(deps: Dependencies): Builder

        fun build(): AppComponent
    }

    interface Dependencies{
        val context: Context


    }
}

@Module
class AppModule {

    @Provides
    fun bindResourceManager(context: Context): ResourceManager = ResourceManager.Base(context)
}