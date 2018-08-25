package me.shardcoder.addon.commands;

import cc.hyperium.commands.BaseCommand;
import java.util.Collections;
import java.util.List;
import me.shardcoder.addon.renderers.ChunkEdgeRenderer;

public class ChunkEdgeToggleCommand implements BaseCommand {
    @Override
    public String getName() {
        return "chunkborders";
    }

    @Override
    public String getUsage() {
        return "/chunkborders";
    }

    @Override
    public void onExecute(String[] strings) {
        ChunkEdgeRenderer.incrementBorderMode();
    }

    @Override
    public List<String> getCommandAliases() {
        return Collections.singletonList("cborders");
    }

    @Override
    public List<String> onTabComplete(String[] args) {
        return Collections.singletonList("chunkborders");
    }
}
