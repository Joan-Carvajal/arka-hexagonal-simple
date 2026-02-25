package com.enyoi.arka.domain.valueobjects;

import java.util.Objects;
import java.util.regex.Pattern;

public record Email(String value) {

    private static final Pattern EMAIL_REGEX = Pattern.compile(
            "^[a-zA-Z0-9._+-]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");

    public Email(String value) {
        this.value = Objects.requireNonNull(value, "Email must no be null");
    }

    public static Email of(String value){
        if (!EMAIL_REGEX.matcher(value).matches()){
            throw new  IllegalArgumentException("Invalid email");
        }
        return new Email(value);
    }
}
