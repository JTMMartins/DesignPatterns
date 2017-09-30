package DecoratorPattern.ExampleONE;

public class FoxMoviesAddOn extends CableTVDecorator {

    private double foxMoviesPrice = 9.99;

    public FoxMoviesAddOn(CableTV specialCableTV) {

        super(specialCableTV);
    }

    @Override
    public String getChannelName() {

        return cableTVPack.getChannelName() + addFoxMovies();
    }

    private String addFoxMovies() {
        return " + FoxMovies";
    }

    @Override
    public double getSubscriptionPrice() {
        return foxMoviesPrice + cableTVPack.getSubscriptionPrice();
    }

}
