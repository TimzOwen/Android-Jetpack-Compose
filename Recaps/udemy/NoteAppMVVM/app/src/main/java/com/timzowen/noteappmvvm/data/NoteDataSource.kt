package com.timzowen.noteappmvvm.data

import com.timzowen.noteappmvvm.model.Note

class NoteDataSource{

    fun loadNotes() : List<Note>{
        return listOf(
            Note(
                title = "Grocery List",
                description = "Buy milk, eggs, bread, and butter."
            ),
            Note(
                title = "Work Tasks",
                description = "Complete project report and attend team meeting."
            ),
            Note(
                title = "Meeting Notes",
                description = "Discussion on quarterly goals and new strategies."
            ),
            Note(
                title = "Book to Read",
                description = "Start reading 'Atomic Habits' by James Clear."
            ),
            Note(
                title = "Weekend Plans",
                description = "Go hiking and try the new Italian restaurant."
            ),
            Note(
                title = "Ideas for Blog",
                description = "Write about Kotlin tips and tricks for beginners."
            ),
            Note(
                title = "Personal Goals",
                description = "Meditate daily and exercise three times a week."
            ),
            Note(
                title = "Shopping List",
                description = "Order a new laptop and wireless headphones."
            ),
            Note(
                title = "Call Reminder",
                description = "Call Sarah to discuss upcoming vacation plans."
            ),
            Note(
                title = "Learning Topics",
                description = "Explore Compose Navigation and State management."
            )
        )
    }

}