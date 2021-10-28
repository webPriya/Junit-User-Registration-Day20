package com.bdlz.JunitRegistration;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitUserRegistrationTest {
    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.firstName("Priyanka");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.firstName("Priyanka");
        Assert.assertEquals(false, actualResult);
    }
}