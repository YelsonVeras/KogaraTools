package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.location.AddressDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeacherDto extends BaseDto {
    private PersonDto personDto;
    private AddressDto addressDto;
    private SchoolDto schoolDto;
    private GradeDto gradeDto;
    private UserDto userDto;

    public String getFullName() {
        return personDto.getFirstNames() + " " + personDto.getLastNames();
    }

    public String getAddress() {
        return addressDto.getAddress() + " " + addressDto.getSector() + ", " + addressDto.getCity() + ", " +
                addressDto.getCountryDto().getName() + ", " + addressDto.getZipCode();
    }

    public String getSchool() {
        return schoolDto.getName();
    }

    public String getGrade() {
        return gradeDto.getName();
    }

    public String getUser() {
        return userDto.getNickName();
    }
}
