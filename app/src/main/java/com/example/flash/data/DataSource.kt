package com.example.flash.data

import androidx.annotation.StringRes
import com.example.flash.R

object DataSource {
    fun loadCategories(): List<Categories> {
        return listOf<Categories>(
            Categories(stringResourceId = R.string.fresh_fruits, imageResourceId = R.drawable.fruits),
            Categories(stringResourceId = R.string.sweet_tooth, imageResourceId = R.drawable.sweet),
            Categories(stringResourceId = R.string.stationary, imageResourceId = R.drawable.stationary),
            Categories(stringResourceId = R.string.pet_food, imageResourceId = R.drawable.pet),
            Categories(stringResourceId = R.string.packaged_food, imageResourceId = R.drawable.packaged),
            Categories(stringResourceId = R.string.munchies, imageResourceId = R.drawable.munchies),
            Categories(stringResourceId = R.string.kitchen_essentials, imageResourceId = R.drawable.kitchen),
            Categories(stringResourceId = R.string.vegetables, imageResourceId = R.drawable.vegetables),
            Categories(stringResourceId = R.string.beverages, imageResourceId = R.drawable.beverages),
            Categories(stringResourceId = R.string.bath_body, imageResourceId = R.drawable.bathbody),
            Categories(stringResourceId = R.string.bread_biscuits, imageResourceId = R.drawable.bread),
            )
    }

    fun loadItems(
        @StringRes categoryName: Int,
    ): List<Item> {
        return listOf(
            Item(R.string.banana_robusta, R.string.fresh_fruits,"1kg",100, R.drawable.banana),
            Item(R.string.shimla_apple,R.string.fresh_fruits,"1kg",250, R.drawable.apples),
            Item(R.string.papaya_semi_ripe,R.string.fresh_fruits,"1kg",150, R.drawable.papaya),
            Item(R.string.pomegranate,R.string.fresh_fruits,"1kg",200, R.drawable.pomegranate),
            Item(R.string.pineapple,R.string.fresh_fruits,"1kg",300, R.drawable.pineapple),
            Item(R.string.pepsi_can,R.string.beverages,"1can",100, R.drawable.pepsi),
        ).filter {
            it.itemCategoryId == categoryName
        }
    }
}