package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;


@RunWith(JUnitQuickcheck.class) public class KarumiHQProperties {
    @Property
    public void whenADeveloperIsGoingToGetMaxibonsTheNumberOfItHasToBeGreaterThanTwo(@From(DevelopersGenerator.class) Developer generatedDeveloper) {
        KarumiHQs karumiHQ = new KarumiHQs();
        karumiHQ.openFridge(generatedDeveloper);
        assertTrue(karumiHQ.getMaxibonsLeft() >= 2);
    }

}
