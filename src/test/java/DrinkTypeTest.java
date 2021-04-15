import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DrinkTypeTest {

    @Test
    void should_return_TEA_from_T_instruction() {
        assertThat(DrinkType.fromInstruction("T")).isEqualTo(DrinkType.TEA);
    }
}