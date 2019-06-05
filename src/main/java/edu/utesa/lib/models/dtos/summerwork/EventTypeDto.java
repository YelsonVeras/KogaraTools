package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.dtos.configuration.CoinDto;
import edu.utesa.lib.models.dtos.inventory.ArticleDto;

import java.math.BigDecimal;

public class EventTypeDto {
    private CompanyDto companyDto;
    private String sid;
    private String name;
    private ArticleDto articleDto;
    private BigDecimal cost = BigDecimal.ZERO;
    private CoinDto coinDto;
}