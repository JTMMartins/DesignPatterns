package DecoratorPattern.ExampleONE;

/**
 * O Decorador para objectos do tipo CableTV
 */
public class CableTVDecorator implements CableTV {


    protected CableTV cableTVPack;


    public CableTVDecorator(CableTV cableTVPack) {

        this.cableTVPack = cableTVPack;
    }

    @Override
    public String getChannelName() {
        return cableTVPack.getChannelName();
    }

    @Override
    public double getSubscriptionPrice() {
        return cableTVPack.getSubscriptionPrice();
    }


}
