package DecoratorPattern.ExampleONE;

/**
 * O Decorador para objectos do tipo CableTVSubscription
 * os decoradores efectivos serão sempre extensões desta classe.
 */
public class CableTVSubscriptionDecorator implements CableTVSubscription {

    /*
    Utilizamos Protected apenas para garantir que o field será apenas
    visivel para o package e subclasses.
     */

    protected CableTVSubscription cableTVSubscriptionPack;


    public CableTVSubscriptionDecorator(CableTVSubscription cableTVSubscriptionPack) {

        this.cableTVSubscriptionPack = cableTVSubscriptionPack;
    }

    @Override
    public String getChannelName() {

        return cableTVSubscriptionPack.getChannelName();
    }

    @Override
    public double getSubscriptionPrice() {

        return cableTVSubscriptionPack.getSubscriptionPrice();
    }


}
