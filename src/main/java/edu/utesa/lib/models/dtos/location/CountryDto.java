package edu.utesa.lib.models.dtos.location;

import edu.utesa.lib.models.dtos.BaseDto;

public class CountryDto extends BaseDto {
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
