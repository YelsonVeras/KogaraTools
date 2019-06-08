package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.enums.Kindred;
import edu.utesa.lib.models.enums.Status.ImmigrationStatus;

public class FamilyInformationDto {
    private PersonDto personDto;
    private Kindred kindred;
    private Boolean visa;
    private VisaTypeDto visaTypeDto;
    private Boolean working;
    private Boolean liveUSA;
    private ImmigrationStatus immigrationStatus;
    private WorkExperienceDto experience;

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

    public Boolean getLiveUSA() {
        return liveUSA;
    }

    public void setLiveUSA(Boolean liveUSA) {
        this.liveUSA = liveUSA;
    }

    public ImmigrationStatus getImmigrationStatus() {
        return immigrationStatus;
    }

    public void setImmigrationStatus(ImmigrationStatus immigrationStatus) {
        this.immigrationStatus = immigrationStatus;
    }

    public WorkExperienceDto getExperience() {
        return experience;
    }

    public void setExperience(WorkExperienceDto experience) {
        this.experience = experience;
    }
}