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

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public EnumParamValueType getType() {
        return type;
    }

    public void setType(EnumParamValueType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getChangeRoot() {
        return changeRoot;
    }

    public void setChangeRoot(Boolean changeRoot) {
        this.changeRoot = changeRoot;
    }
}
