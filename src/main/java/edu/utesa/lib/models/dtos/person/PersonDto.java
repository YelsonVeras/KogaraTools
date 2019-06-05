package edu.utesa.lib.models.dtos.person;

import edu.utesa.lib.models.dtos.location.AddressDto;
import edu.utesa.lib.models.enums.person.Gender;
import edu.utesa.lib.models.enums.person.MaritalStatus;
import edu.utesa.lib.models.enums.person.Nationality;

import java.util.Date;

public class PersonDto {
    String firstNames;
    String lastNames;
    Nationality nationality;
    Gender gender;
    MaritalStatus maritalStatus;
    Date birthDay;
    String issueCity;
    AddressDto addressDto;
    String dni;
}
