package com.example.helloworldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.helloworldcompose.ui.AddBookScreen
import com.example.helloworldcompose.ui.CurrentReadsScreen
import com.example.helloworldcompose.ui.HistoryScreen
import com.example.helloworldcompose.ui.theme.HelloWorldComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldComposeTheme {
                BookApp()
            }
        }
    }
}

enum class MainTab(val label: String) {
    Current("Actuales Avances"),
    History("Registros anteriores"),
    AddBook("Nuevo Lirbo")
}

@Composable
fun BookApp() {
    val application = androidx.compose.ui.platform.LocalContext.current.applicationContext as android.app.Application
    val viewModel = remember { BookViewModel(application) }
    var selectedTab by rememberSaveable { mutableStateOf(MainTab.Current.name) }
    val current = MainTab.valueOf(selectedTab)

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                MainTab.entries.forEach { tab ->
                    NavigationBarItem(
                        selected = tab == current,
                        onClick = { selectedTab = tab.name },
                        icon = { Text(tab.label.take(1)) },
                        label = { Text(tab.label) }
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(Modifier.padding(innerPadding)) {
            when (current) {
                MainTab.Current -> CurrentReadsScreen(
                    viewModel = viewModel,
                    onAddBook = { selectedTab = MainTab.AddBook.name }
                )
                MainTab.History -> HistoryScreen(
                    viewModel = viewModel,
                    onAddBook = { selectedTab = MainTab.AddBook.name }
                )
                MainTab.AddBook -> AddBookScreen(
                    viewModel = viewModel,
                    onSaved = { selectedTab = MainTab.Current.name }
                )
            }
        }
    }
}