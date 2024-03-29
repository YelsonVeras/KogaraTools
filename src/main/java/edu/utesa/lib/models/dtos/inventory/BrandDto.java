package edu.utesa.lib.models.dtos.inventory;

import edu.utesa.lib.models.dtos.company.CompanyDto;

public class BrandDto {
    private CompanyDto companyDto;
    private String id;
    private String name;
    private String description;

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public String getSid() {
        return id;
    }

    public void setSid(String sid) {
        this.id = sid;
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
