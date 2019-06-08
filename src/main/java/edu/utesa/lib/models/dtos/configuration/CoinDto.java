package edu.utesa.lib.models.dtos.configuration;

import edu.utesa.lib.models.dtos.company.CompanyDto;

public class CoinDto {
    private CompanyDto companyDto;
    private String sid;
    private String name;

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}