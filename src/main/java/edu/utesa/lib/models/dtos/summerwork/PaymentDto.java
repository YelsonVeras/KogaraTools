package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.dtos.configuration.CoinDto;
import edu.utesa.lib.models.enums.Status.PaymentStatus;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class PaymentDto {
    private CompanyDto companyDto;
    private ParticipantProgramDto program;
    private ParticipantDto participantDto;
    private PaymentStatus status = PaymentStatus.PENDING;
    private BigInteger account;
    private BigDecimal amount;
    private CoinDto coinDto;
    private Date date;
    private String atm;
    private String station;
    private String description;
}