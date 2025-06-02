package StructuralPatterns.Proxy.VideoDownloader;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public String getVideo(String videoName) {
        System.out.println("connecting to youtube");
        System.out.println("downloading video "+videoName );
        System.out.println("retrieving video metadata");
        return videoName;

    }
}
