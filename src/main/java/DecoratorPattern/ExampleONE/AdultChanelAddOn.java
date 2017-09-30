package DecoratorPattern.ExampleONE;

public class AdultChanelAddOn extends CableTVDecorator {

    double adultChannelPrice = 19.90;

    public AdultChanelAddOn(CableTV specialCableTV) {

        super(specialCableTV);
    }

    @Override
    public String getChannelName() {

        return cableTVPack.getChannelName() + addAdultChannel();
    }

    private String addAdultChannel() {
        return " + Adulto";
    }

    @Override
    public double getSubscriptionPrice() {
        return adultChannelPrice + cableTVPack.getSubscriptionPrice();
    }


}
