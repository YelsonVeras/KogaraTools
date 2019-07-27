package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.location.AddressDto;

public class BranchDto extends BaseDto {
    private CompanyDto companyDto;
    private String name;
    private boolean principal;
    private AddressDto addressDto;
    private String contacts;

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

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return name;
    }
}
