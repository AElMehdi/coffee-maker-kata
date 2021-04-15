import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {

    private DrinkMaker drinkMaker;

    @BeforeEach
    void initialize() {
        drinkMaker = new DrinkMaker();
    }

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
        assertThat(drinkMaker.makeFrom("H")).isEqualTo(new HotChocolate(0));
    }

   @Test
    void should_make_a_hot_chocolate_with_1_sugar_when_receive_H_1() {
        assertThat(drinkMaker.makeFrom("H:1")).isEqualTo(new HotChocolate(1));
    }

   @Test
    void should_make_a_hot_chocolate_with_2_sugar_when_receive_H_2() {
        assertThat(drinkMaker.makeFrom("H:2")).isEqualTo(new HotChocolate(2));
    }

    @Test
    void should_make_a_coffee_when_receive_C() {
        assertThat(drinkMaker.makeFrom("C")).isEqualTo(new Coffee(0));
    }

    @Test
    void should_make_a_coffee_with_two_sugars_when_receive_C_2() {
        assertThat(drinkMaker.makeFrom("C:2")).isEqualTo(new Coffee(2));
    }
}
