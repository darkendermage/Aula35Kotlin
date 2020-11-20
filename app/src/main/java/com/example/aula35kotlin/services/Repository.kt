package com.example.aula35kotlin.services

import com.example.aula35kotlin.models.Aluno
import com.example.aula35kotlin.models.Auxiliar
import com.example.aula35kotlin.models.Produto
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {

    @GET("sort/aluno")
    suspend fun getAlunoSortRepo() : Aluno

    @GET("alunos")
    suspend fun getAllAlunosRepo() : List<Aluno>

    @GET("produtos")
    suspend fun getProduto() : Produto

    @GET("produtos")
    suspend fun getAllProdutos() : Auxiliar


}

val retrofit = Retrofit.Builder()
    .baseUrl("https://promoios.com.br/api/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val service: Service = retrofit.create(Service::class.java)