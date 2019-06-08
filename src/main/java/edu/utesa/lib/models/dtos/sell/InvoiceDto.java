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

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public EmployeeDto getEmployeeDto() {
        return employeeDto;
    }

    public void setEmployeeDto(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateLimit() {
        return dateLimit;
    }

    public void setDateLimit(Date dateLimit) {
        this.dateLimit = dateLimit;
    }

    public InvoiceStatus getStatus() {
        return status;
    }

    public void setStatus(InvoiceStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CoinDto getCoinDto() {
        return coinDto;
    }

    public void setCoinDto(CoinDto coinDto) {
        this.coinDto = coinDto;
    }

    public BigDecimal getGrossTotal() {
        return grossTotal;
    }

    public void setGrossTotal(BigDecimal grossTotal) {
        this.grossTotal = grossTotal;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getArrears() {
        return arrears;
    }

    public void setArrears(BigDecimal arrears) {
        this.arrears = arrears;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Set<InvoiceDetailsDto> getDetails() {
        return details;
    }

    public void setDetails(Set<InvoiceDetailsDto> details) {
        this.details = details;
    }
}
