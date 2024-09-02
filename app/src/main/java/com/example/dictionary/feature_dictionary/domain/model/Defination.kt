package com.example.dictionary.feature_dictionary.domain.model


data class Defination(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
)