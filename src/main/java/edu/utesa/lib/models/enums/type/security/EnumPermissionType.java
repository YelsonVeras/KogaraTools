package edu.utesa.lib.models.enums.type.security;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum EnumPermissionType {
    NORMAL, ESPECIAL;

    @Override
    public String toString() {
        switch (this) {
            case NORMAL:
                return I18n.getText(EnumCaption.NORMAL);
            case ESPECIAL:
                return I18n.getText(EnumCaption.SPECIAL);
        }
        return "";
    }
}
