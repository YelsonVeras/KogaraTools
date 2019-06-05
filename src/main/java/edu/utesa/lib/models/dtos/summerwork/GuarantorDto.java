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
}