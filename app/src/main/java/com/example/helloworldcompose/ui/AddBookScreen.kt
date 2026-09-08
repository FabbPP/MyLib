package com.example.helloworldcompose.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.helloworldcompose.BookViewModel
import com.example.helloworldcompose.data.Book
import kotlin.math.roundToInt

@Composable
fun AddBookScreen(
    viewModel: BookViewModel,
    onSaved: () -> Unit
) {
    var title by rememberSaveable { mutableStateOf("") }
    var author by rememberSaveable { mutableStateOf("") }
    var totalPages by rememberSaveable { mutableStateOf("") }
    var readPages by rememberSaveable { mutableStateOf("") }
    val savedText by viewModel.savedText

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Registrar lectura",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(
            text = "Añade los libros y avances a tu biblioteca personal.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        BookFormCard {
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("Título del libro") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = outFieldColors()
            )

            OutlinedTextField(
                value = author,
                onValueChange = { author = it },
                label = { Text("Autor") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = outFieldColors()
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                OutlinedTextField(
                    value = totalPages,
                    onValueChange = { totalPages = it.filter { c -> c.isDigit() } },
                    label = { Text("Páginas totales") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp),
                    colors = outFieldColors()
                )

                OutlinedTextField(
                    value = readPages,
                    onValueChange = { readPages = it.filter { c -> c.isDigit() } },
                    label = { Text("Págs. leídas") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp),
                    colors = outFieldColors()
                )
            }
            
            val total = totalPages.toIntOrNull() ?: 0
            val read = readPages.toIntOrNull() ?: 0
            val percent = if (total > 0) ((read.toFloat() / total.toFloat()) * 100).roundToInt().coerceIn(0, 100) else 0

            // Progreso visual
            if (total > 0) {
                Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("Progreso de lectura", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        Text("$percent%", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.secondary)
                    }
                    Box(modifier = Modifier.fillMaxWidth().height(6.dp).background(MaterialTheme.colorScheme.surfaceContainer, CircleShape)) {
                        Box(modifier = Modifier.fillMaxWidth(fraction = (percent / 100f)).height(6.dp).background(MaterialTheme.colorScheme.secondary, CircleShape))
                    }
                }
            }

            Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                Text("Portada del libro", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Medium)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(112.dp)
                        .background(MaterialTheme.colorScheme.surfaceContainerLow.copy(alpha=0.6f), RoundedCornerShape(12.dp))
                        .border(2.dp, MaterialTheme.colorScheme.outlineVariant, RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Box(modifier = Modifier.size(40.dp).background(MaterialTheme.colorScheme.surfaceContainer, CircleShape), contentAlignment = Alignment.Center) {
                            Text("+", color = MaterialTheme.colorScheme.secondary, style = MaterialTheme.typography.titleLarge)
                        }
                        Text("Subir foto / carátula", color = MaterialTheme.colorScheme.secondary, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.SemiBold)
                        Text("(PNG, JPG)", color = MaterialTheme.colorScheme.onSurfaceVariant, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }

            Spacer(Modifier.height(4.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {
                        val newBook = Book(
                            id = System.currentTimeMillis(),
                            title = title.trim().ifEmpty { "Sin título" },
                            author = author.trim().ifEmpty { "Anónimo" },
                            totalPages = total,
                            currentPage = read,
                            completed = read >= total && total > 0
                        )
                        viewModel.addBook(newBook)
                        viewModel.saveToTextFile(
                            title = title.trim().ifEmpty { "Sin título" },
                            author = author.trim().ifEmpty { "Anónimo" },
                            totalPages = total.toString(),
                            readPages = read.toString(),
                            percentage = percent.toString()
                        )
                        title = ""
                        author = ""
                        totalPages = ""
                        readPages = ""
                        onSaved()
                    },
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Text("Guardar", style = MaterialTheme.typography.labelLarge)
                }

                Button(
                    onClick = { viewModel.readFromTextFile() },
                    modifier = Modifier.fillMaxWidth().height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.surfaceContainer,
                        contentColor = MaterialTheme.colorScheme.onSurface
                    )
                ) {
                    Text("Ver registro", style = MaterialTheme.typography.labelLarge)
                }
            }
        }

        if (savedText != null) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                color = MaterialTheme.colorScheme.surfaceContainerLowest,
                shadowElevation = 1.dp,
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column(Modifier.padding(16.dp)) {
                    Text(
                        text = "Último registro guardado",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = savedText ?: "",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun BookFormCard(content: @Composable () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        color = MaterialTheme.colorScheme.surfaceContainerLowest,
        shadowElevation = 1.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            content()
        }
    }
}

@Composable
private fun outFieldColors() = OutlinedTextFieldDefaults.colors(
    focusedBorderColor = MaterialTheme.colorScheme.secondary,
    unfocusedBorderColor = MaterialTheme.colorScheme.outlineVariant,
    focusedLabelColor = MaterialTheme.colorScheme.secondary,
    cursorColor = MaterialTheme.colorScheme.secondary
)
