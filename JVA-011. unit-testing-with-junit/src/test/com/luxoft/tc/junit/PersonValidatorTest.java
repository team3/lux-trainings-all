package com.luxoft.tc.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import com.luxoft.tc.junit.ValidationResult;
import com.luxoft.tc.junit.Person;

@RunWith(JUnit4.class)
public class PersonValidatorTest {
    private Validator<Person> validator = PersonMandatoryFieldsValidator.getInstance();
	
    @Test
    public void firstNameIsEmpty_validationError() {
	    Person p = new Person("", "Nhoj", (byte) 30);
        validator.validate(p);

        Set<ValidationResult> validationErrors = validator.getValidationErrors();
    
        assertEquals(
                "Validation result should be as expected",
                    validationErrors.stream().map(ValidationResult::getMessage)
                        .filter(m -> m.equals("First name should not be empty"))
                        .count(), 1);
    }
}