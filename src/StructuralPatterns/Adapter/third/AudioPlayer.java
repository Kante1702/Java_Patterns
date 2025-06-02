package StructuralPatterns.Adapter.third;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3: " + fileName);
        }
        else {
            adapter = new MediaAdapter();
            adapter.play(audioType, fileName);
        }
    }
}
