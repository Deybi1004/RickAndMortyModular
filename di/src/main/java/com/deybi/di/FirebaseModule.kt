package com.deybi.di

import com.deybi.firebase.auth.FirebaseAuthService
import com.deybi.firebase.auth.FirebaseAuthServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class FirebaseModule {

    @Binds
    @Singleton
    abstract fun bindFirebaseAuthService(
        impl: FirebaseAuthServiceImpl
    ): FirebaseAuthService
}