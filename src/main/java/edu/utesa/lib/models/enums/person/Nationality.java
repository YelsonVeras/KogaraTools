package edu.utesa.lib.models.enums.person;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum Nationality {
    DOMINICAN, HAITIAN, PUERTO_RICAN, COLOMBIAN;

    @Override
    public String toString() {
        switch (this) {
            case DOMINICAN:
                return I18n.getText(EnumCaption.DOMINICAN);
            case HAITIAN:
                return I18n.getText(EnumCaption.HAITIAN);
            case PUERTO_RICAN:
                return I18n.getText(EnumCaption.PUERTO_RICAN);
            case COLOMBIAN:
                return I18n.getText(EnumCaption.COLOMBIAN);
        }
        return "";
    }
}
