package edu.utesa.lib.models.enums.Status;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum ParticipantDocumentStatus {
    PENDING,
    APPROVED,
    REJECTED,
    SENT,
    DEPRECATED;

    @Override
    public String toString() {
        switch (this) {
            case PENDING:
                return I18n.getText(EnumCaption.PENDING);
            case APPROVED:
                return I18n.getText(EnumCaption.APPROVED);
            case REJECTED:
                return I18n.getText(EnumCaption.REJECTED);
            case SENT:
                return I18n.getText(EnumCaption.SENT);
            case DEPRECATED:
                return I18n.getText(EnumCaption.DEPRECATED);
        }
        return "";
    }
}
