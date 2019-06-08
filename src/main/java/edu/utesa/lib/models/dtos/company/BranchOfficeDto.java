package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.contact.ContactDto;
import edu.utesa.lib.models.dtos.location.AddressDto;

import java.util.Set;

public class BranchOfficeDto {
    private CompanyDto companyDto;
    private String name;
    private boolean principal;
    private AddressDto addressDto;
    private Set<ContactDto> contacts;

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

    public Set<ContactDto> getContacts() {
        return contacts;
    }

    public void setContacts(Set<ContactDto> contacts) {
        this.contacts = contacts;
    }
}
