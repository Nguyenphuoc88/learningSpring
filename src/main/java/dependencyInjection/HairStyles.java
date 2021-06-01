package dependencyInjection;

public class HairStyles implements Outfit{
    @Override
    public void wear() {
        System.out.println("HairStyles");
    }
}
