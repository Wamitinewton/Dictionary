package com.example.dictionary.feature_dictionary.data.remote.dto

import com.example.dictionary.feature_dictionary.domain.model.Meaning

data class MeaningDto(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String,
) {
    fun toMeaning(): Meaning {
        return Meaning(
            defination = definitions.map { it.toDefination() },
            partOfSpeech = partOfSpeech
        )
    }
}