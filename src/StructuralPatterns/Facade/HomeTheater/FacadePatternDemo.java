package StructuralPatterns.Facade.HomeTheater;

public class FacadePatternDemo {
    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, screen, soundSystem);
        homeTheaterFacade.watchMovie("DEGesko");
//        get ready
//        Screen is down
//        Projector is On
//        Projector input set to: DVD
//        Sound system is on
//        Sound system volume is set to 15
//        DVDPlayer is on
//        Playing movie  DEGesko
          homeTheaterFacade.endMovie();
//        shutting movie theater down
//        DVDPlayer is off
//        Sound system is off
//        Projector is Off
//        Screen is up



    }
}
