package BuilderPattern.BuilderMethodONE;

public class App {

    public static void main(String[] args) {

        //Vamos criar um bolo de cereja

        Cake cherryCake = new Cake.CakeBuilder()
                .withSugar(250)
                .withButter(300)
                .withMilk(100)
                .withCherry(3)
                .build();
        System.out.println(cherryCake.toString());

        //Agora vamos criar um bolo de morango

        Cake strawberryCake = new Cake.CakeBuilder()
                .withSugar(450)
                .withButter(400)
                .withMilk(200)
                .withStrawberry(20)
                .build();

        System.out.println(strawberryCake.toString());


    }


}
