package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    @DisplayName("bike can be turned on and off")
    public void bikeOn(){
    Bicycle bicycle = new Bicycle(true, false);
    bicycle.onLight();
    assertEquals(true, bicycle.getLight());
    }

    @Test
    @DisplayName("bike can be turned on and off")
    public void bikeOff(){
        Bicycle bicycle = new Bicycle(false, true);
        bicycle.offLight();
        assertEquals(false, bicycle.getLight());
    }

    @Test
    @DisplayName("bike acceleration")
    public void accelerateBike(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.increaseSpeed(16);
        //check
        assertEquals(17, bicycle.getSpeed());
    }
    @Test
    @DisplayName("bike acceleration")
    public void accelerateBikeTwice(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.increaseSpeed(22);
        //check
        assertEquals(24, bicycle.getSpeed());
    }
    @Test
    @DisplayName("bike acceleration")
    public void accelerateBikeThrice(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.increaseSpeed(31);
        //check
        assertEquals(34, bicycle.getSpeed());
    }
    @Test
    @DisplayName("bike acceleration")
    public void accelerateBikeFour(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.increaseSpeed(41);
        //check
        assertEquals(45, bicycle.getSpeed());
    }
    @Test
    @DisplayName("bike acceleration")
    public void decelerateBike(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decreaseSpeed(16);
        //check
        assertEquals(15, bicycle.getSpeed());
    }
    @Test
    @DisplayName("bike acceleration")
    public void decelerateBikeTwo(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decreaseSpeed(23);
        //check
        assertEquals(21, bicycle.getSpeed());
    }
    @Test
    @DisplayName("bike acceleration")
    public void decelerateBikeThree(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decreaseSpeed(35);
        //check
        assertEquals(32, bicycle.getSpeed());
    }
    @Test
    @DisplayName("bike acceleration")
    public void decelerateBikeFour(){
        //given
        Bicycle bicycle = new Bicycle(false, true);
        //when
        bicycle.decreaseSpeed(46);
        //check
        assertEquals(42, bicycle.getSpeed());
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
