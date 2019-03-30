public class Glue extends Item {

    private String[] glueName = {"White Craft", "Glue Yellow", "Wood Glue", "Super Glue",
                         "Hot glue", "Fabric adhesives", "Spray adhesives"};

    private double[] gluePrice = { 21, 12, 45, 12, 32, 8, 77};

    public Glue() {
        super("Glues");
        priceFilling(glueName, gluePrice);
    }
}
