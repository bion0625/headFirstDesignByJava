package ch07.facade;

public class HomeTheaterFacadeTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner(amp);
        StreamingPlayer player = new StreamingPlayer(amp);
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheater.watchMovie("인디아나 존스:레이더스");
        homeTheater.endMovie();
    }
}
