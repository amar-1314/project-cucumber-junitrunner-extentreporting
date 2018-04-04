package com.fp.support;

import com.github.javafaker.Faker;
import com.google.inject.Binder;
import com.google.inject.Module;

public class BaseModule implements Module {
    @Override
    public void configure(Binder binder) {
        FakerProvider fake = new FakerProvider();
        binder.bind(Faker.class).toProvider(fake);
    }

}
