package edu.utesa.lib.models.enums.type;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum EnumMiscellaneousValueType {
    BOOLEAN, TEXT, NUMERIC, DATE, TIME;

    @Override
    public String toString() {
        switch (this) {
            case BOOLEAN:
                return I18n.getText(EnumCaption.BOOLEAN);
            case TEXT:
                return I18n.getText(EnumCaption.TEXT);
            case NUMERIC:
                return I18n.getText(EnumCaption.NUMERIC);
            case DATE:
                return I18n.getText(EnumCaption.DATE);
            case TIME:
                return I18n.getText(EnumCaption.TIME);
        }
        return "";
    }
}