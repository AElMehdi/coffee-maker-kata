import drinks.HotChocolate;
import orders.NoDrink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class DrinkMakerChocolateTest {

    @Mock
    private Display display;
    private DrinkMaker drinkMaker;

    @BeforeEach
    void initialize() {
        drinkMaker = new DrinkMaker(display);
    }


    @Test
    void should_make_a_hot_chocolate_when_receive_H() {
        assertThat(drinkMaker.makeFrom("H:::5")).isEqualTo(new HotChocolate(0));
    }

    @Test
    void should_make_a_hot_chocolate_with_1_sugar_when_receive_H_1() {
        assertThat(drinkMaker.makeFrom("H:1::5")).isEqualTo(new HotChocolate(1, true));
    }

    @Test
    void should_make_a_hot_chocolate_with_2_sugar_when_receive_H_2() {
        assertThat(drinkMaker.makeFrom("H:2::5")).isEqualTo(new HotChocolate(2, true));
    }

    @Test
    void should_serve_a_hot_chocolate_with_a_stick_when_ordered_with_sugar_a_H_3() {
        assertThat(drinkMaker.makeFrom("H:3::5")).isEqualTo(new HotChocolate(3, true));
    }

    @Test
    void should_return_a_No_Drink_if_provided_with_less_than_5_cents_and_asked_for_a_hot_chocolate() {
        assertThat(drinkMaker.makeFrom("H:::3")).isInstanceOf(NoDrink.class);
    }

    @Test
    void should_not_make_hot_chocolate_if_provided_with_5_cents() {
        assertThat(drinkMaker.makeFrom("H:::5")).isEqualTo(new HotChocolate(0));
    }
}