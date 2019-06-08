package edu.utesa.lib.models.dtos.configuration;

import java.math.BigDecimal;
import java.util.Date;

public class ProgramCost {
    private ProgramDto programDto;
    private String name;
    private BigDecimal cost;
    private Date limitPayDateCost;
    private CoinDto costCoinDto;

    public ProgramDto getProgramDto() {
        return programDto;
    }

    public void setProgramDto(ProgramDto programDto) {
        this.programDto = programDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}