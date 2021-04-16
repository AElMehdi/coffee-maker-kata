import drinks.Coffee;
import orders.NoDrink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class DrinkMakerCoffeeTest {

    @Mock
    private Display display;
    private DrinkMaker drinkMaker;

    @BeforeEach
    void initialize() {
        drinkMaker = new DrinkMaker(display);
    }

    @Test
    void should_make_a_coffee_with_two_sugars_when_receive_C_2() {
        assertThat(drinkMaker.makeFrom("C:2::6")).isEqualTo(new Coffee(2, true));
    }

    @Test
    void should_serve_a_coffee_with_a_stick_when_ordered_with_sugar_a_C_3() {
        assertThat(drinkMaker.makeFrom("C:3::6")).isEqualTo(new Coffee(3, true));
    }

    @Test
    void should_return_a_No_Drink_if_provided_with_less_than_6_cents_and_asked_for_a_coffee() {
        assertThat(drinkMaker.makeFrom("C:::2")).isInstanceOf(NoDrink.class);
    }

    @Test
    void should_make_coffee_if_provided_with_6_cents() {
        assertThat(drinkMaker.makeFrom("C:::6")).isEqualTo(new Coffee(0));
    }

    @Test
    void should_get_a_message_containing_4_when_provided_with_2_and_asked_for_a_coffee() {
        drinkMaker.makeFrom("C:::2");

        verify(display).print("Amount needed 4");
    }

    @Test
    void should_get_a_message_containing_3_when_provided_with_3_and_asked_for_a_coffee() {
        drinkMaker.makeFrom("C:::3");

        verify(display).print("Amount needed 3");
    }
}
