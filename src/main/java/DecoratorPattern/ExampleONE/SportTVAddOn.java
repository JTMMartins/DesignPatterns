package DecoratorPattern.ExampleONE;

public class SportTVAddOn extends CableTVSubscriptionDecorator {

    private double sportTVPrice = 19.99;

    public SportTVAddOn(CableTVSubscription cableTVSubscriptionPack) {

        super(cableTVSubscriptionPack);
    }

    @Override
    public String getChannelName() {

        return cableTVSubscriptionPack.getChannelName() + addSportTV();
    }

    private String addSportTV() {

        return " + SportTV";
    }

    @Override
    public double getSubscriptionPrice() {

        return sportTVPrice + cableTVSubscriptionPack.getSubscriptionPrice();
    }


}
