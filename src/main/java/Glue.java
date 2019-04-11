public class Glue extends Item {

    //Array names of item type - glue
    private String[] glueName = {"White Craft", "Glue Yellow", "Wood Glue", "Super Glue",
                         "Hot glue", "Fabric adhesives", "Spray adhesives"};

    //Array price of item type - glue
    private double[] gluePrice = { 21, 12, 45, 12, 32, 8, 77};

    public Glue() {
        super("Glues");
        priceFilling(glueName, gluePrice);
    }
}
