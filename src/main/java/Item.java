import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class Item implements ControlMethods {

    private String _itemGroupeName;

    public Map<String, Double> priceMap = new HashMap<String, Double>();

    public Item(String itemGroupeName) {
        this._itemGroupeName = itemGroupeName;
    }

    public void getPrice(){
        System.out.println(_itemGroupeName);

        /*for(Map.Entry<String, Double> item : topTen.entrySet()){
            System.out.printf("Name: %s  Price: %s \n", item.getKey(), item.getValue());
        }*/

        priceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("<----->");
    }

    public void getLowThenPrice(double limit){
        System.out.println(_itemGroupeName);
        for(Map.Entry<String, Double> item : priceMap.entrySet()){
            if(item.getValue() > limit){
                continue;
            }
            System.out.printf("Name: %s  Price: %s \n", item.getKey(), item.getValue());
        }
        System.out.println("<----->");
    }

    public void getHightThenPrice(double limit){
        System.out.println(_itemGroupeName);
        for(Map.Entry<String, Double> item : priceMap.entrySet()){
            if(item.getValue() < limit){
                continue;
            }
            System.out.printf("Name: %s  Price: %s \n", item.getKey(), item.getValue());
        }
        System.out.println("<----->");
    }

    public void priceFilling(String[] names, double[] price){
        for (int i=0; i < names.length; i++){
            priceMap.put(names[i], price[i]);
        }
    }
}
