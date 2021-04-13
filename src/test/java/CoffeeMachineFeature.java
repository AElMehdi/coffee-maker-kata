import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMachineFeature {
    private CoffeeMaker coffeeMaker = new CoffeeMaker();

    @Test
    void should_return_T_1_0_when_receiving_tea_with_1_sugar_order() {
        Order order = new Order("TEA", 1);

        String message = coffeeMaker.process(order);

        assertThat(message).isEqualTo("T:1:0");
    }

}
