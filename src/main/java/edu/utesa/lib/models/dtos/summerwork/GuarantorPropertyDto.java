package edu.utesa.lib.models.dtos.summerwork;

public class GuarantorPropertyDto {
    private boolean home = false;
    private boolean vehicle = false;
    private boolean businessPremises = false;
    private boolean hasCompany = false;
    private boolean others = false;
    private String description = "";

    public boolean isHome() {
        return home;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public boolean isVehicle() {
        return vehicle;
    }

    public void setVehicle(boolean vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isBusinessPremises() {
        return businessPremises;
    }

    public void setBusinessPremises(boolean businessPremises) {
        this.businessPremises = businessPremises;
    }

    public boolean isHasCompany() {
        return hasCompany;
    }

    public void setHasCompany(boolean hasCompany) {
        this.hasCompany = hasCompany;
    }

    public boolean isOthers() {
        return others;
    }

    public void setOthers(boolean others) {
        this.others = others;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}