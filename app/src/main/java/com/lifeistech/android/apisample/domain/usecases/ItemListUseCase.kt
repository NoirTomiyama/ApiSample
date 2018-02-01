package com.lifeistech.android.apisample.domain.usecases

import com.lifeistech.android.apisample.domain.entities.Item
import com.lifeistech.android.apisample.domain.repositories.ItemRepository
import io.reactivex.Observable


class ItemListUseCase(val itemRepository: ItemRepository) {

    fun loadItemList(currentList: List<Item>, page: Int, perPage: Int) {
        itemRepository.getItems(page = page, perPage = perPage)
                .map { receivedItems ->
                    currentList + receivedItems
                }
    }
}