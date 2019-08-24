package edu.utesa.lib.models.dtos.loan;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.company.EmployeeDto;
import edu.utesa.lib.models.dtos.customer.ClientDto;
import edu.utesa.lib.models.enums.LoanCategory;
import edu.utesa.lib.models.enums.LoanStatus;
import edu.utesa.lib.models.enums.LoanType;
import edu.utesa.lib.models.enums.Period;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class LoanDto extends BaseDto {
    private EmployeeDto agent;
    private ClientDto client;
    private LoanType type;
    private BigDecimal amount;
    private String date;

    private BigDecimal interestRate;
    private Period interestPeriod;

    private int term;
    private Period interestTerm;

    private boolean paid;
    private String startPaymentOn;
    private BigDecimal nonPayment;

    public LoanDto(Long id) {
        super(id);
    }

    public LoanDto(Long id, EmployeeDto agent, ClientDto client, LoanType type, BigDecimal amount, String date, BigDecimal interestRate, Period interestPeriod, int term, Period interestTerm, boolean paid, String startPaymentOn, BigDecimal nonPayment) {
        super(id);
        this.agent = agent;
        this.client = client;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.interestRate = interestRate;
        this.interestPeriod = interestPeriod;
        this.term = term;
        this.interestTerm = interestTerm;
        this.paid = paid;
        this.startPaymentOn = startPaymentOn;
        this.nonPayment = nonPayment;
    }
}
