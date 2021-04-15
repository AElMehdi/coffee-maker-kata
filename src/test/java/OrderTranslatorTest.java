import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTranslatorTest {

    @Test
    void should_return_a_tea_order_when_passed_a_T_instruction() {
        Order order = OrderTranslator.toOrder("T");
        assertThat(order).isEqualTo(new TeaOrder(0));
    }
}