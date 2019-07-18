package edu.utesa.lib.models.dtos.loan;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.company.EmployeeDto;
import edu.utesa.lib.models.dtos.customer.ClientDto;
import edu.utesa.lib.models.enums.LoanCategory;
import edu.utesa.lib.models.enums.LoanStatus;
import edu.utesa.lib.models.enums.LoanType;
import edu.utesa.lib.models.enums.Period;

import java.math.BigDecimal;
import java.util.Date;

public class LoanDto extends BaseDto {
    private EmployeeDto agent;
    private ClientDto client;

    private LoanType type;
    private LoanCategory category;

    private BigDecimal requestedAmount;
    private BigDecimal approvedAmount;
    private BigDecimal disbursementAmount;

    private Date requestedDate;
    private Date approvedDate;
    private Date disbursementDate;

    private BigDecimal interestRate;
    private Period interestPeriod;

    private int term;
    private Period interestTerm;

    private LoanStatus loanStatus;
    private Date startPaymentOn;
    private BigDecimal nonPayment;


    public EmployeeDto getAgent() {
        return agent;
    }

    public void setAgent(EmployeeDto agent) {
        this.agent = agent;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public LoanType getType() {
        return type;
    }

    public void setType(LoanType type) {
        this.type = type;
    }

    public LoanCategory getCategory() {
        return category;
    }

    public void setCategory(LoanCategory category) {
        this.category = category;
    }

    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public BigDecimal getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(BigDecimal approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public BigDecimal getDisbursementAmount() {
        return disbursementAmount;
    }

    public void setDisbursementAmount(BigDecimal disbursementAmount) {
        this.disbursementAmount = disbursementAmount;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Date getDisbursementDate() {
        return disbursementDate;
    }

    public void setDisbursementDate(Date disbursementDate) {
        this.disbursementDate = disbursementDate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Period getInterestPeriod() {
        return interestPeriod;
    }

    public void setInterestPeriod(Period interestPeriod) {
        this.interestPeriod = interestPeriod;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public Period getInterestTerm() {
        return interestTerm;
    }

    public void setInterestTerm(Period interestTerm) {
        this.interestTerm = interestTerm;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public Date getStartPaymentOn() {
        return startPaymentOn;
    }

    public void setStartPaymentOn(Date startPaymentOn) {
        this.startPaymentOn = startPaymentOn;
    }

    public BigDecimal getNonPayment() {
        return nonPayment;
    }

    public void setNonPayment(BigDecimal nonPayment) {
        this.nonPayment = nonPayment;
    }
}
