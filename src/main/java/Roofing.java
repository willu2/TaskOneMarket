public class Roofing extends Item {

    private String[] roofName = {"Metal tile", "Keramoplast", "Slate",
                                 "Polycarbonate", "Galvanized sheet", "Corrugated board"};

    private double[] roofPrice = {88.5, 120.4, 81, 589, 332, 11, 74.7};

    public Roofing() {
        super("Roffings");
        priceFilling(roofName, roofPrice);
    }

}
