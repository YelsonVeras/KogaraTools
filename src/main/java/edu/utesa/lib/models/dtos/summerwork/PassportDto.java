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

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public boolean isPassport() {
        return passport;
    }

    public void setPassport(boolean passport) {
        this.passport = passport;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public CityDto getIssuingCityDto() {
        return issuingCityDto;
    }

    public void setIssuingCityDto(CityDto issuingCityDto) {
        this.issuingCityDto = issuingCityDto;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}