package com.luxoft.tc.junit;

import java.util.*;

public class PersonMandatoryFieldsValidator implements Validator<Person> {
	private Set<ValidationResult> errors = new HashSet<ValidationResult>();
	
	@Override
	public void validate(Person person) {
		if (person.getFirstName() == null || "".equals(person.getFirstName())) {
			errors.add(new ValidationResult(ValidationResult.ERROR, "First name should not be empty"));
		} else if (person.getLastName() == null || "".equals(person.getLastName())) {
			errors.add(new ValidationResult(ValidationResult.ERROR, "Last name should not be empty"));	
		} else if (person.getAge() <= 0 || person.getAge() >= 150) {
			errors.add(new ValidationResult(ValidationResult.ERROR, "Invalid value of 'age'"));
		}
	}
	
	@Override
	public boolean hasValidationErrors() {
		return !this.errors.isEmpty();
	}
	
	@Override
	public Set<ValidationResult> getValidationErrors() {
		return this.errors;
	}
	
	public static PersonMandatoryFieldsValidator getInstance() {
		return new PersonMandatoryFieldsValidator();
	}
}