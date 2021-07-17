package io.realworld.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticlesResponse(
    @Json(name = "articles")
    val articles: List<ArticleX>,
    @Json(name = "articlesCount")
    val articlesCount: Int
)