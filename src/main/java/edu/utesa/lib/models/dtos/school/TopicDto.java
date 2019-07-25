package edu.utesa.lib.models.dtos.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TopicDto {
    private GradeDto gradeDto;
    private SubjectDto subjectDto;
    private String name;
    private String description;
}
