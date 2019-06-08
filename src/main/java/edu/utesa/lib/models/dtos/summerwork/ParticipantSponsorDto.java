package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.configuration.SeasonDto;

public class ParticipantSponsorDto {
    private ParticipantDto participantDto;
    private SponsorDto sponsorDto;
    private SeasonDto seasonDto;

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public SponsorDto getSponsorDto() {
        return sponsorDto;
    }

    public void setSponsorDto(SponsorDto sponsorDto) {
        this.sponsorDto = sponsorDto;
    }

    public SeasonDto getSeasonDto() {
        return seasonDto;
    }

    public void setSeasonDto(SeasonDto seasonDto) {
        this.seasonDto = seasonDto;
    }
}