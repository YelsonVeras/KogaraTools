package edu.utesa.lib.models.dtos.configuration;

import java.math.BigDecimal;
import java.util.Date;

public class ProgramCost {
    private ProgramDto programDto;
    private String name;
    private BigDecimal cost;
    private Date limitPayDateCost;
    private CoinDto costCoinDto;
}