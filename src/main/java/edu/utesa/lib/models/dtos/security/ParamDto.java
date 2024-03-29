package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.enums.type.security.EnumParamValueType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParamDto extends BaseDto {
    private CompanyDto company;
    private Integer code;
    private EnumParamValueType type;
    private String name;
    private String description;
    private String value;
    private Boolean changeRoot = false;
}
