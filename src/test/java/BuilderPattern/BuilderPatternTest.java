package BuilderPattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderPatternTest {

    @Test
    public void testDefaultValuesInstantiation() {

        Window window1 = new Window.WindowBuilder().build();

        assertNotNull(window1);

        //garantir que nenhum atributo é nulo.
        assertNotNull(window1.getFillBlueValue());
        assertNotNull(window1.getFillGreenValue());
        assertNotNull(window1.getFillBlueValue());
        assertNotNull(window1.getTopCornerX());
        assertNotNull(window1.getTopCornerY());
        assertNotNull(window1.getWindowHeight());
        assertNotNull(window1.getWindowWidth());
        assertNotNull(window1.getWindowTitle());

    }

    @Test
    public void testSendingNullTitleShouldReturnDefaultTitle() {
        Window window1 = new Window.WindowBuilder().withTitle(null).build();

        assertNotNull(window1.getWindowTitle());
    }


}