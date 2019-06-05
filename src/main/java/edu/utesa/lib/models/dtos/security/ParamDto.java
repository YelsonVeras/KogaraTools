package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.enums.type.security.EnumParamValueType;

public class ParamDto {
    private CompanyDto companyDto;
    private Integer code;
    private EnumParamValueType type;
    private String name;
    private String description;
    private String value;
    private Boolean changeRoot = false;
}
