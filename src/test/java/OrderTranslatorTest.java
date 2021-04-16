import orders.CoffeeOrder;
import orders.HotChocolateOrder;
import orders.Order;
import orders.TeaOrder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OrderTranslatorTest {

    @Test
    void should_return_a_tea_order_when_passed_a_T_instruction() {
        Order order = OrderTranslator.toOrder("T:::4");
        assertThat(order).isEqualTo(new TeaOrder(0, 4));
    }

    @Test
    void should_return_a_tea_order_with_sugar_when_passed_a_T_1_instruction() {
        Order order = OrderTranslator.toOrder("T:1::4");
        assertThat(order).isEqualTo(new TeaOrder(1, 4));
    }

    @Test
    void should_return_a_coffee_order_when_passed_a_C_instruction() {
        Order order = OrderTranslator.toOrder("C:::6");
        assertThat(order).isEqualTo(new CoffeeOrder(0, 6));
    }

    @Test
    void should_return_a_coffee_order_with_sugar_when_passed_a_C_1_instruction() {
        Order order = OrderTranslator.toOrder("C:1::6");
        assertThat(order).isEqualTo(new CoffeeOrder(1, 6));
    }

    @Test
    void should_return_a_hot_chocolate_order_when_passed_a_H_instruction() {
        Order order = OrderTranslator.toOrder("H:::5");
        assertThat(order).isEqualTo(new HotChocolateOrder(0, 5));
    }

    @Test
    void should_return_a_hot_chocolate_order_with_sugar_when_passed_a_H_1_instruction() {
        Order order = OrderTranslator.toOrder("H:1::5");
        assertThat(order).isEqualTo(new HotChocolateOrder(1, 5));
    }

    @Test
    void should_treat_an_empty_sugar_parameter_as_0() {
        Order order = OrderTranslator.toOrder("T:::4");
        assertThat(order).isEqualTo(new TeaOrder(0, 4));
    }

    @Test
    void should_throw_an_exception_when_passed_an_alpha_as_amount_of_sugar() {
        assertThatThrownBy(() -> OrderTranslator.toOrder("H:A:"))
                .isInstanceOf(NumberFormatException.class);
    }

    @Test
    void should_treat_an_empty_money_parameter_as_0() {
        Order order = OrderTranslator.toOrder("T:2::");
        assertThat(order).isEqualTo(new TeaOrder(2, 0));
    }

    @Test
    void should_throw_an_exception_when_passed_an_alpha_as_amount_of_money() {
        assertThatThrownBy(() -> OrderTranslator.toOrder("T:2::Z"))
                .isInstanceOf(NumberFormatException.class);
    }
}