import orders.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class OrderTranslatorTest {

    @Test
    void should_generate_T_instruction_when_asked_to_make_a_tea() {
        Order tea = new Tea();
        assertThat(OrderTranslator.translate(tea)).isEqualTo("T:");
    }

    @Test
    void should_generate_C_instruction_when_asked_to_make_a_coffee() {
        Order coffee = new Coffee();
        assertThat(OrderTranslator.translate(coffee)).isEqualTo("C:");
    }
}