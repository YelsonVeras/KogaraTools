package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;

import java.math.BigDecimal;

public class EmployeeDto extends BaseDto {
    private BranchDto branchDto;
    private PersonDto personDto;
    private UserDto userDto;
    private PositionDto positionDto;
    private DepartmentDto departmentDto;
    private BigDecimal salary;

    public String theFullName(){
        return personDto.getFirstNames() + " " + personDto.getLastNames();
    }

    public EmployeeDto() {
    }

    public EmployeeDto(BranchDto branchDto, PersonDto personDto, UserDto userDto, PositionDto positionDto, DepartmentDto departmentDto, BigDecimal salary) {
        this.branchDto = branchDto;
        this.personDto = personDto;
        this.userDto = userDto;
        this.positionDto = positionDto;
        this.departmentDto = departmentDto;
        this.salary = salary;
    }

    public EmployeeDto(long id, BranchDto branchDto, PersonDto personDto, UserDto userDto, PositionDto positionDto, BigDecimal salary) {
        setId(id);
        this.branchDto = branchDto;
        this.personDto = personDto;
        this.userDto = userDto;
        this.positionDto = positionDto;
        this.salary = salary;
    }

    public BranchDto getBranchDto() {
        return branchDto;
    }

    public void setBranchDto(BranchDto branchDto) {
        this.branchDto = branchDto;
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

    public DepartmentDto getDepartmentDto() {
        return departmentDto;
    }

    public void setDepartmentDto(DepartmentDto departmentDto) {
        this.departmentDto = departmentDto;
    }

    @Override
    public String toString() {
        return personDto.toString();
    }
}