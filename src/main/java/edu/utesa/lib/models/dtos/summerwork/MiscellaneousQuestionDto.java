package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.enums.type.EnumMiscellaneousValueType;

public class MiscellaneousQuestionDto {
    private CompanyDto companyDto;
    private Integer code;
    private String question;
    private EnumMiscellaneousValueType type;

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public EnumMiscellaneousValueType getType() {
        return type;
    }

    public void setType(EnumMiscellaneousValueType type) {
        this.type = type;
    }
}