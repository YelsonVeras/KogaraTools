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

    public BranchOfficeDto getBranchOfficeDto() {
        return branchOfficeDto;
    }

    public void setBranchOfficeDto(BranchOfficeDto branchOfficeDto) {
        this.branchOfficeDto = branchOfficeDto;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }

    public ParticipantStatus getStatus() {
        return status;
    }

    public void setStatus(ParticipantStatus status) {
        this.status = status;
    }

    public Size gettShirtSize() {
        return tShirtSize;
    }

    public void settShirtSize(Size tShirtSize) {
        this.tShirtSize = tShirtSize;
    }

    public Boolean getPassport() {
        return passport;
    }

    public void setPassport(Boolean passport) {
        this.passport = passport;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<FamilyInformationDto> getRelative() {
        return relative;
    }

    public void setRelative(Set<FamilyInformationDto> relative) {
        this.relative = relative;
    }

    public Set<GuarantorDto> getGuarantorDtos() {
        return guarantorDtos;
    }

    public void setGuarantorDtos(Set<GuarantorDto> guarantorDtos) {
        this.guarantorDtos = guarantorDtos;
    }

    public Set<SponsorDto> getSponsorDtos() {
        return sponsorDtos;
    }

    public void setSponsorDtos(Set<SponsorDto> sponsorDtos) {
        this.sponsorDtos = sponsorDtos;
    }
}