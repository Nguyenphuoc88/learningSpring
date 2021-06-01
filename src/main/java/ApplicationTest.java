import dependencyInjection.*;
import looseCoupling.BubbleSortAlgorithm;
import looseCoupling.QuickSortAlgorithm;
import looseCoupling.Services;
import looseCoupling.SortAlgorithm;

import java.lang.reflect.Array;

public class ApplicationTest {
    
    public static void notMain(String[] arrs){

        int[] array = {1,3,5,7,9};
        Services services;
        SortAlgorithm bubleSort = new BubbleSortAlgorithm();
        SortAlgorithm quickSort = new QuickSortAlgorithm();

        services = new Services(bubleSort);

        services.complexBusiness(array);
    }

    public static void main2(String[] args){

        Outfit tshirt = new Tshirt();
        Outfit hairStyleA = new HairStyles();
        Outfit diamond = new Accessories();

        Human manA = new Human();
        manA.setOutfit(tshirt);
        manA.setOutfit(hairStyleA);
        manA.setOutfit(diamond);

        manA.goOut();

    }
}
