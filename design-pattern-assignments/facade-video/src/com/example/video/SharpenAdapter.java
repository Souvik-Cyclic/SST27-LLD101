package com.example.video;

public class SharpenAdapter {
    private final LegacySharpen legacySharpen;

    public SharpenAdapter(LegacySharpen legacySharpen) {
        this.legacySharpen = legacySharpen;
    }

    public Frame[] sharpen(Frame[] frames, int strength) {
        if (frames == null || strength <= 0) {
            return frames;
        }
        String framesHandle = "HANDLE FRAMES:" + frames.length;
        legacySharpen.applySharpen(framesHandle, strength);

        return frames;
    }
}
