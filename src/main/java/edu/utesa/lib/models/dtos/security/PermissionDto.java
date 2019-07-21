package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.dtos.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermissionDto extends BaseDto {
    private int code;
    private String name;
    private String description;
}