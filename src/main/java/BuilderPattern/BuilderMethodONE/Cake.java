package BuilderPattern.BuilderMethodONE;


/*
* Classe Cake. Esta é a nossa classe externa
*/
public class Cake {

    private final double sugar;
    private final double butter;
    private final double milk;
    private final int cherry;
    private final int strawberry;


    /*
    *Classe interna CakeBuilder
    */
    public static class CakeBuilder {
        private double sugar;
        private double butter;
        private double milk;
        private int cherry;
        private int strawberry;

        public CakeBuilder withSugar(double sugarQuantity) {
            this.sugar = sugarQuantity;
            return this;
        }

        public CakeBuilder withButter(double butterQuantity) {
            this.butter = butterQuantity;
            return this;
        }

        public CakeBuilder withMilk(double milkQuantity) {
            this.milk = milkQuantity;
            return this;
        }

        public CakeBuilder withCherry(int cherryQuantity) {
            this.cherry = cherryQuantity;
            return this;
        }

        public CakeBuilder withStrawberry(int strawberryQuantity) {
            this.strawberry = strawberryQuantity;
            return this;
        }

        //devolve o objecto completamente formado
        public Cake build() {

            return new Cake(this);
        }
    }
    /* FIM DA CLASSE INTERNA */

    /*
    *Construtor privado da classe externa. Sendo privado apenas a classe interna
    *terá acesso a ele.
    *o código cliente não conseguirá criar Cake cake=new Cake();
    */
    private Cake(CakeBuilder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
        this.strawberry = builder.strawberry;
    }

    @Override
    public String toString() {
        return "Sai um bolo com " + "Acucar = " + sugar + ", Manteiga = " + butter + ", Leite = " + milk + ", Cerejas = " + cherry + ", Morangos = " + strawberry + "\n";
    }


}

