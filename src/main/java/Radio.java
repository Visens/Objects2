public class Radio {
    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentVolume;
    public int maxStation = 9;
    public int minStation = 0;
    public int currentStation;


    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void pressPlusVolume() {
        setCurrentVolume(currentVolume + 1);
    }
    public void pressMinusVolume() {
        setCurrentVolume(currentVolume - 1);
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }
    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void pressPlusStation() {
        setCurrentStation(currentStation + 1);
    }

    public void pressMinusStation() {
        setCurrentStation(currentStation - 1);
    }
}
