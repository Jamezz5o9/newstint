package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrillerTest {

    @Test
    @DisplayName("Check Driller")
    void checkDriller(){
        Driller driller = new Driller();
        int result = driller.buyUTMETextbook(4);
        assertEquals(8000, result);
    }


}
