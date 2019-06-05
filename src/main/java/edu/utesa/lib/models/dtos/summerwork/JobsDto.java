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
}