package com.example.dictionary.feature_dictionary.data.utils

import java.lang.reflect.Type

interface JsonParser {

    fun <T> fromJson(json: String, type:Type): T?
    // method to convert a JSON string to an
    // object of type T

    fun <T> toJson(obj: T, type: Type): String?
    // Method to convert an object of type T
    // to a Json String.
}