package com.timzowen.jetnotesapp.data

import com.timzowen.jetnotesapp.model.Note

class NoteData {

    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "A good day", description = "We went on a vaccation to mombasa and had fun at the beach enjoying the sun"),
            Note(title = "Meeting with Team", description ="Had a productive meeting with the team to discuss the upcoming project milestones"),
            Note(title="Shopping Day", description ="Went shopping and found some great deals on clothes and electronics"),
            Note(title="Birthday Celebration", description ="Celebrated my birthday with friends and family, had a wonderful dinner"),
            Note(title="Gym Session", description ="Had an intense workout at the gym, feeling energized and healthy"),
            Note(title="Movie Night",description = "Watched a thrilling movie at home, enjoyed some popcorn and a cozy evening"),
            Note(title="Coding Marathon", description ="Spent the day coding and finally completed the project I’ve been working on"),
            Note(title="Hiking Adventure",description = "Went hiking in the mountains, the view from the top was absolutely breathtaking"),
            Note(title="Dinner with Friends",description = "Had a great dinner with old friends, reminiscing about good times"),
            Note(title="Learning Kotlin", description ="Started learning Kotlin, it’s been an exciting and insightful experience")
        )
    }
}