package com.KarmaticNeutral.plugin.Bees.Components;

import com.KarmaticNeutral.plugin.Bees.Genes.*;
import com.hypixel.hytale.component.Component;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class BeeComponent implements Component<EntityStore> {
    protected BeeSpecies species;

    protected ProductivityTypes productivity;
    protected AggressionTypes aggression;
    protected LifespanTypes lifespan;
    protected FlowerTypes flowerType;
    protected FertilityTypes fertility;
    protected TerritoryTypes territory;
    protected EffectTypes effect;
    /*
     * TODO:
     *  - Climate/Tolerence
     *  - Humidity/Tolerence
     *  - Diurnal
     *  - Nocturnal
     *  - Weather
     *  - Needs Sky?
     */

    public BeeComponent() {
        this(BeeSpecies.Unknown);
    }

    public BeeComponent(BeeSpecies species) {
        this.species = species;
        this.flowerType = species.getDefaultFlower();
        //TODO set up defaults for the rest the genetics.
    }

    public BeeComponent(BeeSpecies species, ProductivityTypes productivity, AggressionTypes aggression, LifespanTypes lifespan, FlowerTypes flowerType, FertilityTypes fertility, TerritoryTypes territory, EffectTypes effect) {
        this.species = species;
        this.productivity = productivity;
        this.aggression = aggression;
        this.lifespan = lifespan;
        this.flowerType = flowerType;
        this.fertility = fertility;
        this.territory = territory;
        this.effect = effect;
    }

    public BeeComponent(BeeComponent other) {
        this(other.species, other.productivity, other.aggression, other.lifespan, other.flowerType, other.fertility, other.territory, other.effect);
    }

    public abstract Component<EntityStore> clone();

    public BeeSpecies getSpecies () { return species; }
    public ProductivityTypes getProductivity() { return productivity; }
    public AggressionTypes getAggression() { return aggression; }
    public LifespanTypes getLifespan() { return lifespan; }
    public FlowerTypes getFlowerType() { return flowerType; }
    public FertilityTypes getFertility () { return fertility; }
    public EffectTypes getEffect () { return effect; }
    public TerritoryTypes getTerritory() { return territory; }
}
