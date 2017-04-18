package com.viacom.android.modules.sample;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CatCageTest {

    private CatCage catCage = new CatCage();

    @Test
    public void shouldCatchCat() {
        Cat cat = TestCatFactory.createCat();

        catCage.catchCat(cat);

        assertEquals(true, catCage.isCaught(cat));
    }

}