package edu.utesa.lib.models.enums.Status;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum ProgramStatus {
    CLOSE,
    OPEN,
    CANCEL;

    @Override
    public String toString() {
        switch (this) {
            case CLOSE:
                return I18n.getText(EnumCaption.CLOSE);
            case OPEN:
                return I18n.getText(EnumCaption.OPEN);
            case CANCEL:
                return I18n.getText(EnumCaption.CANCEL);
        }
        return "";
    }
}

