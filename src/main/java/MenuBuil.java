
//main menu print class
public class MenuBuil {

    //print main menu
    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all catalog ");
        System.out.println(" 2 :> Show by grupe ");
        System.out.println(" 3 :> Show by grupe and Lowest then >>> ");
        System.out.println(" 4 :> Show by grupe and Highest then >>> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }

    //print menu of groupe types
    public void grupeShow(){
        System.out.println("Enter grupe:");
        System.out.println("> 1: Glue ");
        System.out.println("> 2: Roofing ");
        System.out.println("> 3: HeaterSoundInsulation ");
        System.out.println("> 4: ConstructionChemistry ");
    }

    //print price data
    public void priceEnter(){
        System.out.println("Enter limit price:");
    }
}
