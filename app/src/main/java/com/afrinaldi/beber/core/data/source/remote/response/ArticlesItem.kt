package com.afrinaldi.beber.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ArticlesItem(

    @field:SerializedName("publishedAt")
    val publishedAt: String,

    @field:SerializedName("author")
    val author: String? = null,

    @field:SerializedName("urlToImage")
    val urlToImage: String? = null,

    @field:SerializedName("description")
    val description: String,

    @field:SerializedName("source")
    val source: Source,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("url")
    val url: String,

    @field:SerializedName("content")
    val content: String? = null
)

