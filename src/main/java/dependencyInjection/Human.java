package dependencyInjection;

public class Human {

    private Outfit outfit;
    public Human(){

    }

    public void goOut(){
        outfit.wear();
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
