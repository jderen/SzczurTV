package com.example.szczurtv.szczurtv.model.enums;

import java.util.Arrays;
import java.util.Optional;

public interface EnumInterface<T extends Enum<T>> {
    Class<T> getClassOfEnum();
    String getCode();
    String getName();

    default Optional<T> valueOfCode(String code) {
        return Arrays.stream(getClassOfEnum().getEnumConstants()).filter(enumValue -> getCode().equals(code)).findFirst();
    }

    default Optional<T> valueOfName(String name) {
        return Arrays.stream(getClassOfEnum().getEnumConstants()).filter(enumValue -> getName().equals(name)).findFirst();
    }
}
