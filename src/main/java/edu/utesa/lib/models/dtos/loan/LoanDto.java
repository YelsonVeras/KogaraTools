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
@AllArgsConstructor
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
    private Date startPaymentOn;
    private BigDecimal nonPayment;
}
