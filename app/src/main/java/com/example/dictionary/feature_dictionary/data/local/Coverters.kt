package com.example.dictionary.feature_dictionary.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.dictionary.feature_dictionary.data.utils.JsonParser
import com.example.dictionary.feature_dictionary.domain.model.Meaning
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class Coverters(
    private val jsonParser: JsonParser
) {
    // room does not support complex data types.
    // here we convert data to and fro JSON strings.
    @TypeConverter
    fun fromMeaningsJson(json:String): List<Meaning>{
        return jsonParser.fromJson<List<Meaning>>(
            json,
            object: TypeToken<ArrayList<Meaning>>(){}.type
        )?: emptyList()
    }

    @TypeConverter
    fun toMeaningsJson(meaning:List<Meaning>):String {
        return jsonParser.toJson(
            meaning,
            object : TypeToken<ArrayList<Meaning>>(){}.type
        )?: "[]"
    }
}