package DecoratorPattern.ExampleONE;


/**
 * Interface que define os métodos que devem ser implementados.
 * A utilizacao do Interface permite tratar todos os objectos
 * que implementam o interface como sendo um objecto do tipo CableTVSubscription
 */
public interface CableTVSubscription {


    String getChannelName();

    double getSubscriptionPrice();
}
