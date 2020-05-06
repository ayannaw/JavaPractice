public class Computer {
    private String manufacturer, processor;
    private double ramSize, processorSpeed;
    private int diskSize;
    private String DEFAULT_COMP_MAN = "MyManufacturer";
    private double DEFAULT_COMP_PROCESSOR_SPEED = 120.5;
    public Computer(String manufacturer, String processor, double ramSize, int diskSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = processorSpeed;
    }

    public Computer(String processor, double ramSize, int diskSize) {
        this.manufacturer = DEFAULT_COMP_MAN;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = DEFAULT_COMP_PROCESSOR_SPEED;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public double computerPower() {
        return ramSize*processorSpeed;
    }

    public double getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    public String toString() {
        String result = "Manufacturer: " + manufacturer
                + "\nCPU: " + processorSpeed
                + "\nRAM: " + ramSize
                + "\nDisk: " + diskSize + " gigabytes"
                + "\nProcessor speed: " + processorSpeed + " gigaHertz";

        return result;
    }

    /*
    * Compares power of this computer and its argument computer
    * returns -1 if this computer has less power
    *          0 if the same, and
    *          +1 if this computer has more power
    * */
    public int compareComputer(Computer aComputer) {
        if(this.computerPower() < aComputer.computerPower()) {
            return -1;
        }
        else if (this.computerPower() == aComputer.computerPower()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
