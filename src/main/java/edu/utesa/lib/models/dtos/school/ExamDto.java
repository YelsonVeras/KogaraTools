package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import edu.utesa.lib.models.enums.ExamDifficulty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExamDto extends BaseDto {
    private TeacherDto teacherDto;
    private ExamDifficulty examDifficulty;
    private SubjectDto subjectDto;
    private TopicDto topicDto;
    private int problemQuantity;
    private String fromDate;
    private String toDate;
    private Set<ProblemDto> problems;
    private int points;

    public String theTeacherName(){
        return teacherDto.getPersonDto().getFirstNames() + " " + teacherDto.getPersonDto().getLastNames();
    }

    public String theSubjectName(){
        return subjectDto.getName();
    }

    public String theTopicName(){
        return topicDto.getName();
    }
}
