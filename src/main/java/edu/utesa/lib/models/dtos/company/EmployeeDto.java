package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;

import java.math.BigDecimal;

public class EmployeeDto {
    private BranchOfficeDto branchOfficeDto;
    private PersonDto personDto;
    private UserDto userDto;
    private PositionDto positionDto;
    private BigDecimal salary;
}