package BuilderPattern.BuilderMethodONE;

public class Window {

    private final int topCornerX;
    private final int topCornerY;
    private final int windowWidth;
    private final int windowHeight;
    private final int fillRedValue;
    private final int fillGreenValue;
    private final int fillBlueValue;
    private final String windowTitle;


    public static final class WindowBuilder {
        private int topCornerX;
        private int topCornerY;
        private int windowWidth = 300; // se nada for enviado ao builder este vai ser o valor padrão.
        private int windowHeight = 300; // se nada for enviado ao builder este vai ser o valor padrão.
        private int fillRedValue = 255; // se nada for enviado ao builder este vai ser o valor padrão.
        private int fillGreenValue = 255; // se nada for enviado ao builder este vai ser o valor padrão.
        private int fillBlueValue = 255; // se nada for enviado ao builder este vai ser o valor padrão.
        private String windowTitle = "janela sem nome"; // se nada for enviado ao builder este vai ser o valor padrão.


        public WindowBuilder withLeftTopcornerPositionX(int topCornerX) {

            //colocamos uma condicão para que as coordenadas não
            //fiquem fora de uma zona pré-definida
            if (isWithinRange(topCornerX, 0, 1024)) {
                topCornerX = 0;
            }

            this.topCornerX = topCornerX;
            return this;
        }

        public WindowBuilder withLeftTopCornerPositionY(int topCornerY) {

            //colocamos uma condicão para que as coordenadas não
            //fiquem fora de uma zona pré-definida
            if (isWithinRange(topCornerY, 0, 800)) {
                topCornerY = 0;
            }

            this.topCornerY = topCornerY;
            return this;
        }

        public WindowBuilder withWidth(int windowWidth) {

            //colocamos uma condicão para que as coordenadas não
            //fiquem fora de uma zona pré-definida
            if (isWithinRange(windowWidth, 1, 600)) {
                windowWidth = 300;
            }

            this.windowWidth = windowWidth;
            return this;
        }

        public WindowBuilder withHeight(int windowHeight) {

            //colocamos uma condicão para que as coordenadas não
            //fiquem fora de uma zona pré-definida

            if (isWithinRange(windowHeight, 1, 600)) {
                windowHeight = 300;
            }

            this.windowHeight = windowHeight;
            return this;
        }

        public WindowBuilder fillWithRGB(int red, int green, int blue) {

            //Garantimos que os parametros para o RGB não saiem fora do range, e se sair
            //criamos um valor por defeito como cor para preencher a janela (255,255,255)

            if ((isWithinRange(red, 0, 255) | (isWithinRange(green, 0, 255)) | (isWithinRange(blue, 0, 255)))) {

                red = 255;
                green = 255;
                blue = 255;
            }

            this.fillRedValue = red;
            this.fillGreenValue = green;
            this.fillBlueValue = blue;
            return this;

        }

        public WindowBuilder withTitle(String title) {

            if (title != null && !title.equals("")) {
                this.windowTitle = title;
            } else {
                this.windowTitle = " Janela Sem Nome ";
            }
            return this;
        }

        public Window build() {
            return new Window(this);
        }

        /*
         * verifies if a value is out of accepted range
         */
        private boolean isWithinRange(int value, int min, int max) {
            return (value < min || value > max);
        }
    }

    public Window(WindowBuilder builder) {
        this.topCornerX = builder.topCornerX;
        this.topCornerY = builder.topCornerY;
        this.windowHeight = builder.windowHeight;
        this.windowWidth = builder.windowWidth;
        this.fillRedValue = builder.fillRedValue;
        this.fillGreenValue = builder.fillGreenValue;
        this.fillBlueValue = builder.fillBlueValue;
        this.windowTitle = builder.windowTitle;
    }

    @Override
    public String toString() {
        return "Vou criar uma janela com o nome " + windowTitle + " comecando em coordenada X = " + topCornerX + " e coordenada Y = " + topCornerY + " com o comprimento de " + windowWidth + " pixeis e altura de " + windowHeight +
                " pixeis, e vou preenche-la com a cor (" + fillRedValue + "," + fillGreenValue + "," + fillBlueValue + ")";
    }

    public int getTopCornerX() {
        return topCornerX;
    }

    public int getTopCornerY() {
        return topCornerY;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public int getFillRedValue() {
        return fillRedValue;
    }

    public int getFillGreenValue() {
        return fillGreenValue;
    }

    public int getFillBlueValue() {
        return fillBlueValue;
    }
}
