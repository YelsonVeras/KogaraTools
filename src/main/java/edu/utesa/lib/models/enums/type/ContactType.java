package edu.utesa.lib.models.enums.type;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum ContactType {
    WHATS_APP, EMERGENCY, MOBIL, WORK, HOME, TELEGRAM;

    @Override
    public String toString() {
        switch (this) {
            case MOBIL:
                return I18n.getText(EnumCaption.MOBIL);
            case EMERGENCY:
                return I18n.getText(EnumCaption.EMERGENCY);
            case WORK:
                return I18n.getText(EnumCaption.WORK);
            case HOME:
                return I18n.getText(EnumCaption.HOME);
            case WHATS_APP:
                return I18n.getText(EnumCaption.WHATS_APP);
            case TELEGRAM:
                return I18n.getText(EnumCaption.TELEGRAM);
        }
        return "";
    }
}
