package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.location.AddressDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SchoolDto extends BaseDto {
    private String name;
    private String district;
    private AddressDto addressDto;

    public String theFullAddress() {
        if (addressDto != null)
            return addressDto.getAddress() + " " + addressDto.getSector() + ", " + addressDto.getCity() + ", " +
                    addressDto.getCountryDto().getName() + ", " + addressDto.getZipCode();
        else
            return "";
    }
}
