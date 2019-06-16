package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.BaseDto;

public class PositionDto extends BaseDto {
    private CompanyDto companyDto;
    private String name;
    private String description;

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
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
}