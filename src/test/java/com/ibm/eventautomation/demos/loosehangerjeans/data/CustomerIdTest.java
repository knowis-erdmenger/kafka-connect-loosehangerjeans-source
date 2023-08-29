package com.ibm.eventautomation.demos.loosehangerjeans.data;

import org.junit.Test;

public class CustomerIdTest {
    @Test
    public void testGenerateId() {
        String id = CustomerId.generateCustomerId();
        System.out.println("Generated id: " + id);
        assert id.length() == 9;
        int numericalId = Integer.parseInt(id);

        assert numericalId > 1 && numericalId < 20;
    }
}
