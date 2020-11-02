package com.example.nearbyforeattogether

import androidx.annotation.DrawableRes


data class RowData(@DrawableRes
                   val avatar: Int,
                   val description: String,
                   val name: String) {
    companion object{
        fun getDataList(): ArrayList<RowData>{
            return arrayListOf<RowData>(
                RowData(
                    R.drawable.gleb,
                    "Меня зовут Глеб мне 15 лет я люблю флексить и корвус",
                    "Глеб Сердюк"
                ),
                RowData(
                    R.drawable.game_in_sir,
                    "Я люблю курицу",
                    "Илья Жилин"
                ),
                RowData(
                    R.drawable.zolax,
                    "Я люблю бургеры",
                    "Даня Золотарев"
                )
            )
        }
    }
}