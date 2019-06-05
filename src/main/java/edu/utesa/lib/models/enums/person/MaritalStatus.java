package edu.utesa.lib.models.enums.person;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum MaritalStatus {
    SINGLE, MARRIED, SEPARATED, DIVORCED, WIDOWED;

    @Override
    public String toString() {
        switch (this) {
            case SINGLE:
                return I18n.getText(EnumCaption.SINGLE);
            case MARRIED:
                return I18n.getText(EnumCaption.MARRIED);
            case SEPARATED:
                return I18n.getText(EnumCaption.SEPARATED);
            case DIVORCED:
                return I18n.getText(EnumCaption.DIVORCED);
            case WIDOWED:
                return I18n.getText(EnumCaption.WIDOWED);
        }
        return "";
    }
}
