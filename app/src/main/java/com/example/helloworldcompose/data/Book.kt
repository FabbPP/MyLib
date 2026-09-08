package com.example.helloworldcompose.data

data class Book(
    val id: Long,
    val title: String,
    val author: String,
    val totalPages: Int,
    val currentPage: Int = 0,
    val completed: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
) {
    val progressPercent: Int
        get() = if (totalPages <= 0) 0 else ((currentPage.toDouble() / totalPages) * 100).toInt().coerceIn(0, 100)

    val remainingPages: Int
        get() = (totalPages - currentPage).coerceAtLeast(0)
}
