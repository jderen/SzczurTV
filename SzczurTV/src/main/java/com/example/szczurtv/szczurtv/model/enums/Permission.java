package com.example.szczurtv.szczurtv.model.enums;

public enum Permission implements EnumInterface{
    OWNER("OWNER", "Owner"),
    MODERATOR("MODERATOR", "Moderator"),
    VIP("VIP", "VIP"),
    SUBSCRIBER("SUBSCRIBER", "Subscriber"),
    FOLLOWER("FOLLOWER", "Follower"),
    VIEWER("VIEWER", "Viewer"),
    BANNED("BANNED", "Banned");

    private final String code;
    private final String name;

    Permission(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getCode() { return code; }
    @Override
    public String getName() { return name ;}

    @Override
    public Class getClassOfEnum() {
        return Permission.class;
    }
}
