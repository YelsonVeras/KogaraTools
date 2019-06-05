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
}