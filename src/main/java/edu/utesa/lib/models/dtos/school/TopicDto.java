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
public class TopicDto extends BaseDto {
    private SubjectDto subjectDto;
    private String name;
    private String description;

    public String getSubjectName(){
        return subjectDto.getName();
    }
}
