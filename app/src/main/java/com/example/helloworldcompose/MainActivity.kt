package com.example.helloworldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
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

enum class MainTab(val label: String, val icon: String) {
    Current("Ahora", "\u25A3"),
    History("Registros", "\u2261"),
    AddBook("Agregar", "\u2295")
}

@Composable
fun BookApp() {
    val application = LocalContext.current.applicationContext as android.app.Application
    val viewModel = remember { BookViewModel(application) }
    var selectedTab by rememberSaveable { mutableStateOf(MainTab.Current.name) }
    val current = MainTab.valueOf(selectedTab)

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background,
        bottomBar = {
            EditorialBottomBar(selected = current, onSelect = { selectedTab = it.name })
        }
    ) { innerPadding ->
        Box(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
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

@Composable
private fun EditorialBottomBar(selected: MainTab, onSelect: (MainTab) -> Unit) {
    Surface(
        color = MaterialTheme.colorScheme.surface.copy(alpha = 0.85f),
        shadowElevation = 8.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(72.dp)
                .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            MainTab.entries.forEach { tab ->
                val isSelected = tab == selected
                Column(
                    modifier = Modifier
                        .height(54.dp)
                        .width(72.dp)
                        .clickable { onSelect(tab) },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Pill indicator behind the active icon
                    Box(
                        modifier = Modifier
                            .size(width = 64.dp, height = 32.dp)
                            .background(
                                color = if (isSelected)
                                    MaterialTheme.colorScheme.secondaryFixed
                                else
                                    androidx.compose.ui.graphics.Color.Transparent,
                                shape = RoundedCornerShape(50)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = tab.icon,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = if (isSelected)
                                MaterialTheme.colorScheme.secondary
                            else
                                MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = tab.label,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        color = if (isSelected)
                            MaterialTheme.colorScheme.onSurface
                        else
                            MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1
                    )
                }
            }
        }
    }
}
