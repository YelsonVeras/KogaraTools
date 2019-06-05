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
}