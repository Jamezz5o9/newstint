package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    @DisplayName("Switch to turn Ac on or off")
    public void switchACOn(){
        //given
        AirCondition rachaelAC = new AirCondition();
        rachaelAC.off();
        //when
        rachaelAC.turnOn();
        //check
        assertEquals("on" , rachaelAC.getAC2());
    }

    @Test
    @DisplayName("Switch to turn Ac off")
    public void switchOff(){
      //given
        AirCondition bolajiAC = new AirCondition();
        bolajiAC.turnOn();
        //when
        bolajiAC.off();
        //check
        assertEquals("off", bolajiAC.getAC());

    }

    }
