package com.example.szczurtv.szczurtv.model.enums;

public enum Role implements EnumInterface {
    ADMIN("ADMIN", "Administrator"),
    USER("USER", "User");

    private final String code;
    private final String name;

    Role(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getCode() { return code; }
    @Override
    public String getName() { return name ;}

    @Override
    public Class getClassOfEnum() {
        return Role.class;
    }
}
