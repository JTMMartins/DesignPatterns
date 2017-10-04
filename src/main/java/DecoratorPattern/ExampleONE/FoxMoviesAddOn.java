package DecoratorPattern.ExampleONE;

public class FoxMoviesAddOn extends CableTVSubscriptionDecorator {

    private double foxMoviesPrice = 9.99;

    public FoxMoviesAddOn(CableTVSubscription specialCableTVSubscription) {

        super(specialCableTVSubscription);
    }

    @Override
    public String getChannelName() {

        return cableTVSubscriptionPack.getChannelName() + addFoxMovies();
    }

    private String addFoxMovies() {

        return " + FoxMovies";
    }

    @Override
    public double getSubscriptionPrice() {

        return foxMoviesPrice + cableTVSubscriptionPack.getSubscriptionPrice();
    }

}
