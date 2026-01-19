package com.KarmaticNeutral.plugin.Bees.Components;

import com.KarmaticNeutral.plugin.Bees.Genes.*;
import com.hypixel.hytale.component.Component;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class QueenBeeComponent extends BeeComponent {
    public QueenBeeComponent() {
        super();
    }

    public QueenBeeComponent(BeeSpecies species) {
        super(species);
    }

    public QueenBeeComponent(BeeSpecies species, ProductivityTypes productivity, AggressionTypes aggression, LifespanTypes lifespan, FlowerTypes flowerType, FertilityTypes fertility, TerritoryTypes territory, EffectTypes effect) {
        super(species, productivity, aggression, lifespan, flowerType, fertility, territory, effect);
    }

    public QueenBeeComponent(QueenBeeComponent other) {
        this(other.species, other.productivity, other.aggression, other.lifespan, other.flowerType, other.fertility, other.territory, other.effect);
    }

    @NullableDecl
    @Override
    public Component<EntityStore> clone () {
        return new QueenBeeComponent(this);
    }
}
