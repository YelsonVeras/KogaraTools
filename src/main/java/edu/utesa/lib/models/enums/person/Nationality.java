package edu.utesa.lib.models.enums.person;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum Nationality {
    DOMINICAN, HAITIAN, PUERTO_RICAN, COLOMBIAN;

    @Override
    public String toString() {
        switch (this) {
            case DOMINICAN:
                return "Dominicano";
            case HAITIAN:
                return "Haitiano";
            case PUERTO_RICAN:
                return "Puertoriqueño";
            case COLOMBIAN:
                return "Colombiano";
        }
        return "";
    }
}
