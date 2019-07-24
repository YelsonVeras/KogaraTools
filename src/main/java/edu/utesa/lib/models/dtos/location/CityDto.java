package edu.utesa.lib.models.dtos.location;

public class CityDto {
    private CountryDto countryDto;
    private String name;

    public CityDto(CountryDto countryDto, String name) {
        this.countryDto = countryDto;
        this.name = name;
    }

    public CountryDto getCountryDto() {
        return countryDto;
    }

    public void setCountryDto(CountryDto countryDto) {
        this.countryDto = countryDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
