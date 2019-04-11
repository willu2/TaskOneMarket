import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hypermarket {

    public static void main(String[] args){

       MarketUtility market = new MarketUtility();
       MenuBuil menu = new MenuBuil();  //create main menu

       boolean exit = false;

       do {
            int pos = 0;
            double price = 0.0;

            menu.mainManu();  //show text main menu

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));   //get input data

            //circle input menu
            try {
                switch (Integer.parseInt(in.readLine())) {
                    case 1:
                        market.showAllItems();
                        break;
                    case 2:
                        menu.grupeShow();
                        pos = Integer.parseInt(in.readLine());
                        market.showItemsByGrupeName(pos);
                        break;
                    case 3:
                        menu.grupeShow();
                        pos = Integer.parseInt(in.readLine());
                        menu.priceEnter();
                        price = Double.parseDouble(in.readLine());
                        market.showGrupeLowLimit(pos, price);
                        break;
                    case 4:
                        menu.grupeShow();
                        pos = Integer.parseInt(in.readLine());
                        menu.priceEnter();
                        price = Double.parseDouble(in.readLine());
                        market.showGrupeHightLimit(pos, price);
                        break;
                    case 8:
                        exit = true;
                        break;
                    default:
                        System.out.println("Try again...");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }while (!exit);
    }
}
