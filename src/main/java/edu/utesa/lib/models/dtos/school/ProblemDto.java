package edu.utesa.lib.models.dtos.school;

import edu.utesa.lib.models.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProblemDto extends BaseDto {
    private TeacherDto teacherDto;
    private TopicDto topicDto;
    private String question;
    private String correctAnswer;
    private String incorrectAnswer01;
    private String incorrectAnswer02;
    private String incorrectAnswer03;

    public String theFullName() {
        return teacherDto.getPersonDto().getFirstNames() + " " + teacherDto.getPersonDto().getLastNames();
    }

    public String theTopicName() {
        return topicDto.getName();
    }
}
