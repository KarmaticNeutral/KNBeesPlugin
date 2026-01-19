package com.KarmaticNeutral.plugin.Bees.Genes;

public enum ProductivityTypes {
    Minimal(0.3f),
    Slow(0.6f),
    Reduced(0.8f),
    Normal(1.0f),
    Increased(1.3f),
    Fast(1.6f),
    Maximum(2.0f)
    ;

    ProductivityTypes(float multiplier) {
    }
}
