package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.document.DocumentDto;
import edu.utesa.lib.models.dtos.security.ParamDto;
import edu.utesa.lib.models.dtos.security.UserDto;

import java.util.Set;

public class CompanyDto {
    private UserDto userDto;
    private String name;
    private String url = "";
    private String activity;
    private String RNC;
    private String imgAddress;
    private String description;
    private Set<DocumentDto> documentDtos;
    private Set<ParamDto> paramDtos;
}
