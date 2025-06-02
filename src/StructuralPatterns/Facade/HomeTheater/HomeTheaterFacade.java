package StructuralPatterns.Facade.HomeTheater;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Screen screen, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie){
        System.out.println("get ready");
        screen.down();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(15);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
    public void endMovie(){
        System.out.println("shutting movie theater down");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
    }



}
