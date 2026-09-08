package com.example.helloworldcompose.data

import android.content.Context
import android.util.Log

class BookStorage(context: Context) {

    private val prefs = context.getSharedPreferences("books", Context.MODE_PRIVATE)

    fun saveBooks(books: List<Book>) {
        val set = books.map { serialize(it) }.toSet()
        prefs.edit().putStringSet("books", set).apply()
    }

    fun loadBooks(): List<Book> {
        val set = prefs.getStringSet("books", emptySet()) ?: emptySet()
        return set.mapNotNull { deserialize(it) }.sortedBy { -it.id }
    }

    fun saveToTextFile(context: Context, title: String, author: String, totalPages: String, readPages: String, percentage: String) {
        context.openFileOutput(FILENAME, Context.MODE_PRIVATE).use { fos ->
            fos.write("Título: $title | Autor: $author | Páginas totales: $totalPages | Leídas: $readPages | Avance: $percentage%".toByteArray())
        }
        Log.d(TAG, "Registro guardado en $FILENAME")
    }

    fun readFromTextFile(context: Context): String {
        val content = context.openFileInput(FILENAME).bufferedReader().use { it.readText() }
        Log.d(TAG, "Leyendo registro: $content")
        return content
    }

    fun hasTextFile(context: Context): Boolean = context.fileList().contains(FILENAME)

    private fun serialize(book: Book): String {
        return listOf(
            book.id,
            book.title,
            book.author,
            book.totalPages,
            book.currentPage,
            book.completed,
            book.createdAt
        ).joinToString("|")
    }

    private fun deserialize(line: String): Book? {
        return try {
            val p = line.split("|")
            Book(
                id = p[0].toLong(),
                title = p[1],
                author = p[2],
                totalPages = p[3].toInt(),
                currentPage = p[4].toInt(),
                completed = p[5].toBoolean(),
                createdAt = p[6].toLong()
            )
        } catch (e: Exception) {
            null
        }
    }

    companion object {
        private const val TAG = "BookStorage"
        private const val FILENAME = "book_registry.txt"
    }
}
