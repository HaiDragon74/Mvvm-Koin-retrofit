package com.example.dependencyinjection.di

import com.example.dependencyinjection.MyViewModel
import com.example.dependencyinjection.network.ApiService
import com.example.dependencyinjection.network.MealRepository
import com.example.dependencyinjection.network.MealRepositorySource
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Module() {
    val module = module {
        single {
            val retrofit= Retrofit.Builder()
                .baseUrl("https://www.themealdb.com/api/json/v1/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create(ApiService::class.java)
        }
        viewModel { MyViewModel(get()) }
        //lay (constructor viewmodel la interface)
        single<MealRepositorySource> { MealRepository(get()) }
        //lay interface (constructor viewmodel la class)
        /*single { MealRepository(get()) }*/

    }
}