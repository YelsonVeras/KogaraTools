package edu.utesa.lib.models.enums.Status;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum AppointmentStatus {
    PENDING,
    VALIDATED,
    COMPLETED,
    CANCELED,
    RE_GENDERED,
    CONFIRMED;

    @Override
    public String toString() {
        switch (this) {
            case PENDING:
                return I18n.getText(EnumCaption.APPOINTMENT_PENDING);
            case VALIDATED:
                return I18n.getText(EnumCaption.VALIDATED);
            case COMPLETED:
                return I18n.getText(EnumCaption.COMPLETED);
            case CANCELED:
                return I18n.getText(EnumCaption.CANCELED);
            case RE_GENDERED:
                return I18n.getText(EnumCaption.RE_GENDERED);
            case CONFIRMED:
                return I18n.getText(EnumCaption.CONFIRMED);
        }
        return "";
    }
}

