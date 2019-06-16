package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;

import java.math.BigDecimal;

public class EmployeeDto extends BaseDto {
    private BranchOfficeDto branchOfficeDto;
    private PersonDto personDto;
    private UserDto userDto;
    private PositionDto positionDto;
    private BigDecimal salary;

    public BranchOfficeDto getBranchOfficeDto() {
        return branchOfficeDto;
    }

    public void setBranchOfficeDto(BranchOfficeDto branchOfficeDto) {
        this.branchOfficeDto = branchOfficeDto;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public PositionDto getPositionDto() {
        return positionDto;
    }

    public void setPositionDto(PositionDto positionDto) {
        this.positionDto = positionDto;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}