package com.lifeistech.android.apisample.domain.repository

import io.reactivex.Observable

interface ItemRepository {

    fun getItems(page: Int, perPage: Int) : Observable<List<Item>>

}

