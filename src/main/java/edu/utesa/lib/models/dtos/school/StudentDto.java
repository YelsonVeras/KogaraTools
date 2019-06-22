package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.location.AddressDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;

public class StudentDto {
    private PersonDto personDto;
    private AddressDto addressDto;
    private SchoolDto schoolDto;
    private GradeDto gradeDto;
    private UserDto userDto;

    public StudentDto(PersonDto personDto, AddressDto addressDto, SchoolDto schoolDto, GradeDto gradeDto, UserDto userDto) {
        this.personDto = personDto;
        this.addressDto = addressDto;
        this.schoolDto = schoolDto;
        this.gradeDto = gradeDto;
        this.userDto = userDto;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public SchoolDto getSchoolDto() {
        return schoolDto;
    }

    public void setSchoolDto(SchoolDto schoolDto) {
        this.schoolDto = schoolDto;
    }

    public GradeDto getGradeDto() {
        return gradeDto;
    }

    public void setGradeDto(GradeDto gradeDto) {
        this.gradeDto = gradeDto;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
