package me.shardcoder.addon;

import cc.hyperium.Hyperium;
import cc.hyperium.event.*;
import cc.hyperium.internal.addons.IAddon;
import me.shardcoder.addon.commands.ChunkEdgeToggleCommand;
import me.shardcoder.addon.renderers.ChunkEdgeRenderer;

public class ChunkEdgeIndicator implements IAddon {
    @Override
    public void onLoad() {
        System.out.println("[ChunkBorders] Addon loaded");
        EventBus.INSTANCE.register(this);
    }

    @InvokeEvent
    public void init(final InitializationEvent event) {
        EventBus.INSTANCE.register(new ChunkEdgeRenderer());
        Hyperium.INSTANCE.getHandlers().getHyperiumCommandHandler().registerCommand(new ChunkEdgeToggleCommand());
    }

    @Override
    public void onClose() {
        System.out.println("[ChunkBorders] Addon closed");
    }
    
    @Override
    public void sendDebugInfo() {
    }
}
