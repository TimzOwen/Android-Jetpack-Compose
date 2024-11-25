package com.timzowen.myapplication.model

data class Meal(
    val mealId: String,
    val mealTitle: String,
    val mealCost: String,
    val mealIngredients: List<String>,
    val menuImage: List<String>,
    val menuName: String
)

fun getMenuItems(): List<Meal> {
    return listOf(
        Meal(
            mealId = "M001",
            mealTitle = "Classic Burger",
            mealCost = "12.99",
            mealIngredients = listOf(
                "Beef Patty",
                "Lettuce",
                "Tomato",
                "Cheddar Cheese",
                "Brioche Bun"
            ),
            menuImage = listOf("https://images.unsplash.com/photo-1498654156189-bc65b98b06a7?q=80&w=3271&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            menuName = "Burgers"
        ),
        Meal(
            mealId = "M002",
            mealTitle = "Margherita Pizza",
            mealCost = "8.99",
            mealIngredients = listOf("Tomato Sauce", "Mozzarella", "Basil", "Olive Oil"),
            menuImage = listOf("https://plus.unsplash.com/premium_photo-1673439304183-8840bd0dc1bf?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            menuName = "Pizzas"
        ),
        Meal(
            mealId = "M003",
            mealTitle = "Caesar Salad",
            mealCost = "9.49",
            mealIngredients = listOf("Romaine Lettuce", "Parmesan", "Croutons", "Caesar Dressing"),
            menuImage = listOf("https://plus.unsplash.com/premium_photo-1675252369719-dd52bc69c3df?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8Zm9vZHxlbnwwfHwwfHx8MA%3D%3D"),
            menuName = "Salads"
        ),
        Meal(
            mealId = "M004",
            mealTitle = "Grilled Salmon",
            mealCost = "15.99",
            mealIngredients = listOf("Salmon Fillet", "Lemon", "Garlic", "Olive Oil", "Herbs"),
            menuImage = listOf("https://images.unsplash.com/photo-1485962398705-ef6a13c41e8f?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGRpbm5lcnxlbnwwfHwwfHx8MA%3D%3D"),
            menuName = "Seafood"
        ),
        Meal(
            mealId = "M005",
            mealTitle = "Vegetable Stir-Fry",
            mealCost = "10.49",
            mealIngredients = listOf("Broccoli", "Carrots", "Bell Peppers", "Soy Sauce", "Tofu"),
            menuImage = listOf("https://plus.unsplash.com/premium_photo-1701113208672-df1d083413d9?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fGx1bmNofGVufDB8fDB8fHww"),
            menuName = "Vegan"
        ),
        Meal(
            mealId = "M006",
            mealTitle = "Spaghetti Carbonara",
            mealCost = "11.99",
            mealIngredients = listOf("Spaghetti", "Eggs", "Pancetta", "Parmesan", "Black Pepper"),
            menuImage = listOf("https://images.unsplash.com/photo-1577308873518-7fd772788ec6?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8c3VwcGVyfGVufDB8fDB8fHww"),
            menuName = "Pasta"
        ),
        Meal(
            mealId = "M007",
            mealTitle = "Chicken Curry",
            mealCost = "13.99",
            mealIngredients = listOf("Chicken", "Coconut Milk", "Curry Spices", "Tomatoes", "Rice"),
            menuImage = listOf("https://images.unsplash.com/photo-1564671165093-20688ff1fffa?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8c3VwcGVyfGVufDB8fDB8fHww"),
            menuName = "Curries"
        ),
        Meal(
            mealId = "M008",
            mealTitle = "Tacos Al Pastor",
            mealCost = "9.99",
            mealIngredients = listOf("Pork", "Pineapple", "Cilantro", "Onions", "Tortilla"),
            menuImage = listOf("https://images.unsplash.com/photo-1566384046298-437dcba0f62c?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHN1cHBlcnxlbnwwfHwwfHx8MA%3D%3D"),
            menuName = "Mexican"
        ),
        Meal(
            mealId = "M009",
            mealTitle = "Sushi Platter",
            mealCost = "18.99",
            mealIngredients = listOf("Sushi Rice", "Nori", "Salmon", "Tuna", "Avocado"),
            menuImage = listOf("https://images.unsplash.com/photo-1542095496-1ee6599fe563?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8bWVhbHxlbnwwfHwwfHx8MA%3D%3D"),
            menuName = "Japanese"
        ),
        Meal(
            mealId = "M010",
            mealTitle = "Pancakes with Maple Syrup",
            mealCost = "7.49",
            mealIngredients = listOf("Flour", "Eggs", "Milk", "Maple Syrup", "Butter"),
            menuImage = listOf("https://images.unsplash.com/photo-1505253758473-96b7015fcd40?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8Ym93bHxlbnwwfHwwfHx8MA%3D%3D"),
            menuName = "Breakfast"
        )
    )
}