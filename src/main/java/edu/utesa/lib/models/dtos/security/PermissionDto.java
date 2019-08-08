package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PermissionDto extends BaseDto {
    private int code;
    private String name;
    private String description;
}