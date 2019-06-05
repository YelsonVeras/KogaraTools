package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.company.BranchOfficeDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;
import edu.utesa.lib.models.enums.Qualification;
import edu.utesa.lib.models.enums.Status.ParticipantStatus;
import edu.utesa.lib.models.enums.person.Size;

import java.util.Set;

public class ParticipantDto {
    private BranchOfficeDto branchOfficeDto;
    private Qualification qualification;
    private UserDto userDto;
    private PersonDto personDto;
    private ParticipantStatus status = ParticipantStatus.REGISTER;
    private Size tShirtSize = Size.SMALL;
    private Boolean passport = false;
    private String description;
    private Set<FamilyInformationDto> relative;
    private Set<GuarantorDto> guarantorDtos;
    private Set<SponsorDto> sponsorDtos;
}