package com.timzowen.superheroes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.superheroes.model.SuperHeroes

class HeroesScreen {

    @Composable
    fun HeroesCard(superHeroes: SuperHeroes){
        Row {
            Column() {
                Text(text = stringResource(id = superHeroes.superHeroName))
                Text(text = stringResource(id = superHeroes.superHeroDescription))
            }
            Image(
                painter = painterResource(id = superHeroes.superHeroImageResourceId),
                modifier = Modifier.size(48.dp),
                contentDescription = stringResource(id = superHeroes.superHeroName)
            )
        }
    }

    @Composable
    @Preview(showBackground = true)
    fun HeroesCardPreview(){
        HeroesCard(
            SuperHeroes(
                superHeroImageResourceId = R.drawable.android_superhero1,
                superHeroName = R.string.hero1,
                superHeroDescription = R.string.description1
            )
        )
    }

}