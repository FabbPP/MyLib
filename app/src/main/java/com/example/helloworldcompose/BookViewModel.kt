package com.example.helloworldcompose

import android.app.Application
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import com.example.helloworldcompose.data.Book
import com.example.helloworldcompose.data.BookStorage

class BookViewModel(application: Application) {

    private val storage = BookStorage(application)
    private val appContext = application.applicationContext

    private val _books = mutableStateListOf<Book>()
    val books: List<Book> get() = _books

    private val _savedText = mutableStateOf<String?>(null)
    val savedText: State<String?> = _savedText

    init {
        val loaded = storage.loadBooks()
        _books.addAll(loaded)
    }

    fun addBook(book: Book) {
        _books.add(0, book)
        storage.saveBooks(_books.toList())
    }

    fun updatePage(bookId: Long, newPage: Int) {
        val index = _books.indexOfFirst { it.id == bookId }
        if (index == -1) return
        val book = _books[index]
        val clamped = newPage.coerceIn(0, book.totalPages)
        val updated = book.copy(currentPage = clamped, completed = clamped >= book.totalPages)
        _books[index] = updated
        storage.saveBooks(_books.toList())
    }

    fun deleteBook(bookId: Long) {
        _books.removeAll { it.id == bookId }
        storage.saveBooks(_books.toList())
    }

    fun saveToTextFile(title: String, author: String, totalPages: String, readPages: String, percentage: String) {
        storage.saveToTextFile(appContext, title, author, totalPages, readPages, percentage)
    }

    fun readFromTextFile(): String {
        val content = storage.readFromTextFile(appContext)
        _savedText.value = content
        return content
    }

    fun hasTextFile(): Boolean = storage.hasTextFile(appContext)

    val currentBooks: List<Book> get() = _books.filterNot { it.completed }
    val completedBooks: List<Book> get() = _books.filter { it.completed }
}