package CreationalPatterns.AbstractFactory.Components;

public class AsusManufacturer extends Company {


    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
