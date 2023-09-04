package session11.livesession.abstractionpractice;

public interface Playable {

    void play();
    void stop();
}

class Music implements Playable {

    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Music is not playing.");
    }
}

class Video implements Playable {

    @Override
    public void play() {
        System.out.println("Video is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Video has stopped.");
    }
}
