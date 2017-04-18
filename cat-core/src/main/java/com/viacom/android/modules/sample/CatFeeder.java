package com.viacom.android.modules.sample;

import java.util.HashSet;
import java.util.Set;

public class CatFeeder {

    private final Set<Cat> hungryCats;

    public CatFeeder(Set<Cat> hungryCats) {
        this.hungryCats = new HashSet<>(hungryCats);
    }

    public void feedCat(Cat cat) {
        hungryCats.remove(cat);
    }

    public boolean isHungry(Cat cat) {
        return hungryCats.contains(cat);
    }
}
