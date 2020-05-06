public class Vegetable extends Food {
    private String name;
    private static final double VEG_PROTEIN_CAL = 55.6;
    private static final double VEG_FAT_CAL = 23.6;
    private static final double VEG_CARBO_CAL = 20.8;
    @Override
    public double percentProtein() {
        return 30.0;
    }

    @Override
    public double percentFat() {
        double percentage = VEG_FAT_CAL / (VEG_CARBO_CAL + VEG_FAT_CAL + VEG_PROTEIN_CAL) * 100;
        return percentage;
    }

    @Override
    public double percentCarbohydrates() {
        return 50.0;
    }

    public Vegetable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Vegetable Name: " + name
                + "\n Percentage of Fat: " + this.percentFat() + "%";
    }
}
