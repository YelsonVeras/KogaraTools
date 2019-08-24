package edu.utesa.lib.models.dtos.loan;

import edu.utesa.lib.models.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
public class LoanPaymentDto extends BaseDto {
    private String date;
    private BigDecimal amount;
    private LoanDto loanDto;
    private BigDecimal interest;
    private BigDecimal capital;
    private BigDecimal nonPayment;

    public String theLoan(){
        return  loanDto.getId() + " - " + loanDto.getClient().theFullName();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LoanDto getLoanDto() {
        return loanDto;
    }

    public void setLoanDto(LoanDto loanDto) {
        this.loanDto = loanDto;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getNonPayment() {
        return nonPayment;
    }

    public void setNonPayment(BigDecimal nonPayment) {
        this.nonPayment = nonPayment;
    }
}
