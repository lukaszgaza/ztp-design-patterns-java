import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    @Test
    public void shouldHaveBuilderClass() {
        Window.Builder builder = Window.newBuilder();
    }

    @Test
    public void shouldBuilderBuildWindow() {
        Window window = Window.newBuilder().build();
    }

    @Test
    public void shouldReturnCorrectDefaultValues() {
        Window window = Window.newBuilder().build();
        assertEquals(0, window.getX());
        assertEquals(0, window.getY());
        assertEquals(100, window.getWidth());
        assertEquals(100, window.getHeight());
        assertEquals("", window.getTitle());
    }

    @Test
    public void shouldReturnCorrectValuesSetByBuilder() {
        Window window = Window.newBuilder().x(20).y(20).width(200).height(200).title("some window").build();
        assertEquals(20, window.getX());
        assertEquals(20, window.getY());
        assertEquals(200, window.getWidth());
        assertEquals(200, window.getHeight());
        assertEquals("some window", window.getTitle());
    }
}