package tddClass;

public class Bicycle {
    private boolean switchOn;
    private boolean switchOff;
    private int defGear;
    private int num;
    private int gear;

    public Bicycle(boolean off, boolean on){
        this.switchOff = off;
        this.switchOn = on;
    }

    public void onLight() {
        this.switchOn = true;
    }
    public void offLight(){
        this.switchOn = false;
    }

    public boolean getLight(){
        return switchOn;
    }

//    public void gearOne(int increaseGear) {
//
//       defGear = increaseGear + 1;
//    }

//
//    public void gearTwo(int increaseGearTwo) {
//        defGear = increaseGearTwo + 2;
//    }
//
//    public void gearThree(int increaseGearThree) {
//        defGear = increaseGearThree + 3;
//    }
//
//    public void gearFour(int increaseGearFour) {
//        defGear = increaseGearFour + 4;
//    }
//
//    public void decGear(int gearDec) {
//        defGear = gearDec - 1;
//    }
//
//    public void decGearTwo(int gearDecTwo) {
//        defGear = gearDecTwo - 2;
//    }
//
//    public void decGearThree(int gearDecThree) {
//        defGear = gearDecThree - 3;
//    }
//
//    public void decGearFour(int gearDecFour) {
//        defGear = gearDecFour - 4;
//    }
    public void increaseSpeed(int increaseNum) {
        if(increaseNum >= 0 && increaseNum <= 20 ){
            this.num = increaseNum + 1;
        } else if (increaseNum >= 21 && increaseNum <= 30) {
            this.num = increaseNum + 2;
        } else if (increaseNum >= 31 && increaseNum <= 40) {
            this.num = increaseNum + 3;
        } else if (increaseNum >= 41) {
            this.num = increaseNum + 4;
        }
    }

    public void decreaseSpeed(int decreaseNum) {
        if(decreaseNum >= 0 && decreaseNum <= 20){
            this.num = decreaseNum - 1;
        } else if (decreaseNum >= 21 && decreaseNum <= 30) {
            this.num = decreaseNum - 2;
        } else if (decreaseNum >= 31 && decreaseNum <= 40) {
            this.num = decreaseNum - 3;
        } else if (decreaseNum >= 41) {
            this.num = decreaseNum - 4;
        }
    }
    public int getSpeed(){
        return num;
    }

    public void decSpeedFirst(int firstRange) {
        if(firstRange >= 0 && firstRange <= 20 ){
            this.gear = 1;
        } else if (firstRange >= 21 && firstRange <= 30) {
            this.gear = 2;
        } else if (firstRange >= 31 && firstRange <= 40) {
            this.gear = 3;
        } else if (firstRange >= 41) {
            this.gear = 4;
        }
    }
    public int getNewGear(){
        return gear;
    }
       public int getGear(){
       return defGear;
   }


}