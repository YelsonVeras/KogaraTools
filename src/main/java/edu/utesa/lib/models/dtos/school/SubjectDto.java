package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubjectDto extends BaseDto {
    private GradeDto gradeDto;
    private String name;
    private String description;

    public String getGradeName(){
        return gradeDto.getName();
    }
}
