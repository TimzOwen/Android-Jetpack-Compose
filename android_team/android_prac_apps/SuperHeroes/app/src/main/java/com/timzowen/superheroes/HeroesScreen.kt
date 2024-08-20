package com.timzowen.superheroes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.superheroes.model.SuperHeroes




    @Composable
    fun HeroesList(
        modifier: Modifier = Modifier,
        heroes: List<SuperHeroes>,
        contentPadding: PaddingValues = PaddingValues(0.dp)) {
        Surface(modifier = Modifier.fillMaxSize()) {
            LazyColumn {
                items(heroes) {
                    HeroesCard(
                        superHeroes = it,
                        modifier = modifier.padding(8.dp)
                    )
                }
            }
        }
    }


    @Composable
    fun HeroesCard(superHeroes: SuperHeroes, modifier: Modifier = Modifier) {
        Card(
            elevation = CardDefaults.cardElevation(2.dp),
            modifier = modifier
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .sizeIn(minHeight = 72.dp)
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = stringResource(id = superHeroes.superHeroName),
                        style = MaterialTheme.typography.displaySmall
                    )
                    Text(
                        text = stringResource(id = superHeroes.superHeroDescription),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Box(
                    modifier = Modifier
                        .size(72.dp)
                        .clip(RoundedCornerShape(8.dp))
                ) {
                    Image(
                        painter = painterResource(id = superHeroes.superHeroImageResourceId),
                        alignment = Alignment.TopCenter,
                        contentScale = ContentScale.FillWidth,
                        contentDescription = stringResource(id = superHeroes.superHeroName)
                    )
                }

            }
        }
    }

    @Composable
    @Preview(showBackground = true)
    fun HeroesCardPreview() {
        HeroesCard(
            SuperHeroes(
                superHeroImageResourceId = R.drawable.android_superhero1,
                superHeroName = R.string.hero1,
                superHeroDescription = R.string.description1
            )
        )
    }

