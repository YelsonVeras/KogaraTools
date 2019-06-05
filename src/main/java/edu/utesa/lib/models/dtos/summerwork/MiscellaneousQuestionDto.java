package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.enums.type.EnumMiscellaneousValueType;

public class MiscellaneousQuestionDto {
    private CompanyDto companyDto;
    private Integer code;
    private String question;
    private EnumMiscellaneousValueType type;

}