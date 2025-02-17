/**
 * Copyright 2023 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.ibm.eventautomation.demos.loosehangerjeans.data;

import java.util.UUID;

import com.github.javafaker.Faker;

/**
 * Information about a customer.
 */
public class Customer {

    /** unique id for the customer */
    private String id;

    /** full name, including any title and suffixes (e.g. "Jr") */
    private String name;

    /** Create a customer using the provided details */
    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * Create an object to represent the customer with the
     *  provided name. Generates a uuid for the customer id.
     */
    public Customer(String name) {
        this.id = CustomerId.generateCustomerId();
        this.name = name;
    }
    /**
     * Uses the provided faker object to create a
     *  customer.
     */
    public Customer(Faker faker) {
        this.id = CustomerId.generateCustomerId();
        this.name = faker.name().fullName();
    }


    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + "]";
    }
}
