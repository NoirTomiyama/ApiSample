package com.lifeistech.android.apisample.domain.entities

/**
 * Created by RyotaTomiyama on 2018/02/01.
 */
data class User (
    val id:String = "",
    val name:String = "",
    val profile_image_url:String = "",
    val followees_count: Int = 0,
    val followers_count: Int = 0
)
