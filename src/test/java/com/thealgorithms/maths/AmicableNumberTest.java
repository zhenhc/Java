package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AmicableNumberTest {

    @Test
    void testAmicableNumber() {
        assertThat(AmicableNumber.isAmicableNumber(220, 284)).isTrue();
        assertThat(AmicableNumber.isAmicableNumber(1184, 1210)).isTrue();
        assertThat(AmicableNumber.isAmicableNumber(2620, 2924)).isTrue();
    }
}
