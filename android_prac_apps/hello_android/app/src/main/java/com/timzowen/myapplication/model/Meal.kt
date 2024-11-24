package com.timzowen.myapplication.model

data class Meal(
    val menuId: String,
    val mealTitle: String,
    val mealCost: String,
    val mealIngredients: List<String>,
    val menuImage: String,
    val menuName: String
)

fun getMenuItems(): List<Meal> {
    return listOf(
        Meal(
            menuId = "M001",
            mealTitle = "Classic Burger",
            mealCost = "12.99",
            mealIngredients = listOf(
                "Beef Patty",
                "Lettuce",
                "Tomato",
                "Cheddar Cheese",
                "Brioche Bun"
            ),
            menuImage = "https://example.com/images/classic_burger.jpg",
            menuName = "Burgers"
        ),
        Meal(
            menuId = "M002",
            mealTitle = "Margherita Pizza",
            mealCost = "8.99",
            mealIngredients = listOf("Tomato Sauce", "Mozzarella", "Basil", "Olive Oil"),
            menuImage = "https://example.com/images/margherita_pizza.jpg",
            menuName = "Pizzas"
        ),
        Meal(
            menuId = "M003",
            mealTitle = "Caesar Salad",
            mealCost = "9.49",
            mealIngredients = listOf("Romaine Lettuce", "Parmesan", "Croutons", "Caesar Dressing"),
            menuImage = "https://example.com/images/caesar_salad.jpg",
            menuName = "Salads"
        ),
        Meal(
            menuId = "M004",
            mealTitle = "Grilled Salmon",
            mealCost = "15.99",
            mealIngredients = listOf("Salmon Fillet", "Lemon", "Garlic", "Olive Oil", "Herbs"),
            menuImage = "https://example.com/images/grilled_salmon.jpg",
            menuName = "Seafood"
        ),
        Meal(
            menuId = "M005",
            mealTitle = "Vegetable Stir-Fry",
            mealCost = "10.49",
            mealIngredients = listOf("Broccoli", "Carrots", "Bell Peppers", "Soy Sauce", "Tofu"),
            menuImage = "https://example.com/images/vegetable_stirfry.jpg",
            menuName = "Vegan"
        ),
        Meal(
            menuId = "M006",
            mealTitle = "Spaghetti Carbonara",
            mealCost = "11.99",
            mealIngredients = listOf("Spaghetti", "Eggs", "Pancetta", "Parmesan", "Black Pepper"),
            menuImage = "https://example.com/images/spaghetti_carbonara.jpg",
            menuName = "Pasta"
        ),
        Meal(
            menuId = "M007",
            mealTitle = "Chicken Curry",
            mealCost = "13.99",
            mealIngredients = listOf("Chicken", "Coconut Milk", "Curry Spices", "Tomatoes", "Rice"),
            menuImage = "https://example.com/images/chicken_curry.jpg",
            menuName = "Curries"
        ),
        Meal(
            menuId = "M008",
            mealTitle = "Tacos Al Pastor",
            mealCost = "9.99",
            mealIngredients = listOf("Pork", "Pineapple", "Cilantro", "Onions", "Tortilla"),
            menuImage = "https://example.com/images/tacos_al_pastor.jpg",
            menuName = "Mexican"
        ),
        Meal(
            menuId = "M009",
            mealTitle = "Sushi Platter",
            mealCost = "18.99",
            mealIngredients = listOf("Sushi Rice", "Nori", "Salmon", "Tuna", "Avocado"),
            menuImage = "https://example.com/images/sushi_platter.jpg",
            menuName = "Japanese"
        ),
        Meal(
            menuId = "M010",
            mealTitle = "Pancakes with Maple Syrup",
            mealCost = "7.49",
            mealIngredients = listOf("Flour", "Eggs", "Milk", "Maple Syrup", "Butter"),
            menuImage = "https://example.com/images/pancakes_maple_syrup.jpg",
            menuName = "Breakfast"
        )
    )
}