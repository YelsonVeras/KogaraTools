package edu.utesa.lib.models.dtos.configuration;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.enums.Status.ProgramStatus;

import java.math.BigDecimal;
import java.util.Date;

public class ProgramDto {
    private CompanyDto companyDto;
    private ProgramStatus status = ProgramStatus.OPEN;
    private SeasonDto seasonDto;
    private ProgramTypeDto type;
    private BigDecimal cost;
    private Date limitPayDateCost;
    private CoinDto costCoinDto;
    private BigDecimal legalCost;
    private Date limitPayDateLegalCost;
    private CoinDto costLegalCoinDto;
    private BigDecimal formCost;
    private Date limitPayDateFormCost;
    private CoinDto costFormCoinDto;
    private BigDecimal consularCost;
    private Date limitPayDateConsularCost;
    private CoinDto costConsularCoinDto;
    private BigDecimal total;
    private String description;
}