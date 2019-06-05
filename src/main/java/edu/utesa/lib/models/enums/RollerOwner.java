package edu.utesa.lib.models.enums;

import edu.utesa.lib.utils.I18n;
import edu.utesa.lib.utils.caption.EnumCaption;

 public enum RollerOwner {
    SUMMER_WORK, INVENTORY, GARDEN, CONDOMINIUM, PARTICIPANT, OTHER;

    @Override
    public String toString() {
        switch (this) {
            case SUMMER_WORK:
                return I18n.getText(EnumCaption.SUMMER_WORK);
            case INVENTORY:
                return I18n.getText(EnumCaption.INVENTORY);
            case GARDEN:
                return I18n.getText(EnumCaption.GARDEN);
            case CONDOMINIUM:
                return I18n.getText(EnumCaption.CONDOMINIUM);
            case PARTICIPANT:
                return I18n.getText(EnumCaption.PARTICIPANT);
            case OTHER:
                return I18n.getText(EnumCaption.OTHER);
        }
        return "";
    }
}
