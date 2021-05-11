import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuropeTest {

    Europe europe;

    @BeforeEach
    void init () {
        europe = Europe.getInstance();
    }

    @Test
    void testBTWPercentages () {
        assertFalse (europe.isReverseChargeApplicable("CA"));
        assertTrue (europe.isReverseChargeApplicable("BE"));
        assertFalse(europe.isReverseChargeApplicable("NE"));
    }
}