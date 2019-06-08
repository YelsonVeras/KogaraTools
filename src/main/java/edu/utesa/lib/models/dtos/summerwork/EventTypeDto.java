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

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArticleDto getArticleDto() {
        return articleDto;
    }

    public void setArticleDto(ArticleDto articleDto) {
        this.articleDto = articleDto;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public CoinDto getCoinDto() {
        return coinDto;
    }

    public void setCoinDto(CoinDto coinDto) {
        this.coinDto = coinDto;
    }
}