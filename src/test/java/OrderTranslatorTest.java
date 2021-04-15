import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTranslatorTest {

    @Test
    void should_return_a_tea_order_when_passed_a_T_instruction() {
        Order order = OrderTranslator.toOrder("T::");
        assertThat(order).isEqualTo(new TeaOrder(0));
    }

    @Test
    void should_return_a_tea_order_with_sugar_when_passed_a_T_1_instruction() {
        Order order = OrderTranslator.toOrder("T:1:");
        assertThat(order).isEqualTo(new TeaOrder(1));
    }

    @Test
    void should_return_a_coffee_order_when_passed_a_C_instruction() {
        Order order = OrderTranslator.toOrder("C::");
        assertThat(order).isEqualTo(new CoffeeOrder(0));
    }

    @Test
    void should_return_a_coffee_order_with_sugar_when_passed_a_C_1_instruction() {
        Order order = OrderTranslator.toOrder("C:1:");
        assertThat(order).isEqualTo(new CoffeeOrder(1));
    }

    @Test
    void should_return_a_hot_chocolate_order_when_passed_a_H_instruction() {
        Order order = OrderTranslator.toOrder("H::");
        assertThat(order).isEqualTo(new HotChocolateOrder(0));
    }

}