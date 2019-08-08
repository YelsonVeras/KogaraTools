package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubjectDto extends BaseDto {
    private TeacherDto teacherDto;
    private GradeDto gradeDto;
    private String name;
    private String description;

    public String theGradeName(){
        return gradeDto.getName();
    }

    public String theTeacherName(){
        return teacherDto.getPersonDto().getFirstNames() + " " + teacherDto.getPersonDto().getLastNames();
    }
}
