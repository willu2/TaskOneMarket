import java.util.ArrayList;
import java.util.Iterator;

public class MarketUtility {

    Glue glue ;
    Roofing roofing ;
    HeaterSoundInsulation heater ;
    ConstructionChemistry chemistry ;

    ArrayList<Item> allTypes = new ArrayList<Item>();

    public MarketUtility() {
        glue = new Glue();
        roofing = new Roofing();
        heater = new HeaterSoundInsulation();
        chemistry = new ConstructionChemistry();

        createPool();
    }

    public void createPool(){
        allTypes.add(glue);
        allTypes.add(roofing);
        allTypes.add(heater);
        allTypes.add(chemistry);
    }

    public void showAllItems(){

        Iterator<Item> it = allTypes.iterator();
        while (it.hasNext()) {
            Item catalog = it.next();
            catalog.getPrice();
        }
    }

    public void showItemsByGrupeName(int grupe_id){
        switch (grupe_id){
            case 1:
                glue.getPrice();
                break;
            case 2:
                roofing.getPrice();
                break;
            case 3:
                heater.getPrice();
                break;
            case 4:
                chemistry.getPrice();
                break;
            default:
                break;
        }
    }

    public void showGrupeLowLimit(int grupe_id, double limit){
        switch (grupe_id){
            case 1:
                glue.getLowThenPrice(limit);
                break;
            case 2:
                roofing.getLowThenPrice(limit);
                break;
            case 3:
                heater.getLowThenPrice(limit);
                break;
            case 4:
                chemistry.getLowThenPrice(limit);
                break;
            default:
                break;
        }
    }

    public void showGrupeHightLimit(int grupe_id, double limit){
        switch (grupe_id){
            case 1:
                glue.getHightThenPrice(limit);
                break;
            case 2:
                roofing.getHightThenPrice(limit);
                break;
            case 3:
                heater.getHightThenPrice(limit);
                break;
            case 4:
                chemistry.getHightThenPrice(limit);
                break;
            default:
                break;
        }
    }
}
