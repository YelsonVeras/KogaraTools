package edu.utesa.lib.models.dtos.sell;

import edu.utesa.lib.models.dtos.inventory.ArticleDto;

import java.math.BigDecimal;

public class InvoiceDetailsDto {
    private InvoiceDto invoiceDto;
    private ArticleDto articleDto;
    private String concept;
    private BigDecimal quantity;
    private BigDecimal price;
    private BigDecimal tax;
    private BigDecimal amount;
}