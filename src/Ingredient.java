public class Ingredient {
    private String name;
    private double quantity;  // Quantity of the ingredient
    private String unit;      // Unit of measurement
    private double caloriesPerUnit;
    private double proteinPerUnit;
    private double carbsPerUnit;

    // Constructor
    public Ingredient(String name, double quantity, String unit, double caloriesPerUnit, double proteinPerUnit, double carbsPerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.caloriesPerUnit = caloriesPerUnit;
        this.proteinPerUnit = proteinPerUnit;
        this.carbsPerUnit = carbsPerUnit;
    }

    // Getters for nutritional values
    public double getCalories() {
        return quantity * caloriesPerUnit;
    }

    public double getProtein() {
        return quantity * proteinPerUnit;
    }

    public double getCarbs() {
        return quantity * carbsPerUnit;
    }

    @Override
    public String toString() {
        return quantity + " " + unit + " of " + name;
    }
}
