package com.luxoft.tc.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PersonFieldsValidatorTest.class,
        PersonBehaviorValidatorTest.class})
public class WorkflowValidationTestSuite {
    // the class remains empty,
    // used only as a holder for the above annotations
}
