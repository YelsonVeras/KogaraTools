package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.location.AddressDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDto extends BaseDto {
    private PersonDto personDto;
    private AddressDto addressDto;
    private SchoolDto schoolDto;
    private GradeDto gradeDto;
    private UserDto userDto;
    private int points;

    public String theFullName() {
        return personDto.getFirstNames() + " " + personDto.getLastNames();
    }

    public String theFullAddress() {
        return addressDto.getAddress() + " " + addressDto.getSector() + ", " + addressDto.getCity() + ", " +
                addressDto.getCountryDto().getName() + ", " + addressDto.getZipCode();
    }

    public String theSchoolName() {
        return schoolDto.getName();
    }

    public String theGradeName() {
        return gradeDto.getName();
    }

    public String theUserNickname() {
        return userDto.getNickName();
    }
}
