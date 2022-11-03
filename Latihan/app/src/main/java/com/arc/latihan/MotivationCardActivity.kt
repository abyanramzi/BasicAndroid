package com.arc.latihan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arc.latihan.data.ListFilm
import com.arc.latihan.model.Film

class MotivationCardActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            ContentApp(listFilm = ListFilm().loadFilm())
        }
    }
}

@Composable
fun ContentApp(listFilm: List<Film>){
    LazyColumn {
        items (listFilm){ film->
            ContentCard(film = film)
        }
    }
}

@Composable
fun ContentCard(film: Film) {
    Card(
        elevation = 10.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column() {
            Image(
                painterResource(id = film.drawableResourceID),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp),
                contentScale = ContentScale.Crop,
            )
            Text(
                text = stringResource(id = film.stringResourceID),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContentCardPreview(){
    ContentApp(listFilm = ListFilm().loadFilm())
}