package com.KarmaticNeutral.plugin.Bees.Genes;

public enum TerritoryTypes {
    Minimal(2, 1),
    Small(3, 2),
    Reduced(5, 3),
    Normal(7, 4),
    Increased(9, 6),
    Large(11, 8),
    Maximum(15, 10)
    ;

    TerritoryTypes(int length, int height) {
    }
}
