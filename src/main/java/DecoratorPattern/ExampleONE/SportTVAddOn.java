package DecoratorPattern.ExampleONE;

public class SportTVAddOn extends CableTVDecorator {

    private double sportTVPrice = 17.35;

    public SportTVAddOn(CableTV cableTVPack) {

        super(cableTVPack);
    }

    @Override
    public String getChannelName() {

        return cableTVPack.getChannelName() + addSportTV();
    }

    private String addSportTV() {

        return " + SportTV";
    }

    @Override
    public double getSubscriptionPrice() {
        return sportTVPrice + cableTVPack.getSubscriptionPrice();
    }


}
