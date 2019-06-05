package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.contact.ContactDto;
import edu.utesa.lib.models.dtos.location.AddressDto;

import java.math.BigDecimal;

public class WorkExperienceDto {
    private ParticipantDto participantDto;
    private boolean work;
    private String company;
    private String position;
    private BigDecimal salary;
    private ContactDto contact;
    private AddressDto addressDto;
    private String description;
}