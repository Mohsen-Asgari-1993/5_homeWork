package H_W_5.Tamrin1;

public abstract class ElectronicsEquipments extends Products {

    protected String energyGrade;

    public ElectronicsEquipments(String brand, double price, String energyGrade) {
        super(brand, price);
        this.energyGrade = energyGrade;
    }
}
