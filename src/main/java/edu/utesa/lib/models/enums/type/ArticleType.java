package edu.utesa.lib.models.enums.type;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

public enum ArticleType {
    PRODUCT, MATERIAL, SERVICE;

    @Override
    public String toString() {
        switch (this) {
            case PRODUCT:
                return I18n.getText(EnumCaption.PRODUCT);
            case MATERIAL:
                return I18n.getText(EnumCaption.MATERIAL);
            case SERVICE:
                return I18n.getText(EnumCaption.SERVICE);
        }
        return "";
    }
}
