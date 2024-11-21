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
            poster = "https://example.com/dark_knight.jpg",
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
            poster = "https://example.com/forrest_gump.jpg",
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
            poster = "https://example.com/matrix.jpg",
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
            poster = "https://example.com/endgame.jpg",
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
            poster = "https://example.com/titanic.jpg",
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
            poster = "https://example.com/shawshank.jpg",
            images = listOf("https://example.com/shawshank1.jpg", "https://example.com/shawshank2.jpg"),
            rating = "9.3"
        ),
        Movie(
            id = "11",
            title = "Gladiator",
            year = "2000",
            genre = "Action, Adventure, Drama",
            director = "Ridley Scott",
            actors = "Russell Crowe, Joaquin Phoenix, Connie Nielsen",
            plot = "A former Roman General sets out to exact vengeance against the corrupt emperor who betrayed him.",
            poster = "https://example.com/gladiator.jpg",
            images = listOf("https://example.com/gladiator1.jpg", "https://example.com/gladiator2.jpg"),
            rating = "8.5"
        ),
        Movie(
            id = "12",
            title = "Joker",
            year = "2019",
            genre = "Crime, Drama, Thriller",
            director = "Todd Phillips",
            actors = "Joaquin Phoenix, Robert De Niro, Zazie Beetz",
            plot = "A mentally troubled stand-up comedian embarks on a downward spiral into madness.",
            poster = "https://example.com/joker.jpg",
            images = listOf("https://example.com/joker1.jpg", "https://example.com/joker2.jpg"),
            rating = "8.4"
        ),
        Movie(
            id = "13",
            title = "Black Panther",
            year = "2018",
            genre = "Action, Adventure, Sci-Fi",
            director = "Ryan Coogler",
            actors = "Chadwick Boseman, Michael B. Jordan, Lupita Nyong'o",
            plot = "T'Challa returns to Wakanda to take his rightful place as king but is challenged by an outsider.",
            poster = "https://example.com/black_panther.jpg",
            images = listOf("https://example.com/black_panther1.jpg", "https://example.com/black_panther2.jpg"),
            rating = "7.3"
        ),
        Movie(
            id = "14",
            title = "Pulp Fiction",
            year = "1994",
            genre = "Crime, Drama",
            director = "Quentin Tarantino",
            actors = "John Travolta, Uma Thurman, Samuel L. Jackson",
            plot = "The lives of two mob hitmen, a boxer, and a gangster intertwine in a series of unexpected events.",
            poster = "https://example.com/pulp_fiction.jpg",
            images = listOf("https://example.com/pulp_fiction1.jpg", "https://example.com/pulp_fiction2.jpg"),
            rating = "8.9"
        ),
        Movie(
            id = "15",
            title = "Frozen",
            year = "2013",
            genre = "Animation, Adventure, Comedy",
            director = "Chris Buck, Jennifer Lee",
            actors = "Kristen Bell, Idina Menzel, Jonathan Groff",
            plot = "Two sisters, Elsa and Anna, set out on an adventure to save their kingdom from eternal winter.",
            poster = "https://example.com/frozen.jpg",
            images = listOf("https://example.com/frozen1.jpg", "https://example.com/frozen2.jpg"),
            rating = "7.4"
        ),
        Movie(
            id = "00001",
            title = "Inception",
            year = "2010",
            genre = "Sci-Fi, Thriller",
            director = "Christopher Nolan",
            actors = "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page",
            plot = "A thief who steals corporate secrets through dream-sharing technology is tasked with planting an idea into a CEO's mind.",
            poster = "https://m.media-amazon.com/images/I/51B9oR2GdtL._AC_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BNmM0ZDI2ZTUtNjBlOS00NmZmLThjODUtODc2NzBmZjRlNzQzXkEyXkFqcGdeQXVyNjU1OTg4OTM@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTUxMzU4MDk5N15BMl5BanBnXkFtZTcwOTE4MzU0Mw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTYzMjU5NDIzOF5BMl5BanBnXkFtZTcwNDkxOTg0Mw@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNWIwNjc5YzEtMWZkMi00NjY4LWE4NTMtN2YwNDJmOWU5ZmYxXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg"
            ),
            rating = "8.8"
        ),
        Movie(
            id = "00002",
            title = "The Godfather",
            year = "1972",
            genre = "Crime, Drama",
            director = "Francis Ford Coppola",
            actors = "Marlon Brando, Al Pacino, James Caan",
            plot = "The aging patriarch of an organized crime dynasty transfers control to his reluctant son.",
            poster = "https://m.media-amazon.com/images/I/51v5ZpFyaFL._AC_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmYtYTAwNi00ZjQ2LWFmZTUtMWJmZjdiYzRjNzYxXkEyXkFqcGdeQXVyNjU1OTg4OTM@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNGNhMDMyYTItM2YzNy00NDMzLWJmNTUtMmNlMGE4OTc1MTRiXkEyXkFqcGdeQXVyNjUxMjc1OTM@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BZGE3MzMxZTgtNTZiYy00MDQxLWIyNTEtZjYxYjdmZTcwZDgxXkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMmQ3YjY1N2QtNTFkYy00MDhmLTgzZGItMTVkOGE3ZDgzNzRhXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg"
            ),
            rating = "9.2"
        ),
        Movie(
            id = "00003",
            title = "Interstellar",
            year = "2014",
            genre = "Adventure, Drama, Sci-Fi",
            director = "Christopher Nolan",
            actors = "Matthew McConaughey, Anne Hathaway, Jessica Chastain",
            plot = "A team of explorers travels through a wormhole in space to ensure humanity's survival.",
            poster = "https://m.media-amazon.com/images/I/81MeOTsTDyL._AC_SL1500_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMjIxMjgxNjgyOF5BMl5BanBnXkFtZTgwNzU1NzE3MTE@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjIxOTc2MTU5Ml5BMl5BanBnXkFtZTgwMTU1NzE3MTE@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNTI4MzY3Mzk0Ml5BMl5BanBnXkFtZTgwNjE1NzE3MTE@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjA3Nzk1NzI4M15BMl5BanBnXkFtZTgwODE1NzE3MTE@._V1_.jpg"
            ),
            rating = "8.6"
        )
    )
}