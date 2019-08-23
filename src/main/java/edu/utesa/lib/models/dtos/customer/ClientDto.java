package edu.utesa.lib.models.dtos.customer;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.company.BranchDto;
import edu.utesa.lib.models.dtos.person.PersonDto;
import edu.utesa.lib.models.dtos.security.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientDto extends BaseDto {
    private BranchDto branchDto;
    private PersonDto personDto;
    private UserDto userDto;
    private BigDecimal limiter;

    public String theFullName(){
        return personDto.getFirstNames() + " " + personDto.getLastNames();
    }
}