package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GradeDto extends BaseDto {
    private SchoolDto schoolDto;
    private String name;
    private String description;

    public String theSchoolName(){
        return schoolDto.getName();
    }
}
