public class Radio {
    private int currentRadioStation;
    private int minStation;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsAmount) {
        this.maxStation = stationsAmount - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minStation) {
            return;
        }
        if (currentRadioStation > maxStation) {
            currentRadioStation = maxStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minStation;
        }
    }

    public void prev() {
        if (currentRadioStation > minStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            volume = maxVolume;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }
}
