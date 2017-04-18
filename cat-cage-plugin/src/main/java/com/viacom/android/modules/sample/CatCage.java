package com.viacom.android.modules.sample;

import java.util.HashSet;
import java.util.Set;

public class CatCage {

    private final Set<Cat> caughtCats = new HashSet<>();

    public void catchCat(Cat cat) {
        caughtCats.add(cat);
    }

    public boolean isCaught(Cat cat) {
        return caughtCats.contains(cat);
    }
}
