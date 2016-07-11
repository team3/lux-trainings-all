package com.luxoft.tc.junit;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.luxoft.tc.junit.ValidationResult;
import com.luxoft.tc.junit.Person;

@RunWith(JUnit4.class)
public class PersonFieldsValidatorTest {
    private Validator<Person> validator;

    @BeforeClass
    public static void setUpClass() {
        //System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        //System.out.println("@AfterClass");
    }

    @Before
    public void setUp() {
        validator = PersonMandatoryFieldsValidator.getInstance();
        //System.out.println("Test started at: " + new Date());
    }

    @After
    public void tearDown() throws Exception {
        //System.out.println("Test finished at: " + new Date());
    }

    @Test
    @Ignore("Test is ignored as a demonstration")
    public void firstNameIsEmpty_validationError() {
        Person p = new Person("", "Nhoj", (byte) 30);
        validator.validate(p);

        assertFalse(validator.getValidationErrors().isEmpty());
    }

    @Test
    public void lastNameIsEmpty_validationError() {
        Person p = new Person("John", "", (byte) 30);
        validator.validate(p);

        Set<ValidationResult> validationErrors = validator.getValidationErrors();

        assertEquals(
                "Validation result should be as expected",
                validationErrors.stream().map(ValidationResult::getMessage)
                        .filter(m -> m.equals("Last name should not be empty"))
                        .count(), 1);
    }
}