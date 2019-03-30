public interface ControlMethods {

    public void getPrice();
    public void getLowThenPrice(double limit);
    public void getHightThenPrice(double limit);
    public void priceFilling(String[] names, double[] price);
}
