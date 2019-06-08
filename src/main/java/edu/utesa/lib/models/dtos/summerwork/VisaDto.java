package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.enums.Period;

import java.math.BigInteger;
import java.util.Date;

public class VisaDto {
    private ParticipantDto participantDto;
    private boolean requested;
    private boolean visa;
    private VisaTypeDto type;
    private Date lastDepartureDate;
    private BigInteger time;
    private Period period;
    private Date issueDate;
    private Date expireDate;
    private String description;

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public boolean isRequested() {
        return requested;
    }

    public void setRequested(boolean requested) {
        this.requested = requested;
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    public VisaTypeDto getType() {
        return type;
    }

    public void setType(VisaTypeDto type) {
        this.type = type;
    }

    public Date getLastDepartureDate() {
        return lastDepartureDate;
    }

    public void setLastDepartureDate(Date lastDepartureDate) {
        this.lastDepartureDate = lastDepartureDate;
    }

    public BigInteger getTime() {
        return time;
    }

    public void setTime(BigInteger time) {
        this.time = time;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}