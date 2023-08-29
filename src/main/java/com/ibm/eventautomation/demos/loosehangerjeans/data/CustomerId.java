package com.ibm.eventautomation.demos.loosehangerjeans.data;

import com.ibm.eventautomation.demos.loosehangerjeans.utils.Generators;

/**
 * Class to provide customerId that are aligned with our CRM demo
 */
public class CustomerId {

    public static String generateCustomerId() {
        // generate random number between 1 and 20
        int id = Generators.randomInt(1, 20);

        // left pad with zeros to make it 9 digits
        return String.format("%09d", id);
    }


}
