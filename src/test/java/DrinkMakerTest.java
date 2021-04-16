import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {

    public static final String TEA_COMMAND_WITH_PRICE = "T:::4";

    private DrinkMaker drinkMaker;

    @BeforeEach
    void initialize() {
        drinkMaker = new DrinkMaker();
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
    void should_not_make_tea_if_provided_with_less_than_4_cents() {
        assertThat(drinkMaker.makeFrom("T:::2")).isEqualTo(null);
    }

    @Test
    void should_make_a_hot_chocolate_when_receive_H() {
        assertThat(drinkMaker.makeFrom("H")).isEqualTo(new HotChocolate(0));
    }

    @Test
    void should_make_a_hot_chocolate_with_1_sugar_when_receive_H_1() {
        assertThat(drinkMaker.makeFrom("H:1")).isEqualTo(new HotChocolate(1, true));
    }

    @Test
    void should_make_a_hot_chocolate_with_2_sugar_when_receive_H_2() {
        assertThat(drinkMaker.makeFrom("H:2")).isEqualTo(new HotChocolate(2, true));
    }

    @Test
    void should_serve_a_hot_chocolate_with_a_stick_when_ordered_with_sugar_a_H_3() {
        assertThat(drinkMaker.makeFrom("H:3")).isEqualTo(new HotChocolate(3, true));
    }

    @Test
    void should_make_a_coffee_when_receive_C() {
        assertThat(drinkMaker.makeFrom("C")).isEqualTo(new Coffee(0));
    }

    @Test
    void should_make_a_coffee_with_two_sugars_when_receive_C_2() {
        assertThat(drinkMaker.makeFrom("C:2")).isEqualTo(new Coffee(2, true));
    }

    @Test
    void should_serve_a_coffee_with_a_stick_when_ordered_with_sugar_a_C_3() {
        assertThat(drinkMaker.makeFrom("C:3")).isEqualTo(new Coffee(3, true));
    }
}
