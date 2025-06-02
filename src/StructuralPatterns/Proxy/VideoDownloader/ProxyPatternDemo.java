package StructuralPatterns.Proxy.VideoDownloader;

public class ProxyPatternDemo {
    public static void main(String[] args) {

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("kante");
        videoDownloader.getVideo("kante");
        videoDownloader.getVideo("mamasita");
        videoDownloader.getVideo("kante");

//        connecting to youtube
//        downloading video kante
//        retrieving video metadata
//        connecting to youtube
//        downloading video mamasita
//        retrieving video metadata
    }
}
