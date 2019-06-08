package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.location.AddressDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.enums.Kindred;

import java.math.BigDecimal;

public class GuarantorDto {
    private PersonDto personDto;
    private Kindred kindred;
    private Boolean visa;
    private VisaTypeDto visaTypeDto;
    private Boolean working;
    private String companyName;
    private String position;
    private BigDecimal salary;
    private AddressDto companyAddressDto;
    private WorkExperienceDto experience;
    private GuarantorPropertyDto property;
    private String description;

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }

    public Kindred getKindred() {
        return kindred;
    }

    public void setKindred(Kindred kindred) {
        this.kindred = kindred;
    }

    public Boolean getVisa() {
        return visa;
    }

    public void setVisa(Boolean visa) {
        this.visa = visa;
    }

    public VisaTypeDto getVisaTypeDto() {
        return visaTypeDto;
    }

    public void setVisaTypeDto(VisaTypeDto visaTypeDto) {
        this.visaTypeDto = visaTypeDto;
    }

    public Boolean getWorking() {
        return working;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public AddressDto getCompanyAddressDto() {
        return companyAddressDto;
    }

    public void setCompanyAddressDto(AddressDto companyAddressDto) {
        this.companyAddressDto = companyAddressDto;
    }

    public WorkExperienceDto getExperience() {
        return experience;
    }

    public void setExperience(WorkExperienceDto experience) {
        this.experience = experience;
    }

    public GuarantorPropertyDto getProperty() {
        return property;
    }

    public void setProperty(GuarantorPropertyDto property) {
        this.property = property;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}