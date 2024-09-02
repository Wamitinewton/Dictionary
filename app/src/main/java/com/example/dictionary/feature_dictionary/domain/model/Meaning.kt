package com.example.dictionary.feature_dictionary.domain.model

import com.example.dictionary.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
  val defination: List<Defination>,
    val partOfSpeech: String
)
