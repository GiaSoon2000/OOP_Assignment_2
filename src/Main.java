public class Main {
    public static void main(String[] args) {
        // Create some Ingredient instances
        Ingredient flour = new Ingredient("Flour", 2, "cups", 455, 13, 95);
        Ingredient sugar = new Ingredient("Sugar", 1, "cup", 774, 0, 200);
        Ingredient eggs = new Ingredient("Eggs", 3, "units", 70, 6, 1);
        Ingredient butter = new Ingredient("Butter", 0.5, "cup", 800, 0.5, 0);

        // Create a Recipe instance
        Recipe cake = new Recipe("Cake", "Mix all ingredients and bake at 350°F for 30 minutes.");
        cake.addIngredient(flour);
        cake.addIngredient(sugar);
        cake.addIngredient(eggs);
        cake.addIngredient(butter);

        // Display the recipe details
        cake.displayRecipeDetails();
        System.out.println("\nCooking time for Cake: " + cake.getCookingTime() + " minutes");
        System.out.println("Required equipment for Cake: " + cake.getRequiredEquipment());

        // Create another Recipe instance for comparison
        Recipe salad = new Recipe("Salad", "Chop vegetables and toss with dressing.");
        salad.addIngredient(new Ingredient("Lettuce", 1, "head", 15, 1, 3));
        salad.addIngredient(new Ingredient("Tomatoes", 2, "units", 22, 1, 5));
        salad.addIngredient(new Ingredient("Cucumber", 1, "unit", 8, 0.5, 2));


        // Compare the two recipes based on the number of ingredients
        if (cake.compareTo(salad) > 0) {
            System.out.println("\n" + cake.getName() + " has more ingredients than " + salad.getName());
        } else if (cake.compareTo(salad) < 0) {
            System.out.println("\n" + salad.getName() + " has more ingredients than " + cake.getName());
        } else {
            System.out.println("\n" + cake.getName() + " and " + salad.getName() + " have the same number of ingredients.");
        }

    }
}
