package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.location.AddressDto;

public class SchoolDto {
    private String name;
    private String district;
    private AddressDto addressDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }
}
