package edu.utesa.lib.models.dtos.customer;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;

import java.math.BigDecimal;

public class WitnessDto extends BaseDto {
    private PersonDto personDto;

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }
}