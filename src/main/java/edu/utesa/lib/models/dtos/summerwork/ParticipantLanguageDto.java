package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.enums.LanguageLevel;

public class ParticipantLanguageDto {
    private ParticipantDto participantDto;
    private String languages;
    private LanguageLevel level;

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public LanguageLevel getLevel() {
        return level;
    }

    public void setLevel(LanguageLevel level) {
        this.level = level;
    }
}