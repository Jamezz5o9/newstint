package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class secondAirconditionTest {
    @Test
    @DisplayName("reduce and increase temperature")
    public void increaseTemp(){
        //given
        SecondAir temp = new SecondAir(16);
        temp.switchOn();
        //when
        temp.setIncreaseTemp();
        //check
        assertEquals(17, temp.getTemp());

    }

    @Test
    public void decreaseTemp(){
        //given
        SecondAir temp = new SecondAir(18);
        temp.switchOn();
        //when
        temp.setDecreaseTemp();
        //check
        assertEquals(17, temp.getTemp());
    }

    @Test
    public void tempUnchangedBelow16(){
        //given
        SecondAir temp = new SecondAir(16);
        temp.switchOn();
        //when
        temp.setDecreaseTemp();
        //check
        assertEquals(16, temp.getTemp());
    }

    @Test
    public void tempUnchangedAbove30(){
        //given
        SecondAir temp = new SecondAir(31);
        temp.switchOn();
        //when
        temp.setIncreaseTemp();
        //check
        assertEquals(30, temp.getTemp());
    }
}
