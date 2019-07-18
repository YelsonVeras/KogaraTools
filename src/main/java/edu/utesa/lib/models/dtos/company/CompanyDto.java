package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.dtos.security.ParamDto;

import java.util.Set;

public class CompanyDto extends BaseDto {
    private String name;
    private String url = "";
    private String activity;
    private String RNC;
    private String imgAddress;
    private String description;
    private Set<ParamDto> paramDtos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getRNC() {
        return RNC;
    }

    public void setRNC(String RNC) {
        this.RNC = RNC;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ParamDto> getParamDtos() {
        return paramDtos;
    }

    public void setParamDtos(Set<ParamDto> paramDtos) {
        this.paramDtos = paramDtos;
    }
}
