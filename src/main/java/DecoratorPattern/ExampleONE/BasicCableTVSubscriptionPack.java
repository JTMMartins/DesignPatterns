package DecoratorPattern.ExampleONE;

/**
 * A implementacao mais básica do interface, neste caso irá ser o nosso
 * produto base ao qual serão adicionados os Addons.
 */
public class BasicCableTVSubscriptionPack implements CableTVSubscription {

    private double basicTVSubscription = 24.99;

    @Override
    public String getChannelName() {

        return "Servico TV Básico";
    }

    @Override
    public double getSubscriptionPrice() {

        return basicTVSubscription;
    }


}
