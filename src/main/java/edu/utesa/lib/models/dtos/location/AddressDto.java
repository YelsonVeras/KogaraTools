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
public class AddressDto extends BaseDto {
    private CountryDto countryDto;
    private String city;
    private String name = "Principal";
    private String sector;
    private String zipCode;
    private String address;
}
