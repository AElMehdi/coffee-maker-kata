import drinks.Orange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class DrinkMakerOrangeTest {

    @Mock
    Display display;
    DrinkMaker drinkMaker;

    @BeforeEach
    void initialize() {
        drinkMaker = new DrinkMaker(display);
    }

    @Test
    void should_make_an_orange_when_receive_O() {
        assertThat(drinkMaker.makeFrom("O:::")).isEqualTo(new Orange(0));
    }
}