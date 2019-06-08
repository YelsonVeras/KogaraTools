package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.document.DocumentDto;
import edu.utesa.lib.models.enums.Status.ParticipantDocumentStatus;

public class ParticipantDocumentDto {
    private ParticipantDto participantDto;
    private DocumentDto documentDto;
    private String documentAddress;
    private ParticipantDocumentStatus status;

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public DocumentDto getDocumentDto() {
        return documentDto;
    }

    public void setDocumentDto(DocumentDto documentDto) {
        this.documentDto = documentDto;
    }

    public String getDocumentAddress() {
        return documentAddress;
    }

    public void setDocumentAddress(String documentAddress) {
        this.documentAddress = documentAddress;
    }

    public ParticipantDocumentStatus getStatus() {
        return status;
    }

    public void setStatus(ParticipantDocumentStatus status) {
        this.status = status;
    }
}