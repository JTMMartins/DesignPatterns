package DecoratorPattern.ExampleONE;

public class AdultChanelAddOn extends CableTVSubscriptionDecorator {

    double adultChannelPrice = 19.90;

    public AdultChanelAddOn(CableTVSubscription specialCableTVSubscription) {

        super(specialCableTVSubscription);
    }

    @Override
    public String getChannelName() {

        return cableTVSubscriptionPack.getChannelName() + addAdultChannel();
    }

    private String addAdultChannel() {

        return " + Adulto";
    }

    @Override
    public double getSubscriptionPrice() {

        return adultChannelPrice + cableTVSubscriptionPack.getSubscriptionPrice();
    }


}
