package com.example.szczurtv.szczurtv.model.enums;

public enum Tag implements EnumInterface {
    RPG("RPG", "RPG", "Role playing game"),
    STRATEGY("STRATEGY", "Strategy", "Strategy game"),
    FPS("FPS", "FPS", "First person shooter"),
    MOBA("MOBA", "MOBA", "Multiplayer online battle arena"),
    SPORT("SPORT", "Sport", "Sport game"),
    JUST_CHATTING("JUST_CHATTING", "Just Chatting", "Just chatting"),
    EVENT("EVENT", "Event", "An event");

    private final String code;
    private final String name;
    private final String description;

    Tag(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    @Override
    public String getCode() { return code; }
    @Override
    public String getName() { return name ;}

    @Override
    public Class getClassOfEnum() {
        return Tag.class;
    }

    public String getDescription() {
        return description;
    }
}
