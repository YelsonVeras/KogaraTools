package edu.utesa.lib.models.dtos.person;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.location.AddressDto;
import edu.utesa.lib.models.enums.person.Gender;
import edu.utesa.lib.models.enums.person.MaritalStatus;
import edu.utesa.lib.models.enums.person.Nationality;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonDto extends BaseDto {
    private String dni;
    private String firstNames;
    private String lastNames;
    private Date birthday;
    private Gender gender;
    private Nationality nationality;
    private MaritalStatus maritalStatus;
    private AddressDto addressDto;
}
