package com.timzowen.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
    )

fun getMovies(): List<Movie>{
    return listOf(
        Movie(
            id = "MOV01",
            title = "The Sfhawshank Redemption",
            year = "1994",
            genre = "Drama",
            director = "Frank Darabont",
            actors = "Tim Robbins, Morgan Freeman, Bob Gunton",
            plot = "Two imprisoned men bond over years, finding solace and eventual redemption through acts of common decency.",
            poster = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/I/81GqtNbs+PL._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/51NiGlapXlL._AC_.jpg",
                "https://m.media-amazon.com/images/I/91zXcTztoPL._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/81gxekI7zqL._AC_SL1500_.jpg"
            ),
            rating = "9.3"
        ),
        Movie(
            id = "MOV02",
            title = "The Godfather",
            year = "1972",
            genre = "Crime, Drama",
            director = "Francis Ford Coppola",
            actors = "Marlon Brando, Al Pacino, James Caan",
            plot = "The aging patriarch of an organized crime dynasty transfers control to his reluctant youngest son.",
            poster = "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/I/71o8IcnBF2L._AC_SL1000_.jpg",
                "https://m.media-amazon.com/images/I/81s+DXeAN0L._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/61R6a4Z+2wL._AC_SL1000_.jpg",
                "https://m.media-amazon.com/images/I/91KkWf50SoL._AC_SL1500_.jpg"
            ),
            rating = "9.2"
        ),
        Movie(
            id = "MOV03",
            title = "The Dark Knight",
            year = "2008",
            genre = "Action, Crime, Drama",
            director = "Christopher Nolan",
            actors = "Christian Bale, Heath Ledger, Aaron Eckhart",
            plot = "When the Joker wreaks havoc and chaos on Gotham, Batman faces his greatest test.",
            poster = "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_SX300.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/I/71P7J7QOgsL._AC_SL1000_.jpg",
                "https://m.media-amazon.com/images/I/91RDEk+uwxL._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/81G61jlmYoL._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/81+VoDv+G7L._AC_SL1500_.jpg"
            ),
            rating = "9.1"
        ),
        Movie(
            id = "MOV04",
            title = "The Godfather: Part II",
            year = "1974",
            genre = "Crime, Drama",
            director = "Francis Ford Coppola",
            actors = "Al Pacino, Robert De Niro, Robert Duvall",
            plot = "The story of the early life of Vito Corleone and his son's rise in the family crime syndicate.",
            poster = "https://m.media-amazon.com/images/M/MV5BMWMwMGQzZTItY2JlNC00OWZiLWIyMDctNDk2ZDQ2YjRjMWQ0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/I/81BxKaOw0IL._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/81nZ7iJzx+L._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/91r8WDwaLBL._AC_SL1500_.jpg",
                "https://m.media-amazon.com/images/I/71p5PPA7YvL._AC_SL1000_.jpg"
            ),
            rating = "9.0"
        ),
        Movie(
            id = "5",
            title = "The Dark Knight",
            year = "2008",
            genre = "Action, Crime, Drama",
            director = "Christopher Nolan",
            actors = "Christian Bale, Heath Ledger, Aaron Eckhart",
            plot = "Batman must accept his role as a hero to stop a criminal mastermind known as the Joker.",
            poster = "https://m.media-amazon.com/images/M/MV5BMWU4N2FjNzYtNTVkNC00NzQ0LTg0MjAtYTJlMjFhNGUxZDFmXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_SX300.jpg",
            images = listOf("https://example.com/dark_knight1.jpg", "https://example.com/dark_knight2.jpg"),
            rating = "9.0"
        ),
        Movie(
            id = "6",
            title = "Forrest Gump",
            year = "1994",
            genre = "Drama, Romance",
            director = "Robert Zemeckis",
            actors = "Tom Hanks, Robin Wright, Gary Sinise",
            plot = "The story of a man with low intelligence who achieves remarkable things in life.",
            poster = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg",
            images = listOf("https://example.com/forrest_gump1.jpg", "https://example.com/forrest_gump2.jpg"),
            rating = "8.8"
        ),
        Movie(
            id = "7",
            title = "The Matrix",
            year = "1999",
            genre = "Action, Sci-Fi",
            director = "Lana Wachowski, Lilly Wachowski",
            actors = "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",
            plot = "A hacker discovers a shocking truth about his reality and his role in the war against its controllers.",
            poster = "https://m.media-amazon.com/images/M/MV5BMWU4N2FjNzYtNTVkNC00NzQ0LTg0MjAtYTJlMjFhNGUxZDFmXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_SX300.jpg",
            images = listOf("https://example.com/matrix1.jpg", "https://example.com/matrix2.jpg"),
            rating = "8.7"
        ),
        Movie(
            id = "8",
            title = "Avengers: Endgame",
            year = "2019",
            genre = "Action, Adventure, Drama",
            director = "Anthony Russo, Joe Russo",
            actors = "Robert Downey Jr., Chris Evans, Mark Ruffalo",
            plot = "The Avengers assemble for one final battle to undo the chaos caused by Thanos.",
            poster = "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
            images = listOf("https://example.com/endgame1.jpg", "https://example.com/endgame2.jpg"),
            rating = "8.4"
        ),
        Movie(
            id = "9",
            title = "Titanic",
            year = "1997",
            genre = "Drama, Romance",
            director = "James Cameron",
            actors = "Leonardo DiCaprio, Kate Winslet, Billy Zane",
            plot = "A love story blossoms on the ill-fated RMS Titanic.",
            poster = "https://m.media-amazon.com/images/M/MV5BMWMwMGQzZTItY2JlNC00OWZiLWIyMDctNDk2ZDQ2YjRjMWQ0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
            images = listOf("https://example.com/titanic1.jpg", "https://example.com/titanic2.jpg"),
            rating = "7.9"
        ),
        Movie(
            id = "10",
            title = "The Shawshank Redemption",
            year = "1994",
            genre = "Drama",
            director = "Frank Darabont",
            actors = "Tim Robbins, Morgan Freeman, Bob Gunton",
            plot = "Two imprisoned men bond over a number of years, finding solace and redemption through acts of decency.",
            poster = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg",
            images = listOf("https://example.com/shawshank1.jpg", "https://example.com/shawshank2.jpg"),
            rating = "9.3"
        )

    )
}