import drinks.Tea;
import orders.NoDrink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class DrinkMakerTeaTest {

    public static final String TEA_COMMAND_WITH_PRICE = "T:::4";

    @Mock
    Display display;
    DrinkMaker drinkMaker;

    public DrinkMakerTeaTest() {
    }

    @BeforeEach
    void initialize() {
        drinkMaker = new DrinkMaker(display);
    }

    @Test
    void should_make_a_tea_when_receive_T() {
        assertThat(drinkMaker.makeFrom(TEA_COMMAND_WITH_PRICE)).isEqualTo(new Tea(0));
    }

    @Test
    void should_serve_a_tea_without_a_stick_when_receive_T() {
        assertThat(drinkMaker.makeFrom(TEA_COMMAND_WITH_PRICE)).isEqualTo(new Tea(0, false));
    }

    @Test
    void should_make_a_tea_with_1_sugar_when_receive_a_T_1() {
        assertThat(drinkMaker.makeFrom("T:1::4")).isEqualTo(new Tea(1, true));
    }

    @Test
    void should_make_a_tea_with_2_sugars_when_receive_a_T_2() {
        assertThat(drinkMaker.makeFrom("T:2::4")).isEqualTo(new Tea(2, true));
    }

    @Test
    void should_serve_a_tea_with_a_stick_when_ordered_with_sugar_a_T_3() {
        assertThat(drinkMaker.makeFrom("T:3::4")).isEqualTo(new Tea(3, true));
    }

    @Test
    void should_return_a_No_Drink_if_provided_with_2_and_asked_for_a_tea() {
        assertThat(drinkMaker.makeFrom("T:::2")).isInstanceOf(NoDrink.class);
    }

    @Test
    void should_make_tea_if_provided_with_4_cents() {
        assertThat(drinkMaker.makeFrom("T:::4")).isEqualTo(new Tea(0));
    }

    @Test
    void should_make_tea_if_provided_with_more_than_4_cents() {
        assertThat(drinkMaker.makeFrom("T:::50")).isEqualTo(new Tea(0));
    }
}