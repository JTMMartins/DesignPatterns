package BuilderPattern;

public class App {

    public static void main(String[] args) {

        //Primeira Janela...Não definimos nem cor nem titulo. Será atribuido o titulo e a cor defenidas por defeito;
        Window formWindow = new Window.WindowBuilder()
                .withLeftTopcornerPositionX(100)
                .withLeftTopCornerPositionY(100)
                .withHeight(300)
                .withWidth(600)
                .build();

        System.out.println(formWindow.toString() + "\n");

        //Não definimos nada..iremos obter uma janela com todos os valores por defeito
        Window formWindow2 = new Window.WindowBuilder()
                .build();

        System.out.println(formWindow2.toString() + "\n");

        //definimos todos os parametros. Iremos obter uma janela com todos os parametros que indicamos
        Window formWindow3 = new Window.WindowBuilder()
                .withLeftTopcornerPositionX(100)
                .withLeftTopCornerPositionY(100)
                .withHeight(300)
                .withWidth(600)
                .fillWithRGB(125, 180, 28)
                .withTitle("Janela Numero 3")
                .build();

        System.out.println(formWindow3.toString() + "\n");

        //Tentamos criar uma janela enviando null como o titulo..Será atribuido o nome por defeito e os valores por defeito.

        Window formWindow4 = new Window.WindowBuilder()
                .withTitle(null)
                .build();

        System.out.println(formWindow4.toString() + "\n");



    }


}
