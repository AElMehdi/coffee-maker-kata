import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMachineFeature {

    @Test
    void should_return_T_1_0_when_receiving_tea_with_1_sugar_order() {
        Order order = new OrderTea(1);


        assertThat(order.process()).isEqualTo("T:1:0");
    }

    @Test
    void should_return_T_1_0_when_receiving_tea_with_2_sugars_order() {
        Order order = new OrderTea(2);

        assertThat(order.process()).isEqualTo("T:2:0");
    }

    @Test
    void should_return_H_when_receiving_chocolate_with_0_sugar_order() {
        Order order = new OrderChocolate(0);

        assertThat(order.process()).isEqualTo("H::");
    }

    @Test
    void should_return_C_2_0_when_receiving_coffee_with_2_sugars_order() {
        Order order = new OrderCoffee(2);

        assertThat(order.process()).isEqualTo("C:2:0");
    }

}
