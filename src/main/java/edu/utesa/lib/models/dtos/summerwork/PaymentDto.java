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

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public ParticipantProgramDto getProgram() {
        return program;
    }

    public void setProgram(ParticipantProgramDto program) {
        this.program = program;
    }

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public BigInteger getAccount() {
        return account;
    }

    public void setAccount(BigInteger account) {
        this.account = account;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CoinDto getCoinDto() {
        return coinDto;
    }

    public void setCoinDto(CoinDto coinDto) {
        this.coinDto = coinDto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}