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
public class LearnDto extends BaseDto {
    private TopicDto topicDto;
    private String description;

    public String theTopicName() {
        return topicDto.getName();
    }
}
