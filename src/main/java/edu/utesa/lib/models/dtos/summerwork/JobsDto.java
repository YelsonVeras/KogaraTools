package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.configuration.CoinDto;
import edu.utesa.lib.models.dtos.location.AddressDto;
import edu.utesa.lib.models.enums.Period;

import java.math.BigDecimal;

public class JobsDto {
    private SponsorDto sponsorDto;
    private String name;
    private String company;
    private AddressDto addressDto;
    private String position;
    private BigDecimal pay;
    private CoinDto coinDto;
    private Period period;
    private String description;

    public SponsorDto getSponsorDto() {
        return sponsorDto;
    }

    public void setSponsorDto(SponsorDto sponsorDto) {
        this.sponsorDto = sponsorDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getPay() {
        return pay;
    }

    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    public CoinDto getCoinDto() {
        return coinDto;
    }

    public void setCoinDto(CoinDto coinDto) {
        this.coinDto = coinDto;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}