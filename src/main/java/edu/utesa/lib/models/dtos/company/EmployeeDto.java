package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;

import java.math.BigDecimal;

public class EmployeeDto extends BaseDto {
    private PersonDto personDto;
    private UserDto userDto;
    private BigDecimal limiter;

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

    public BigDecimal getLimiter() {
        return limiter;
    }

    public void setLimiter(BigDecimal limiter) {
        this.limiter = limiter;
    }
}