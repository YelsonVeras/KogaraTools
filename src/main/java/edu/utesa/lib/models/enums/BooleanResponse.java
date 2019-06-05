package edu.utesa.lib.models.enums;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum BooleanResponse {
    YES, NO;

    @Override
    public String toString() {
        switch (this) {
            case YES:
                return I18n.getText(EnumCaption.YES);
            case NO:
                return I18n.getText(EnumCaption.NO);
        }
        return "";
    }
}