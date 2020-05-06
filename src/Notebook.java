public class Notebook extends Computer {
    private double screenSize, weight;
    private static final String DEFAULT_NOTEBOOK_MANUFACTURER = "MyBrand";
    public Notebook(String manufacturer, String processor, double ramSize, int diskSize,
                    double processorSpeed, double screenSize, double weight) {
        super(manufacturer, processor, ramSize, diskSize, processorSpeed);
        this.screenSize = screenSize;
        this.weight = weight;
    }

    public Notebook(String processor, double ram, int disk, double processorSpeed, double screenSize, double weight) {
        this(DEFAULT_NOTEBOOK_MANUFACTURER, processor, ram, disk, processorSpeed, screenSize, weight);
    }

    public Notebook(String processor, double ramSize, int diskSize) {
        super(processor, ramSize, diskSize);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String result = super.toString() +
                "\nScreen Size: " + screenSize + " inches"
                + "\nWeight: " + weight + " pounds";

        return result;
    }
}
