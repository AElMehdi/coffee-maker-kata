import orders.Coffee;
import orders.Chocolate;
import orders.Order;
import orders.Tea;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class OrderTranslatorTest {

    @Test
    void should_generate_T_0_1_instruction_when_asked_to_make_a_tea() {
        Order tea = new Tea();
        assertThat(OrderTranslator.translate(tea)).isEqualTo("T:0:1");
    }

    @Test
    void should_generate_T_1_0_instruction_when_asked_to_make_a_tea_with_sugar() {
        Order tea = new Tea(1);
        assertThat(OrderTranslator.translate(tea)).isEqualTo("T:1:0");
    }

    @Test
    void should_generate_C_0_1_instruction_when_asked_to_make_a_coffee() {
        Order coffee = new Coffee();
        assertThat(OrderTranslator.translate(coffee)).isEqualTo("C:0:1");
    }

    @Test
    void should_generate_C_2_0_instruction_when_asked_to_make_a_coffee_with_2_sugar() {
        Order coffee = new Coffee(2);
        assertThat(OrderTranslator.translate(coffee)).isEqualTo("C:2:0");
    }

    @Test
    void should_generate_H_0_1_instruction_when_asked_to_make_a_coffee() {
        Order chocolate = new Chocolate();
        assertThat(OrderTranslator.translate(chocolate)).isEqualTo("H:0:1");
    }

    @Test
    void should_generate_H_2_0_instruction_when_asked_to_make_a_coffee_with_2_sugar() {
        Order chocolate = new Chocolate(2);
        assertThat(OrderTranslator.translate(chocolate)).isEqualTo("H:2:0");
    }
}