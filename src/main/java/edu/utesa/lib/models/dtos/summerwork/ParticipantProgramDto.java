package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.configuration.ProgramDto;

public class ParticipantProgramDto {
    private ParticipantDto participantDto;
    private ProgramDto programDto;

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public ProgramDto getProgramDto() {
        return programDto;
    }

    public void setProgramDto(ProgramDto programDto) {
        this.programDto = programDto;
    }
}