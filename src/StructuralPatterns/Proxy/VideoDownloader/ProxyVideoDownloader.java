package StructuralPatterns.Proxy.VideoDownloader;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {

    private final Map<String, String> videoCache = new HashMap<>();
    private final VideoDownloader downloader= new RealVideoDownloader();

    @Override
    public String getVideo(String videoName) {
        if (!videoCache.containsKey(videoName)) {
            videoCache.put(videoName, downloader.getVideo(videoName));
        }
        return videoCache.get(videoName);
    }
}
