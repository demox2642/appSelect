package com.example.appselect.di

import com.example.appselect.presentation.di.presentationModule
import com.example.domain.di.domainModule

val koinModules = listOf(
    presentationModule,
    domainModule
)
