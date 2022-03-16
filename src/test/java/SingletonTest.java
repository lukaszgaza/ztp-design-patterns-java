import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void shouldReturnSingletonInstance() {
        assertNotNull(Singleton.getInstance());
    }

    @Test
    public void shouldNotHavePublicConstructor() {
        Class<Singleton> clazz = Singleton.class;
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor: constructors) {
            if (Modifier.isPublic(constructor.getModifiers()) || Modifier.isProtected(constructor.getModifiers())) {
                fail();
            }
        }
    }

    @Test
    public void shouldAlwaysReturnTheSameInstance() {
        assertTrue(Singleton.getInstance() == Singleton.getInstance());
    }

}