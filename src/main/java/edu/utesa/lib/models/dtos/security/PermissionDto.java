package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.enums.type.security.EnumPermissionType;

public class PermissionDto {
    private int code;
    private String name;
    private EnumPermissionType type;
    private String description;
}