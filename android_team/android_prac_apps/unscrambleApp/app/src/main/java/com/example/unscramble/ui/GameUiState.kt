/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlin.random.Random

/**
 * Data class that represents the game UI state
 */
data class GameUiState(
    val currentScrambledWord: String = "",
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false
)

// Test class for view model --> Remove them

//data class DiceUiState(
//    val firstDiceValue: Int? = null,
//    val secondDiceValue: Int? = null,
//    val numOfRolls: Int = 0
//)
//
//class DiceRollViewModel: ViewModel(){
//
//    // expose screen to ui state
//    private val _uiState = MutableStateFlow(DiceUiState())
//    val uiState: StateFlow<DiceUiState> = _uiState.asStateFlow()
//
//    //business login
//    fun rollDice(){
//        _uiState.update { currentState ->
//            currentState.copy(
//                firstDiceValue = Random.nextInt(from = 1, until = 7),
//                secondDiceValue = Random.nextInt(from = 1, until = 7),
//                numOfRolls = currentState.numOfRolls + 1
//            )
//        }
//    }
//}