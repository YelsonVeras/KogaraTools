package edu.utesa.lib.models.enums.Status;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum InvoiceStatus {
    SETTLED, REVOKED, ACTIVE, IN_PAYMENT_PROCESS;

    @Override
    public String toString() {
        switch (this) {
            case SETTLED:
                return I18n.getText(EnumCaption.SETTLED);
            case REVOKED:
                return I18n.getText(EnumCaption.REVOKED);
            case ACTIVE:
                return I18n.getText(EnumCaption.ACTIVE);
            case IN_PAYMENT_PROCESS:
                return I18n.getText(EnumCaption.IN_PAYMENT_PROCESS);
        }
        return "";
    }
}
