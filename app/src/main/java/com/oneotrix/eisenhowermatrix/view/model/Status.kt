package com.oneotrix.eisenhowermatrix.view.model

/**
 * @property URGENT_AND_IMPORTANT Срочно и важно
 * @property NOT_URGENT_AND_IMPORTANT Не срочно и важно
 * @property URGENT_AND_NOT_IMPORTANT Срочно и неважно
 * @property NOT_URGENT_AND_NOT_IMPORTANT Не срочно и не важно
 * */
enum class Status() {
    URGENT_AND_IMPORTANT,
    NOT_URGENT_AND_IMPORTANT,
    URGENT_AND_NOT_IMPORTANT,
    NOT_URGENT_AND_NOT_IMPORTANT;


    companion object {
        fun getTitleByStatus(status: Status): String = when(status) {
            URGENT_AND_IMPORTANT -> "Важно\nСрочно"
            NOT_URGENT_AND_IMPORTANT -> "Важно\nНе срочно"
            URGENT_AND_NOT_IMPORTANT -> "Неважно\nСрочно"
            NOT_URGENT_AND_NOT_IMPORTANT -> "Неважно\nНе срочно"
        }
    }
}