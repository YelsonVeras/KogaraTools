package edu.utesa.lib.models.dtos.sell;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.dtos.company.EmployeeDto;
import edu.utesa.lib.models.dtos.configuration.CoinDto;
import edu.utesa.lib.models.dtos.security.UserDto;
import edu.utesa.lib.models.enums.Status.InvoiceStatus;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class InvoiceDto {
    private CompanyDto companyDto;
    private EmployeeDto employeeDto;
    private UserDto userDto;
    private Date date;
    private Date dateLimit;
    private InvoiceStatus status;
    private String description;
    private CoinDto coinDto;
    private BigDecimal grossTotal;
    private BigDecimal tax;
    private BigDecimal discount;
    private BigDecimal arrears;
    private BigDecimal total;
    private Set<InvoiceDetailsDto> details;
}
