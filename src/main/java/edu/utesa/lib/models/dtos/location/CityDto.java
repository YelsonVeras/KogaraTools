package edu.utesa.lib.models.dtos.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CityDto {
    private CountryDto countryDto;
    private String name;
}
