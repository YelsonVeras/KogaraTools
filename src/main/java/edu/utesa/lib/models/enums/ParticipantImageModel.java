package edu.utesa.lib.models.enums;

public enum ParticipantImageModel {
    ADDRESS_RIGHT,
    ADDRESS_WRONG,
    APPOINTMENT_RIGHT,
    APPOINTMENT_WRONG,
    CONTACT_RIGHT,
    CONTACT_WRONG,
    EDUCATION_RIGHT,
    EDUCATION_WRONG,
    EXPERIENCE_RIGHT,
    EXPERIENCE_WRONG,
    FAMILY_RIGHT,
    FAMILY_WRONG,
    GUARANTEE_RIGHT,
    GUARANTEE_WRONG,
    LANGUAGE_RIGHT,
    LANGUAGE_WRONG,
    LOGIN,
    LOGO,
    MISCELLANEOUS_RIGHT,
    MISCELLANEOUS_WRONG,
    PASSPORT_RIGHT,
    PASSPORT_WRONG,
    PAYMENT_RIGHT,
    PAYMENT_WRONG,
    PERSON_RIGHT,
    PERSON_WRONG,
    VISA_RIGHT,
    VISA_WRONG,
    PROGRAM_RIGHT,
    PROGRAM_WRONG;

    private static final String sADDRESS_RIGHT = "ADDRESS_RIGHT";
    private static final String sADDRESS_WRONG = "ADDRESS_WRONG";
    private static final String sAPPOINTMENT_RIGHT = "APPOINTMENT_RIGHT";
    private static final String sAPPOINTMENT_WRONG = "APPOINTMENT_WRONG";
    private static final String sCONTACT_RIGHT = "CONTACT_RIGHT";
    private static final String sCONTACT_WRONG = "CONTACT_WRONG";
    private static final String sEDUCATION_RIGHT = "EDUCATION_RIGHT";
    private static final String sEDUCATION_WRONG = "EDUCATION_WRONG";
    private static final String sEXPERIENCE_RIGHT = "EXPERIENCE_RIGHT";
    private static final String sEXPERIENCE_WRONG = "EXPERIENCE_WRONG";
    private static final String sFAMILY_RIGHT = "FAMILY_RIGHT";
    private static final String sFAMILY_WRONG = "FAMILY_WRONG";
    private static final String sGUARANTEE_RIGHT = "GUARANTEE_RIGHT";
    private static final String sGUARANTEE_WRONG = "GUARANTEE_WRONG";
    private static final String sLANGUAGE_RIGHT = "LANGUAGE_RIGHT";
    private static final String sLANGUAGE_WRONG = "LANGUAGE_WRONG";
    private static final String sLOGIN = "LOGIN";
    private static final String sLOGO = "LOGO";
    private static final String sMISCELLANEOUS_RIGHT = "MISCELLANEOUS_RIGHT";
    private static final String sMISCELLANEOUS_WRONG = "MISCELLANEOUS_WRONG";
    private static final String sPASSPORT_RIGHT = "PASSPORT_RIGHT";
    private static final String sPASSPORT_WRONG = "PASSPORT_WRONG";
    private static final String sPAYMENT_RIGHT = "PAYMENT_RIGHT";
    private static final String sPAYMENT_WRONG = "PAYMENT_WRONG";
    private static final String sPERSON_RIGHT = "PERSON_RIGHT";
    private static final String sPERSON_WRONG = "PERSON_WRONG";
    private static final String sVISA_RIGHT = "VISA_RIGHT";
    private static final String sVISA_WRONG = "VISA_WRONG";
    private static final String sPROGRAM_RIGHT = "PROGRAM_RIGHT";
    private static final String sPROGRAM_WRONG = "PROGRAM_WRONG";

    @Override
    public String toString() {
        switch (this) {
            case ADDRESS_RIGHT:
                return sADDRESS_RIGHT;
            case ADDRESS_WRONG:
                return sADDRESS_WRONG;
            case APPOINTMENT_RIGHT:
                return sAPPOINTMENT_RIGHT;
            case APPOINTMENT_WRONG:
                return sAPPOINTMENT_WRONG;
            case CONTACT_RIGHT:
                return sCONTACT_RIGHT;
            case CONTACT_WRONG:
                return sCONTACT_WRONG;
            case EDUCATION_RIGHT:
                return sEDUCATION_RIGHT;
            case EDUCATION_WRONG:
                return sEDUCATION_WRONG;
            case EXPERIENCE_RIGHT:
                return sEXPERIENCE_RIGHT;
            case EXPERIENCE_WRONG:
                return sEXPERIENCE_WRONG;
            case FAMILY_RIGHT:
                return sFAMILY_RIGHT;
            case FAMILY_WRONG:
                return sFAMILY_WRONG;
            case GUARANTEE_RIGHT:
                return sGUARANTEE_RIGHT;
            case GUARANTEE_WRONG:
                return sGUARANTEE_WRONG;
            case LANGUAGE_RIGHT:
                return sLANGUAGE_RIGHT;
            case LANGUAGE_WRONG:
                return sLANGUAGE_WRONG;
            case LOGIN:
                return sLOGIN;
            case LOGO:
                return sLOGO;
            case MISCELLANEOUS_RIGHT:
                return sMISCELLANEOUS_RIGHT;
            case MISCELLANEOUS_WRONG:
                return sMISCELLANEOUS_WRONG;
            case PASSPORT_RIGHT:
                return sPASSPORT_RIGHT;
            case PASSPORT_WRONG:
                return sPASSPORT_WRONG;
            case PAYMENT_RIGHT:
                return sPAYMENT_RIGHT;
            case PAYMENT_WRONG:
                return sPAYMENT_WRONG;
            case PERSON_RIGHT:
                return sPERSON_RIGHT;
            case PERSON_WRONG:
                return sPERSON_WRONG;
            case VISA_RIGHT:
                return sVISA_RIGHT;
            case VISA_WRONG:
                return sVISA_WRONG;
            case PROGRAM_RIGHT:
                return sPROGRAM_RIGHT;
            case PROGRAM_WRONG:
                return sPROGRAM_WRONG;
        }
        return "";
    }
}