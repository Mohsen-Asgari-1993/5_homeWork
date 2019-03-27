package H_W_5.Tamrin1;

public class Radio extends ElectronicsEquipments {

    public Radio(String brand, double price, String energyGrade){
        super(brand,price,energyGrade);
    }

    @Override
    public String displayInformation(){
        return ("Brand: " + super.brand +"\t\tEnergy Grade: "+super.energyGrade+"\t\tPrice: "+super.price);
    }
}
