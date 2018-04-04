package com.fp.helpers;

import org.assertj.core.api.AbstractStandardSoftAssertions;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertionError;
import org.assertj.core.api.SoftAssertions;

import java.util.List;
import java.util.function.Consumer;

public class Assertion extends AbstractStandardSoftAssertions {

    public Assertion() {
    }

    public void assertAll() {
        List<Throwable> errors = this.errorsCollected();
        if (!errors.isEmpty()) {
            throw new SoftAssertionError(Assertions.extractProperty("message", String.class).from(errors));
        }
    }

    public void assertIfNotNull(Object actual, Object expected, String message){
        if(expected != null){
            assertThat(actual).as(message).isEqualTo(expected);
        }
    }
}