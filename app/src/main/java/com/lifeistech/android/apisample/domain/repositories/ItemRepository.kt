package com.lifeistech.android.apisample.domain.repositories

import com.lifeistech.android.apisample.domain.entities.Item
import io.reactivex.Observable

interface ItemRepository {

    fun getItems(page: Int, perPage: Int) : Observable<List<Item>>

}

