import java.util.ArrayList;

public class Recipe implements NutritionalInfo, CookingInstructions, Comparable<Recipe> {
    private String name;
    private String description;
    private ArrayList<Ingredient> ingredients;

    // Constructor
    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
        this.ingredients = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Add and delete ingredient methods
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void deleteIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    // Implementing methods from NutritionalInfo interface
    @Override
    public double calculateCalories() {
        double totalCalories = 0;
        for (Ingredient ingredient : ingredients) {
            totalCalories += ingredient.getCalories();
        }
        return totalCalories;
    }

    @Override
    public double calculateProtein() {
        double totalProtein = 0;
        for (Ingredient ingredient : ingredients) {
            totalProtein += ingredient.getProtein();
        }
        return totalProtein;
    }

    @Override
    public double calculateCarbs() {
        double totalCarbs = 0;
        for (Ingredient ingredient : ingredients) {
            totalCarbs += ingredient.getCarbs();
        }
        return totalCarbs;
    }

    // Implementing methods from CookingInstructions interface
    @Override
    public String getInstructions() {
        return description;
    }

    @Override
    public int getCookingTime() {
        // Return the total cooking time (hardcoded or calculated based on the recipe)
        return 30; // Example: hardcoded 30 minutes
    }

    @Override
    public String getRequiredEquipment() {
        // Return a list of required equipment (can be derived from ingredients or hardcoded)
        return "Oven, Mixing Bowl, Whisk"; // Example: hardcoded equipment list
    }

    // Implementing Comparable interface to compare recipes by number of ingredients
    @Override
    public int compareTo(Recipe other) {
        return Integer.compare(this.ingredients.size(), other.ingredients.size());
    }

    // Method to display recipe details
    public void displayRecipeDetails() {
        System.out.println("Recipe Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Ingredients: ");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Calories: " + calculateCalories());
        System.out.println("Protein: " + calculateProtein() + "g");
        System.out.println("Carbs: " + calculateCarbs() + "g");
    }
}
