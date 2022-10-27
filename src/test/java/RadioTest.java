import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/station.csv")
    public void shouldSetRadioStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(currentRadioStation);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prev.csv")
    public void shouldPrevStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(currentRadioStation);
        radio.prev();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/next.csv")
    public void shouldNextStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(currentRadioStation);
        radio.next();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volume.csv")
    public void shouldSetVolume(int volume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(volume);

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increase.csv")
    public void shouldIncrease(int volume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(volume);
        radio.increaseVolume();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decrease.csv")
    public void shouldDecrease(int volume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(volume);
        radio.decreaseVolume();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
