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

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.lastName("Velisetti");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.lastName("veliseTTi");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.emailId("priyanka19.chouhan@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.emailId("priyanka19.chouhangmail.com");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.mobileNumber("91 9955463212");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.mobileNumber("919989774456");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule1("qwgthjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule1("jnsdsjRcvc");
        Assert.assertEquals(false, actualResult);
    }
}