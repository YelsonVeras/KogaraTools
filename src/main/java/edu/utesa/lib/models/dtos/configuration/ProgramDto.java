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

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public ProgramStatus getStatus() {
        return status;
    }

    public void setStatus(ProgramStatus status) {
        this.status = status;
    }

    public SeasonDto getSeasonDto() {
        return seasonDto;
    }

    public void setSeasonDto(SeasonDto seasonDto) {
        this.seasonDto = seasonDto;
    }

    public ProgramTypeDto getType() {
        return type;
    }

    public void setType(ProgramTypeDto type) {
        this.type = type;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getLimitPayDateCost() {
        return limitPayDateCost;
    }

    public void setLimitPayDateCost(Date limitPayDateCost) {
        this.limitPayDateCost = limitPayDateCost;
    }

    public CoinDto getCostCoinDto() {
        return costCoinDto;
    }

    public void setCostCoinDto(CoinDto costCoinDto) {
        this.costCoinDto = costCoinDto;
    }

    public BigDecimal getLegalCost() {
        return legalCost;
    }

    public void setLegalCost(BigDecimal legalCost) {
        this.legalCost = legalCost;
    }

    public Date getLimitPayDateLegalCost() {
        return limitPayDateLegalCost;
    }

    public void setLimitPayDateLegalCost(Date limitPayDateLegalCost) {
        this.limitPayDateLegalCost = limitPayDateLegalCost;
    }

    public CoinDto getCostLegalCoinDto() {
        return costLegalCoinDto;
    }

    public void setCostLegalCoinDto(CoinDto costLegalCoinDto) {
        this.costLegalCoinDto = costLegalCoinDto;
    }

    public BigDecimal getFormCost() {
        return formCost;
    }

    public void setFormCost(BigDecimal formCost) {
        this.formCost = formCost;
    }

    public Date getLimitPayDateFormCost() {
        return limitPayDateFormCost;
    }

    public void setLimitPayDateFormCost(Date limitPayDateFormCost) {
        this.limitPayDateFormCost = limitPayDateFormCost;
    }

    public CoinDto getCostFormCoinDto() {
        return costFormCoinDto;
    }

    public void setCostFormCoinDto(CoinDto costFormCoinDto) {
        this.costFormCoinDto = costFormCoinDto;
    }

    public BigDecimal getConsularCost() {
        return consularCost;
    }

    public void setConsularCost(BigDecimal consularCost) {
        this.consularCost = consularCost;
    }

    public Date getLimitPayDateConsularCost() {
        return limitPayDateConsularCost;
    }

    public void setLimitPayDateConsularCost(Date limitPayDateConsularCost) {
        this.limitPayDateConsularCost = limitPayDateConsularCost;
    }

    public CoinDto getCostConsularCoinDto() {
        return costConsularCoinDto;
    }

    public void setCostConsularCoinDto(CoinDto costConsularCoinDto) {
        this.costConsularCoinDto = costConsularCoinDto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}