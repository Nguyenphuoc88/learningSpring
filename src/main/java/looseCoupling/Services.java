package looseCoupling;

public class Services {

    private SortAlgorithm sortAlorithm;
    public Services(SortAlgorithm sortAlgorithm){
        this.sortAlorithm = sortAlgorithm;
    }

    public void complexBusiness(int[] array){
        sortAlorithm.sort(array);
    }
}
