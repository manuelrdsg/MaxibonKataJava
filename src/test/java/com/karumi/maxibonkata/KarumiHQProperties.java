package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

// Dada una coleccion de desarrolladores el numero de helados en la nevera es >=2
// Dada una coleccion de desarrolladores el numero de helados en la nevera es el esperado

@RunWith(JUnitQuickcheck.class) public class KarumiHQProperties {
    @Property
    public void whenADeveloperOpenTheFridgeTheNumberLeftItHasToBeGreaterThanTwo(@From(DevelopersGenerator.class) Developer generatedDeveloper) {
        KarumiHQs karumiHQ = new KarumiHQs();
        karumiHQ.openFridge(generatedDeveloper);
        assertTrue(karumiHQ.getMaxibonsLeft() >= 2);
    }

    @Property
    public void ifTheNumberOfLeftMaxibonsIsLessThan2ThenBuy10(@From(HungryDevelopersGenerator.class) Developer generatedDeveloper) {
        KarumiHQs karumiHQ = new KarumiHQs();
        karumiHQ.openFridge(generatedDeveloper);
        assertTrue(karumiHQ.getMaxibonsLeft() >= 10);
    }
}
