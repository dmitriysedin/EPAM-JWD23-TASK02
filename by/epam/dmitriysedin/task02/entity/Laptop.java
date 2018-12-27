package by.epam.dmitriysedin.task02.entity;

public class Laptop extends Appliance{

	private double batteryCapacity;
	private String operationSystem;
	private double memoryRom;
	private double systemMemory;
	private double processor;
	private double displayInches;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, String operationSystem, double memoryRom, double systemMemory,
                  double processor, double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.operationSystem = operationSystem;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.processor = processor;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getProcessor() {
        return processor;
    }

    public void setProcessor(double processor) {
        this.processor = processor;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.batteryCapacity, batteryCapacity) != 0) return false;
        if (Double.compare(laptop.memoryRom, memoryRom) != 0) return false;
        if (Double.compare(laptop.systemMemory, systemMemory) != 0) return false;
        if (Double.compare(laptop.processor, processor) != 0) return false;
        if (Double.compare(laptop.displayInches, displayInches) != 0) return false;
        return operationSystem != null ? operationSystem.equals(laptop.operationSystem) : laptop.operationSystem == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (operationSystem != null ? operationSystem.hashCode() : 0);
        temp = Double.doubleToLongBits(memoryRom);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(systemMemory);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(processor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(displayInches);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", operationSystem='" + operationSystem + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", processor=" + processor +
                ", displayInches=" + displayInches +
                '}';
    }
}
