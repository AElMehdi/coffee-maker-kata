import drinks.Orange;
import orders.NoDrink;
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
        assertThat(drinkMaker.makeFrom("O:::6")).isEqualTo(new Orange(0));
    }

    @Test
    void should_make_an_orange_with_sugar_and_serve_with_a_stick_when_passed_O_3() {
        assertThat(drinkMaker.makeFrom("O:3::6")).isEqualTo(new Orange(3, true));
    }

    @Test
    void should_return_a_No_Drink_if_provided_with_less_than_6_cents_and_asked_for_an_orange() {
        assertThat(drinkMaker.makeFrom("O:3::3")).isInstanceOf(NoDrink.class);
    }
}