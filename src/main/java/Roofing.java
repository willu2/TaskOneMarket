public class Roofing extends Item {

    //Array names of item type - roofing
    private String[] roofName = {"Metal tile", "Keramoplast", "Slate",
                                 "Polycarbonate", "Galvanized sheet", "Corrugated board"};

    //Array price of item type - roofing
    private double[] roofPrice = {88.5, 120.4, 81, 589, 332, 11, 74.7};

    public Roofing() {
        super("Roffings");
        priceFilling(roofName, roofPrice);
    }

}
