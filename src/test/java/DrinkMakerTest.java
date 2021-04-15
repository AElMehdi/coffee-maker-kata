import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {

    private DrinkMaker drinkMaker = new DrinkMaker();

    @Test
    void should_make_a_tea_when_receive_T() {
        assertThat(drinkMaker.makeFrom("T")).isInstanceOf(Tea.class);
    }
}
