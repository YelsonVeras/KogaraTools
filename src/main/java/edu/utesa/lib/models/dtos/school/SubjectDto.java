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
public class SubjectDto extends BaseDto {
    private TeacherDto teacherDto;
    private GradeDto gradeDto;
    private String name;
    private String description;

    public String theGradeName() {
        return gradeDto.getName();
    }

    public String theTeacherName() {
        if (teacherDto != null && teacherDto.getPersonDto() != null)
            return teacherDto.getPersonDto().getFirstNames() + " " + teacherDto.getPersonDto().getLastNames();
        else
            return "";
    }
}
