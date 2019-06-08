package edu.utesa.lib.models.dtos.configuration;

import edu.utesa.lib.models.dtos.company.CompanyDto;

import java.util.Date;

public class SeasonDto {
   private CompanyDto companyDto;
   private String name;
   private Date startDate;
   private Date endDate;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}