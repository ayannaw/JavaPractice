public abstract class Food {
    private double calories;

    public abstract double percentProtein();

    public abstract double percentFat();

    public abstract double percentCarbohydrates();

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
