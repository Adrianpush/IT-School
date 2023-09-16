package session15.homework.challenge6;

import java.time.Duration;

public enum LightColor {

    GREEN ("Go", Duration.ofSeconds(45)),
    YELLOW ("Caution", Duration.ofSeconds(5)),
    RED ("Stop", Duration.ofSeconds(30));
    private String color;
    private Duration duration;

    LightColor(String color, Duration duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public Duration getDuration() {
        return duration;
    }
}
