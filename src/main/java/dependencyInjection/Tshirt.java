package dependencyInjection;

public class Tshirt implements Outfit{

    @Override
    public void wear() {
        System.out.println("Wear tshirt");
    }
}
