package com.KarmaticNeutral.plugin.Bees.Components;

import com.KarmaticNeutral.plugin.Bees.Genes.*;
import com.hypixel.hytale.component.Component;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class DroneBeeComponent extends BeeComponent {
    public DroneBeeComponent() {
        super();
    }

    public DroneBeeComponent(BeeSpecies species) {
        super(species);
    }

    public DroneBeeComponent(BeeSpecies species, ProductivityTypes productivity, AggressionTypes aggression, LifespanTypes lifespan, FlowerTypes flowerType, FertilityTypes fertility, TerritoryTypes territory, EffectTypes effect) {
        super(species, productivity, aggression, lifespan, flowerType, fertility, territory, effect);
    }

    public DroneBeeComponent(DroneBeeComponent other) {
        this(other.species, other.productivity, other.aggression, other.lifespan, other.flowerType, other.fertility, other.territory, other.effect);
    }

    @NullableDecl
    @Override
    public Component<EntityStore> clone () {
        return new DroneBeeComponent(this);
    }
}
