package edu.utesa.lib.models.dtos.person;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.location.AddressDto;
import edu.utesa.lib.models.enums.person.Gender;
import edu.utesa.lib.models.enums.person.MaritalStatus;
import edu.utesa.lib.models.enums.person.Nationality;

import java.util.Date;

public class PersonDto extends BaseDto {
    private String firstNames;
    private String lastNames;
    private Nationality nationality;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Date birthDay;
    private String issueCity;
    private AddressDto addressDto;
    private String dni;

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getIssueCity() {
        return issueCity;
    }

    public void setIssueCity(String issueCity) {
        this.issueCity = issueCity;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
