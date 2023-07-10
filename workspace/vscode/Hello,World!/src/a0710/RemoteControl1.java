package a0710;

public interface RemoteControl1 {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolum(int volume);
}
