package edu.utesa.lib.models.dtos.school;

public class TopicDto {
    private GradeDto gradeDto;
    private SubjectDto subjectDto;
    private String name;
    private String description;

    public TopicDto(GradeDto gradeDto, SubjectDto subjectDto, String name, String description) {
        this.gradeDto = gradeDto;
        this.subjectDto = subjectDto;
        this.name = name;
        this.description = description;
    }

    public GradeDto getGradeDto() {
        return gradeDto;
    }

    public void setGradeDto(GradeDto gradeDto) {
        this.gradeDto = gradeDto;
    }

    public SubjectDto getSubjectDto() {
        return subjectDto;
    }

    public void setSubjectDto(SubjectDto subjectDto) {
        this.subjectDto = subjectDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
