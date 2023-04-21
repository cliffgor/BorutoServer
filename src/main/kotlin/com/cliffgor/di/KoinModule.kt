package com.cliffgor.di

import com.cliffgor.repository.HeroRepository
import com.cliffgor.repository.HeroRepositoryImplimentation
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImplimentation()
    }
}