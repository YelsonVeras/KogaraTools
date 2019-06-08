package edu.utesa.lib.models.dtos.location;

public class CountryDto {
    private ContinentDto continentDto;
    private String name;

    public ContinentDto getContinentDto() {
        return continentDto;
    }

    public void setContinentDto(ContinentDto continentDto) {
        this.continentDto = continentDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
