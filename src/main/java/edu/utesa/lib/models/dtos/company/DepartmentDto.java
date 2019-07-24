package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.BaseDto;

public class DepartmentDto extends BaseDto {
    private String name;
    private String description;

    public DepartmentDto() {
    }

    public DepartmentDto(long id, String name) {
        setId(id);
        this.name = name;
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
