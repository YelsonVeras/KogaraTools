package edu.utesa.lib.models.dtos.customer;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.person.PersonDto;

public class GuarantorDto extends BaseDto {
    private PersonDto personDto;

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }
}