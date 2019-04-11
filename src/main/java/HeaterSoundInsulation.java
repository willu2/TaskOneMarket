public class HeaterSoundInsulation extends Item {

    //Array names of item type - heater
    private String[] heaterName = {"Polyfoam", "Foam", "Mineral wool", "Glass wool",
            "Foam polystyrene", "Technical isolation", "Roofing film"};

    //Array price of item type - heater
    private double[] heaterPrice = { 15.4, 112, 245, 56, 2, 91, 21};

    public HeaterSoundInsulation() {
        super("Heaters");
        priceFilling(heaterName, heaterPrice);
    }
}
