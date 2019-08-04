package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.location.AddressDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SchoolDto extends BaseDto {
    private String name;
    private String district;
    private AddressDto addressDto;

    public String theFullAddress() {
        return addressDto.getAddress() + " " + addressDto.getSector() + ", " + addressDto.getCity() + ", " +
                addressDto.getCountryDto().getName() + ", " + addressDto.getZipCode();
    }
}
