package com.example.aula35kotlin.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aula35kotlin.models.Aluno
import com.example.aula35kotlin.models.Produto
import com.example.aula35kotlin.services.Service
import com.example.aula35kotlin.services.service
import kotlinx.coroutines.launch

class MainViewModel(service: Service): ViewModel() {

    val aluno = MutableLiveData<Aluno>()
    val listAlunos = MutableLiveData<List<Aluno>>()

    val produto = MutableLiveData<Produto>()
    val listProduto = MutableLiveData<List<Produto>>()

    fun getAlunoSort() {
        viewModelScope.launch {
                aluno.value = service.getAlunoSortRepo()
        }
    }

    fun getAllAlunos() {
        viewModelScope.launch {
            listAlunos.value = service.getAllAlunosRepo()
        }
    }

    fun getProduto() {
        viewModelScope.launch {
            produto.value = service.getProduto()
        }
    }

    fun getAllProduto() {
        viewModelScope.launch {
            listProduto.value = service.getAllProdutos().listProdSlid
        }
    }

}