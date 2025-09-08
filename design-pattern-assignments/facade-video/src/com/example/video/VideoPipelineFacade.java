package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    private final Decoder decoder;
    private final FilterEngine filterEngine;
    private final Encoder encoder;
    private final SharpenAdapter sharpenAdapter;

    public VideoPipelineFacade(Decoder decoder, FilterEngine filterEngine, Encoder encoder, SharpenAdapter sharpenAdapter) {
        this.decoder = decoder;
        this.filterEngine = filterEngine;
        this.encoder = encoder;
        this.sharpenAdapter = sharpenAdapter;
    }
    
    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Frame[] frames = decoder.decode(src);
        if (gray) {
            frames = filterEngine.grayscale(frames);
        }
        if (scale != null) {
            frames = filterEngine.scale(frames, scale);
        }
        if (sharpenStrength != null) {
            frames = sharpenAdapter.sharpen(frames, sharpenStrength);
        }
        Path result = encoder.encode(frames, out);
        return result;
    }
}
