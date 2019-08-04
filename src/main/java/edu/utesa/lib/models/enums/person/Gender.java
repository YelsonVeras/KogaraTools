package edu.utesa.lib.models.enums.person;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum Gender {
    MALE, FEMALE;

    @Override
    public String toString() {
        switch (this) {
            case MALE:
                return "Hombre";
            case FEMALE:
                return "Mujer";
        }
        return "";
    }
}
