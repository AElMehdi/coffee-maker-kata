import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {

    private DrinkMaker drinkMaker = new DrinkMaker();

    @Test
    void should_make_a_tea_when_receive_T() {
        assertThat(drinkMaker.makeFrom("T::")).isEqualTo(new Tea(0));
    }

  @Test
    void should_make_a_tea_with_1_sugar_when_receive_a_T_1() {
        assertThat(drinkMaker.makeFrom("T:1")).isEqualTo(new Tea(1));
    }

  @Test
    void should_make_a_tea_with_2_sugars_when_receive_a_T_2() {
        assertThat(drinkMaker.makeFrom("T:2")).isEqualTo(new Tea(2));
    }

    @Test
    void should_make_a_hot_chocolate_when_receive_H() {
        assertThat(drinkMaker.makeFrom("H")).isInstanceOf(HotChocolate.class);
    }

    @Test
    void should_make_a_coffee_when_receive_C() {
        assertThat(drinkMaker.makeFrom("C")).isInstanceOf(Coffee.class);
    }
}
