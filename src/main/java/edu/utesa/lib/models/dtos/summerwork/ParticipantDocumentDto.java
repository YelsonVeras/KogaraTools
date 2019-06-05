package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.document.DocumentDto;
import edu.utesa.lib.models.enums.Status.ParticipantDocumentStatus;

public class ParticipantDocumentDto {
    private ParticipantDto participantDto;
    private DocumentDto documentDto;
    private String documentAddress;
    private ParticipantDocumentStatus status;
}