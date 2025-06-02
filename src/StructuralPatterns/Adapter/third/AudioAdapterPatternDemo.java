package StructuralPatterns.Adapter.third;

public class AudioAdapterPatternDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("vlc", "video.vlc");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("avi", "clip.avi");


//        Playing mp3: song.mp3
//        Playing VLC file: video.vlc
//        Playing MP4 file: movie.mp4
//        unsupported audio type avi

    }
}
