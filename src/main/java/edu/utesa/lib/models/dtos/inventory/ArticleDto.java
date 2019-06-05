package edu.utesa.lib.models.dtos.inventory;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.enums.type.ArticleType;

import java.math.BigDecimal;

public class ArticleDto {
    private CompanyDto companyDto;
    private String sid = "";
    private String name;
    private UnitsDto unit;
    private BrandDto brandDto;
    private ArticleType type = ArticleType.SERVICE;
    private boolean expire = false;
    private BigDecimal reorderPoint = BigDecimal.ZERO;
    private BigDecimal tax = BigDecimal.ZERO;
    private BigDecimal quantity = BigDecimal.ZERO;
    private String description = "";
}