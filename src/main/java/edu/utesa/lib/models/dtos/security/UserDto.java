package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.dtos.company.CompanyDto;

import java.util.Locale;
import java.util.Set;

public class UserDto {
    private CompanyDto companyDto;
    private String nickName;
    private String password;
    private String mail;
    private Locale language;
    private Boolean isAdmin = false;
    private Set<PermissionDto> permissionDtos;
}