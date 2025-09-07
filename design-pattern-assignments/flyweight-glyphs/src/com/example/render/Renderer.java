package com.example.render;

public class Renderer {
    private final TextStyleFactory textStyleFactory = new TextStyleFactory();
    public int render(String text) {
        int cost = 0;
        for (char c : text.toCharArray()) {
            // Glyph g = new Glyph(c, "Inter", 14, (c % 7 == 0)); // TODO: refactor with TextStyle flyweights
            TextStyle style = textStyleFactory.getStyle("Inter", 14, (c % 7 == 0));
            Glyph g = new Glyph(c, style);
            cost += g.drawCost();
        }
        return cost;
    }
}
