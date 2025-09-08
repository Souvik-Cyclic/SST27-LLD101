package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        // Frame[] frames = dec.decode(Path.of("in.mp4"));
        // frames = fe.grayscale(frames);
        // frames = fe.scale(frames, 0.5);
        // // Legacy filter not used due to odd API
        // Path out = enc.encode(frames, Path.of("out.mp4"));
        // System.out.println("Wrote " + out);
        // // TODO: Replace all above with VideoPipelineFacade.process(...)
        VideoPipelineFacade videoPipelineFacade = new VideoPipelineFacade(new Decoder(), new FilterEngine(), new Encoder(), new SharpenAdapter(new LegacySharpen()));
        Path out = videoPipelineFacade.process(Path.of("in.mp4"), Path.of("out.mp4"), true, 0.5, 75);
        System.out.println("Wrote " + out);
    }
}
