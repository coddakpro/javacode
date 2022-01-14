package AirConditionerTestSamsuung;

import AirConditioner.AirConditioner;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    private AirConditioner  SamsungAc;

    @Test
     public void checkIfAcCanBeTurnedOnTest(int temperature) {
     AirConditioner SamsungAc = new AirConditioner("Samsung new Generator", 16);
        boolean var = SamsungAc.checkturnedOn();
        assertTrue(var);
    }
    @Test
    public void checkIfaAcCanBeTurnedOffTest(int temperature) {
        AirConditioner SamsungAc = new AirConditioner("Samasung new Generator", 0);
        boolean var = SamsungAc.checkTurnedOff();
        assertFalse();
    }

    private void assertFalse() {
    }
    @Test
    public  void checkIfAcCanBeIncreaseTest(int temperature) {
        AirConditioner SamsungAc = new AirConditioner("Samsung new Generator",17 );

    }
    @Test
    public void changeTemperature() {
        int temperature = 0;
        AirConditioner samsungAc = new AirConditioner("Samsung new Generator", 20);
        temperature = SamsungAc.increaseTemperatureNow();
        assertEquals(20,21);
    }

}
