package H_W_5.Tamrin1;

public class TV extends ElectronicsEquipments {
    private int inch;
    private String type;

    public TV(String brand, double price,String energyGrade, int inch , String type) {
        super(brand, price, energyGrade);
        this.inch = inch;
        this.type=type;
    }
}
