package com.KarmaticNeutral.plugin.Bees.Genes;

public enum BeeSpecies {
    Unknown(
        "Unknown",
        FlowerTypes.Flower
    ),
    Forest(
        "Forest",
        FlowerTypes.Flower
    ),
    Meadows(
        "Meadows",
        FlowerTypes.Flower
    ),
    Modest(
        "Modest",
        FlowerTypes.Flower
    ),
    Tropical(
        "Tropical",
        FlowerTypes.Flower
    ),
    Wintry(
        "Wintry",
        FlowerTypes.Water
    ),
    Marshy(
        "Marshy",
        FlowerTypes.Flower
    ),
    Water(
        "Water",
        FlowerTypes.Water
    ),
    Rocky(
        "Rocky",
        FlowerTypes.Rock
    ),
    Infernal(
        "Infernal",
        FlowerTypes.Lava
    );

    private final String speciesName;
    private final FlowerTypes DefaultFlower;

    BeeSpecies(String speciesName, FlowerTypes defaultFlower) {
        this.speciesName = speciesName;
        this.DefaultFlower = defaultFlower;
    }

    public FlowerTypes getDefaultFlower() {
        return DefaultFlower;
    }

    public String getSpeciesName() {
        return speciesName;
    }
}
