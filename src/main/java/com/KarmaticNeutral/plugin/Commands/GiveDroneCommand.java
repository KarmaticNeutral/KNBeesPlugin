package com.KarmaticNeutral.plugin.Commands;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.arguments.system.DefaultArg;
import com.hypixel.hytale.server.core.command.system.arguments.system.RequiredArg;
import com.hypixel.hytale.server.core.command.system.arguments.types.ArgTypes;
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.inventory.ItemStack;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class GiveDroneCommand extends AbstractPlayerCommand {
    public GiveDroneCommand() {
        super("giveDrone", "gives the player a bee drone");

    }

    RequiredArg<String> speciesArg = this.withRequiredArg("species", "The species of the drone to receive", ArgTypes.STRING);
    DefaultArg<Boolean> isQueenArg = this.withDefaultArg("isQueen", "If the supplied bee should be a queen",ArgTypes.BOOLEAN, false, "Will give a drone if not specified");

    @Override
    protected void execute (@NonNullDecl CommandContext commandContext, @NonNullDecl Store<EntityStore> store, @NonNullDecl Ref<EntityStore> ref, @NonNullDecl PlayerRef playerRef, @NonNullDecl World world) {
        Player player = store.getComponent(ref, Player.getComponentType()); // also a component
        commandContext.sendMessage(Message.raw("command started." + (player == null ? "Player Null" : player.getDisplayName())));
        if (player != null) {
            var storage = player.getInventory().getStorage();
            commandContext.sendMessage(Message.raw("BEFORE" + storage.countItemStacks(i -> true)));

            var t = new ItemStack("Ingredient_DroneBee", 1);
            commandContext.sendMessage(Message.raw("ITEM" + t.toString()));
            storage.addItemStack(t);
            commandContext.sendMessage(Message.raw("BEFORE" + storage.countItemStacks(i -> true)));
        }

        commandContext.sendMessage(Message.raw("Tried to give drone. it would be " + speciesArg.get(commandContext) + " " + (isQueenArg.get(commandContext) ? "Queen" : "Drone")));
    }
}
