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
    private Set<AnswerDto> incorrectAnswers;
    private AnswerDto correctAnswer;
}
