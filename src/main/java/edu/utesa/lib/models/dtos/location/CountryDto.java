package edu.utesa.lib.models.dtos.location;

import edu.utesa.lib.models.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CountryDto extends BaseDto {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
