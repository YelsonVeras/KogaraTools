package edu.utesa.lib.models.dtos.school;

public class GradeDto {
    private SchoolDto schoolDto;
    private String name;
    private String description;

    public SchoolDto getSchoolDto() {
        return schoolDto;
    }

    public void setSchoolDto(SchoolDto schoolDto) {
        this.schoolDto = schoolDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
