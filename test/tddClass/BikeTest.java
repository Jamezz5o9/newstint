package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    @DisplayName("bike can be turned on and off")
    public void bikeOn(){
    Bicycle bicycle = new Bicycle(true, false);
    bicycle.onLight(true);
    assertEquals(true, bicycle.getLight());
    }

    @Test
    @DisplayName("bike can be turned on and off")
    public void bikeOff(){
        Bicycle bicycle = new Bicycle(false, true);
        bicycle.onLight(false);
        assertEquals(false, bicycle.getLight());
    }

    @Test
    @DisplayName("bike acceleration")
    public void accelerateBike(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.gearOne(16);
        //check
        assertEquals(17, bicycle.getGear());
    }
    @Test
    @DisplayName("bike acceleration")
    public void accelerateBikeTwice(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.gearTwo(16);
        //check
        assertEquals(18, bicycle.getGear());
    }
    @Test
    @DisplayName("bike acceleration")
    public void accelerateBikeThrice(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.gearThree(16);
        //check
        assertEquals(19, bicycle.getGear());
    }
    @Test
    @DisplayName("bike acceleration")
    public void accelerateBikeFour(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.gearFour(16);
        //check
        assertEquals(20, bicycle.getGear());
    }
    @Test
    @DisplayName("bike acceleration")
    public void decelerateBike(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decGear(16);
        //check
        assertEquals(15, bicycle.getGear());
    }
    @Test
    @DisplayName("bike acceleration")
    public void decelerateBikeTwo(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decGearTwo(16);
        //check
        assertEquals(14, bicycle.getGear());
    }
    @Test
    @DisplayName("bike acceleration")
    public void decelerateBikeThree(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decGearThree(16);
        //check
        assertEquals(13, bicycle.getGear());
    }
    @Test
    @DisplayName("bike acceleration")
    public void decelerateBikeFour(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decGearFour(16);
        //check
        assertEquals(12, bicycle.getGear());
    }
    @Test
    @DisplayName("bike acceleration")
    public void gearSpeedFirstRange(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decSpeedFirst(50);
        //check
        assertEquals(4, bicycle.getNewGear());
    }

}
