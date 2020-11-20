package com.example.aula35kotlin.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Auxiliar(@SerializedName("produtos") @Expose var listProdSlid: List<Produto>) {
}