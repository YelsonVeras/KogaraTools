package edu.utesa.lib.models.dtos.company;

import edu.utesa.lib.models.dtos.BaseDto;

public class PositionDto extends BaseDto {
    private String name;
    private String description;

    public PositionDto() {
    }

    public PositionDto(long id, String name, String description) {
        setId(id);
        this.name = name;
        this.description = description;
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

    @Override
    public String toString() {
        return name;
    }
}