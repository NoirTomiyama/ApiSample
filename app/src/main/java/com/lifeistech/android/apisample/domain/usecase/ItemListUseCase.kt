package com.lifeistech.android.apisample.domain.usecase

import com.lifeistech.android.apisample.domain.entity.Item
import com.lifeistech.android.apisample.domain.repository.ItemRepository


class ItemListUseCase(val itemRepository: ItemRepository) {

    fun loadItemList(currentList: List<Item>, page: Int, perPage: Int) {
        itemRepository.getItems(page = page, perPage = perPage)
                .map { receivedItems ->
                    currentList + receivedItems
                }
    }
}