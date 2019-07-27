package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.enums.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto extends BaseDto {
    private CompanyDto companyDto;
    private String nickName;
    private String password;
    private String mail;
    private Language language;
    private Boolean admin = false;
    private Set<PermissionDto> permissions;


    @Override
    public String toString() {
        return nickName;
    }
}