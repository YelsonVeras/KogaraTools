package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.location.CityDto;

import java.util.Date;

public class PassportDto {
    private ParticipantDto participantDto;
    private boolean passport;
    private String identification;
    private CityDto issuingCityDto;
    private Date issueDate;
    private Date expireDate;
    private String reason;
}