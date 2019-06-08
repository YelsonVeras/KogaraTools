package edu.utesa.lib.models.dtos.summerwork;

public class MiscellaneousDto {
    private ParticipantDto participantDto;
    private MiscellaneousQuestionDto question;
    private String response;
    private String description;

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public MiscellaneousQuestionDto getQuestion() {
        return question;
    }

    public void setQuestion(MiscellaneousQuestionDto question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
