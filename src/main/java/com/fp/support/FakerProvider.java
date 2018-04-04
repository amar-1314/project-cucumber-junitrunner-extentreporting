package com.fp.support;

import com.github.javafaker.Faker;
import com.google.inject.Provider;

public class FakerProvider implements Provider<Faker> {
    @Override
    public Faker get() {
        return new Faker();
    }

}
