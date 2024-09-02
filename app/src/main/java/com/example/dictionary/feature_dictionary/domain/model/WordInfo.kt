package com.example.dictionary.feature_dictionary.domain.model

data class WordInfo(
    val phonetic: String,
    val origin: String,
    val word: String,
    val meanings: List<Meaning>
)
