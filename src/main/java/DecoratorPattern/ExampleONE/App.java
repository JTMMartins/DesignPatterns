package DecoratorPattern.ExampleONE;

public class App {

    public static void main(String[] args) {

        CableTV pack1 = new SportTVAddOn(new FoxMoviesAddOn(new BasicCableTV()));
        System.out.println(pack1.getChannelName() + " = " + String.format("%.2f", pack1.getSubscriptionPrice()));

        CableTV pack2 = new FoxMoviesAddOn(new AdultChanelAddOn(new BasicCableTV()));
        System.out.println(pack2.getChannelName() + " = " + String.format("%.2f", pack2.getSubscriptionPrice()));

        CableTV pack3 = new AdultChanelAddOn(new BasicCableTV());
        System.out.println(pack3.getChannelName() + " = " + String.format("%.2f", pack3.getSubscriptionPrice()));

        CableTV pack4 = new AdultChanelAddOn((new SportTVAddOn(new BasicCableTV())));
        System.out.println(pack4.getChannelName() + " = " + String.format("%.2f", pack4.getSubscriptionPrice()));

        CableTV pack5 = new SportTVAddOn(new FoxMoviesAddOn(new AdultChanelAddOn(new BasicCableTV())));
        System.out.println(pack5.getChannelName() + " = " + String.format("%.2f", pack5.getSubscriptionPrice()));
    }

}
