import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DrinkTypeTest {

    @Test
    void should_return_TEA_from_T_instruction() {
        assertThat(DrinkType.fromInstruction("T")).isEqualTo(DrinkType.TEA);
    }

    @Test
    void should_return_COFFEE_from_C_instruction() {
        assertThat(DrinkType.fromInstruction("C")).isEqualTo(DrinkType.COFFEE);
    }

    @Test
    void should_return_HOT_CHOCOLATE_from_H_instruction() {
        assertThat(DrinkType.fromInstruction("H")).isEqualTo(DrinkType.HOT_CHOCOLATE);
    }

    @Test
    void should_throw_an_exception_when_passed_an_unknown_instruction() {
        assertThatThrownBy(() -> DrinkType.fromInstruction("UNKNOWN"))
                .hasMessageContaining("Sorry")
                .isInstanceOf(IllegalArgumentException.class);
    }
}