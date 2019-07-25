package edu.utesa.lib.models.dtos.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GradeDto {
    private SchoolDto schoolDto;
    private String name;
    private String description;
}
