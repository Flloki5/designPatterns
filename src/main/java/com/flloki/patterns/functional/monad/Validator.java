package com.flloki.patterns.functional.monad;

import java.util.List;
import java.util.function.Predicate;

public class Validator<T> {

    private final T item;
    private List<ValidationError> error;

    public Validator(T item) {
        this.item = item;
    }

    public static <T> Validator<T> of(T t) {
        return new Validator<>(t);
    }

    public Validator<T> validate(Predicate<T> validation, ValidationError validationError) {
        if (!validation.test(item)) {
            error.add(validationError);
        }

        return this;
    }
}
