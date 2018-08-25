package me.shardcoder.addon.gui;

import cc.hyperium.gui.main.HyperiumOverlay;
import cc.hyperium.gui.main.components.OverlayButton;
import me.shardcoder.addon.renderers.ChunkEdgeRenderer;

public class ChunkEdgeOverlay extends HyperiumOverlay {
    public ChunkEdgeOverlay() {
        try {
            this.getComponents().add(new OverlayButton("Change chunk border mode", () -> {
                ChunkEdgeRenderer.incrementBorderMode();
            }));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
