package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.enums.type.security.EnumPermissionType;

public class PermissionDto {
    private int code;
    private String name;
    private EnumPermissionType type;
    private String description;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumPermissionType getType() {
        return type;
    }

    public void setType(EnumPermissionType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}