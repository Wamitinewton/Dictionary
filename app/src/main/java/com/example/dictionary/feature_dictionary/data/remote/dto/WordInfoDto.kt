package com.example.dictionary.feature_dictionary.data.remote.dto

import com.example.dictionary.feature_dictionary.data.local.entity.WordInfoEntity
import com.example.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String,
    val origin: String,
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            phonetic = phonetic,
            origin = origin,
            word = word,
            meanings = meanings.map { it.toMeaning() }

        )
    }


}