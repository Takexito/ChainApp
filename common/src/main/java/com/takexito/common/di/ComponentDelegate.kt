package com.takexito.common.di

interface Component {
    fun initDependencies()
    fun deInitDependencies()
}