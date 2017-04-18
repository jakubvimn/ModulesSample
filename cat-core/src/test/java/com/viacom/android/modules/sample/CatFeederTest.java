package com.viacom.android.modules.sample;

import org.junit.Test;

import java.util.Collections;

import static junit.framework.Assert.assertEquals;

public class CatFeederTest {

    private final Cat hungryCat = TestCatFactory.createCat();
    private CatFeeder catFeeder = new CatFeeder(Collections.singleton(hungryCat));

    @Test
    public void shouldFeedCat() {
        catFeeder.feedCat(hungryCat);

        assertEquals(false, catFeeder.isHungry(hungryCat));
    }

}