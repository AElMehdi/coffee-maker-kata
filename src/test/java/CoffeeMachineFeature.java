import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMachineFeature {
    private CoffeeMaker coffeeMaker = new CoffeeMaker();

    @Test
    void should_return_T_1_0_when_receiving_tea_with_1_sugar_order() {
        Order order = new Order("tea", 1);

        String message = coffeeMaker.process(order);

        assertThat(message).isEqualTo("T:1:0");
    }

    @Test
    void should_return_H_when_receiving_chocolate_with_0_sugar_order() {
        Order order = new Order("chocolate", 0);

        String message = coffeeMaker.process(order);

        assertThat(message).isEqualTo("H::");
    }

}
