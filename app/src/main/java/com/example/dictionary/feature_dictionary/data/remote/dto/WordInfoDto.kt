package com.example.dictionary.feature_dictionary.data.remote.dto

import com.example.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String,
    val origin: String,
) {
    fun toWordInfoentity(): WordInfo {
        return WordInfo(
            phonetic = phonetic,
            origin = origin,
            word = word,
            meanings = meanings.map { it.toMeaning() }

        )
    }


}