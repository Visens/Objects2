import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();
    //Test changes of Volume
    @Test
    public void SetCurrentVolume() {
        rad.currentVolume = 50;
        int expected = 50;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMaxVolume() {
        int expected = 100;
        int actual = rad.maxVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMinVolume() {
        int expected = 0;
        int actual = rad.minVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressMinusVolume() {
        rad.currentVolume = 100;
        rad.pressMinusVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressPlusVolume() {
        rad.currentVolume = 100;
        rad.pressPlusVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    //Test changes of Stations
    @Test
    public void setCurrentStation() {
        rad.currentStation = 7;
        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMaxStation() {
        int expected = 9;
        int actual = rad.maxStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMinStation() {
        int expected = 0;
        int actual = rad.minStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressMinusStation() {
        rad.currentStation = 5;
        rad.pressMinusStation();
        int expected = 4;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressPlusStation() {
        rad.currentStation = 6;
        rad.pressPlusStation();
        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}