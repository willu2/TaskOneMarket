import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Market model of goods
abstract class Item implements ControlMethods {

    private String _itemGroupeName;

    //array of prices
    public Map<String, Double> priceMap = new HashMap<String, Double>();

    public Item(String itemGroupeName) {
        this._itemGroupeName = itemGroupeName;
    }

    //Print all sorted prices for grupe
    public void getPrice(){
        System.out.println(_itemGroupeName);

        priceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("<----->");
    }

    //print price limit (lowest)
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

    //print price limit (hight)
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

    //add names and prices to map
    public void priceFilling(String[] names, double[] price){
        for (int i=0; i < names.length; i++){
            priceMap.put(names[i], price[i]);
        }
    }
}
