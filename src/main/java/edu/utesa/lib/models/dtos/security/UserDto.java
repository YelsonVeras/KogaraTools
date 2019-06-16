package edu.utesa.lib.models.dtos.security;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.company.CompanyDto;

import java.util.Locale;
import java.util.Set;

public class UserDto extends BaseDto {
    private CompanyDto companyDto;
    private String nickName;
    private String password;
    private String mail;
    private Locale language;
    private Boolean isAdmin = false;
    private Set<PermissionDto> permissionDtos;

    public CompanyDto getCompanyDto() {
        return companyDto;
    }

    public void setCompanyDto(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Locale getLanguage() {
        return language;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Set<PermissionDto> getPermissionDtos() {
        return permissionDtos;
    }

    public void setPermissionDtos(Set<PermissionDto> permissionDtos) {
        this.permissionDtos = permissionDtos;
    }
}