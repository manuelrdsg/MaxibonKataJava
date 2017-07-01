 package com.karumi.maxibonkata;

 import com.pholser.junit.quickcheck.From;
 import com.pholser.junit.quickcheck.Property;
 import org.junit.runner.RunWith;
 import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

 import static org.junit.Assert.assertTrue;


 @RunWith(JUnitQuickcheck.class) public class DeveloperProperties {
    @Property
    public void whenADeveloperIsCreatedTheNumberOfMaxMaxibonsIsGreatterOrEqualsZero(int numOfMaxibons) {
        Developer developer = new Developer("any name", numOfMaxibons);

        assertTrue(developer.getNumberOfMaxibonsToGrab() >= 0);
    }

    @Property
     public void whenDeveloperIsCreatedItsNameIsEqualToGetName(String developerName) {
        Developer developer = new Developer(developerName, 5);
        System.out.println(developerName);
        assertTrue(developer.getName().equals(developerName));
    }

}