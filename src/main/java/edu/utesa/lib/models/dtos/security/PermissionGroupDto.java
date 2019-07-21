package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.company.CompanyDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermissionGroupDto extends BaseDto {
    private CompanyDto company;
    private String name;
    private String description;
}