package edu.utesa.lib.models.dtos.company;

public class DepartmentDto {
    private CompanyDto companyDto;
    private String name;

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
}
