package com.lifeistech.android.apisample.domain.entity

data class Item(
        val id: String = "",
        val body: String = "",
        val comments_count: Int = 0,
        val created_at: String = "",
        val likes_count: Int = 0,
        val reactions_count: Int = 0,
        val url:String = "",
        val user: User
)