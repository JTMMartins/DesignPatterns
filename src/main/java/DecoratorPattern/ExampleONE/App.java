package DecoratorPattern.ExampleONE;

public class App {

    public static void main(String[] args) {

        CableTVSubscription pack1 = new SportTVAddOn(new FoxMoviesAddOn(new BasicCableTVSubscriptionPack()));
        System.out.println(pack1.getChannelName() + " = " + String.format("%.2f", pack1.getSubscriptionPrice()));

        CableTVSubscription pack2 = new FoxMoviesAddOn(new AdultChanelAddOn(new BasicCableTVSubscriptionPack()));
        System.out.println(pack2.getChannelName() + " = " + String.format("%.2f", pack2.getSubscriptionPrice()));

        CableTVSubscription pack3 = new AdultChanelAddOn(new BasicCableTVSubscriptionPack());
        System.out.println(pack3.getChannelName() + " = " + String.format("%.2f", pack3.getSubscriptionPrice()));

        CableTVSubscription pack4 = new AdultChanelAddOn((new SportTVAddOn(new BasicCableTVSubscriptionPack())));
        System.out.println(pack4.getChannelName() + " = " + String.format("%.2f", pack4.getSubscriptionPrice()));

        CableTVSubscription pack5 = new SportTVAddOn(new FoxMoviesAddOn(new AdultChanelAddOn(new BasicCableTVSubscriptionPack())));
        System.out.println(pack5.getChannelName() + " = " + String.format("%.2f", pack5.getSubscriptionPrice()));
    }

}
