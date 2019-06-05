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
}
