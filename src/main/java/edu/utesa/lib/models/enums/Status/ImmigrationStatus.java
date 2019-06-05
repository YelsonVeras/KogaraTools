package edu.utesa.lib.models.enums.Status;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum ImmigrationStatus {
    RESIDENT, CITIZEN, ILLEGAL, OTHER;

    @Override
    public String toString() {
        switch (this) {
            case RESIDENT:
                return I18n.getText(EnumCaption.RESIDENT);
            case CITIZEN:
                return I18n.getText(EnumCaption.CITIZEN);
            case ILLEGAL:
                return I18n.getText(EnumCaption.ILLEGAL);
            case OTHER:
                return I18n.getText(EnumCaption.IMMIGRATION_STATUS_OTHER);
        }
        return "";
    }
}
