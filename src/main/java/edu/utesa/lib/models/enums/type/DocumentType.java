package edu.utesa.lib.models.enums.type;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum DocumentType {
    ID, PASSPORT, DRIVER_LICENSE, RNC, PARTICIPANT, OTHER;

    @Override
    public String toString() {
        switch (this) {
            case ID:
                return I18n.getText(EnumCaption.ID);
            case PASSPORT:
                return I18n.getText(EnumCaption.PASSPORT);
            case DRIVER_LICENSE:
                return I18n.getText(EnumCaption.DRIVER_LICENSE);
            case RNC:
                return I18n.getText(EnumCaption.RNC);
            case PARTICIPANT:
                return I18n.getText(EnumCaption.PARTICIPANT);
            case OTHER:
                return I18n.getText(EnumCaption.OTHER);
        }
        return "";
    }
}
