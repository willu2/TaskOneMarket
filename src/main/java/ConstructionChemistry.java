public class ConstructionChemistry extends Item{

    private String[] chemiName = {"Foam mounting", "Sealant", "Silicon", "Concrete contact",
            "Mastic", "Additives to concrete", "Antiseptic"};

    private double[] chemiPrice = { 56.33, 48.23, 85, 83.1, 19, 58, 49};

    public ConstructionChemistry() {
        super("ConsChemistry");
        priceFilling(chemiName, chemiPrice);
    }
}
