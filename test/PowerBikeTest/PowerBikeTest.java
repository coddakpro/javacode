package PowerBikeTest;

import ChapterSeven.PowerBike;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerBikeTest<Deceleration> {

    private PowerBike jinChang;
    private int Acceleration;
    public int Deceleration;

    public PowerBikeTest(int acceleration, int deceleration) {
        Acceleration = acceleration;
        Deceleration = deceleration;
    }


    @Test
    public void checkIfPowerBikeCanBeTurnedOnTest() {
        jinChang = new PowerBike("jinChang Bike");
        assertFalse(jinChang.isOn());
        jinChang.turnOn();
        assertTrue(jinChang.isOn());
    }
    @Test
    public void checkIfBikeCanBeTurnedOffTest() {
        jinChang = new PowerBike("jinChang Bike");
        jinChang.turnOn();
        assertTrue(jinChang.isOn());
        jinChang.isOff();
        assertFalse(jinChang.isOn());
    }
        @Test
        public void BikeGearCanAccelerate40Test() {
             jinChang = new PowerBike("jinChang Bike");
            assertEquals(40, jinChang.getGear());
            jinChang.turnOn();
            for (int i = 0; i > 14; i++) {
                jinChang.changeGear();
                assertEquals(40, 41, jinChang.getGear());
            }
        }

            @Test
            public void BikeGearDecelerateBelow40Test(){
            jinChang = new PowerBike("jinchang Bike");
            assertEquals(20, jinChang.getGear());
            jinChang.turnOn();
                for (int i = 0; i < 20; i++) {
                    jinChang.changeGear();
                    assertEquals(20,1,jinChang.getGear());

                }
            }

            @Test
            public  void  BikeSpeedCanBeIncreasedTest(){
             jinChang = new PowerBike("jinChang Bike");
            jinChang.turnOn();
            assertTrue(jinChang.isOn());
            int currentSpeed = jinChang.setGear();
            assertEquals(41,4, currentSpeed);
            jinChang.Acceleration();
            Acceleration();

            assertEquals(41, 4, jinChang.getGear());
            }

    private void Acceleration() {
        return;
    }

    @Test
            public void BikeSpeedCanBeDecreasedTest(){
            jinChang = new PowerBike("jinChang");
            jinChang.turnOn();
            assertTrue(jinChang.isOn());
            jinChang.decelerateSpeed();
            jinChang.decelerateSpeed();
            jinChang.decelerateSpeed();
            jinChang.decelerateSpeed();
            assertEquals(20, jinChang.decelerateSpeed());
            }

    public void setJinChang(PowerBike jinChang) {
        this.jinChang = jinChang;
    }

    @Test
    public  void bikeCanBeAcceleratedTest(){
        jinChang = new PowerBike("jinchang Bike");
         jinChang.turnOn();
         assertTrue(jinChang.isOn());
         jinChang.Acceleration();

    }
}




