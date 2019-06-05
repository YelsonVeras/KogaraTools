package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.enums.type.PeriodType;

import java.util.Date;

public class EducationInformationDto {
    private ParticipantDto participantDto;
    private UniversityDto universityDto;
    private String enclosure;
    private CareerDto careerDto;
    private PeriodType periodType;
    private Long periodQuantity;
    private Boolean interruption;
    private String interruptionCause;
    private Date initialTime;
    private Long approvedSubjectsQuantity;
    private Long actualPeriodSubjectsQuantity;
    private Double academicIndex;
    private Date graduationTime;
    private Boolean careerChange;
    private String careerChangeCause;
    private Boolean universityChange;
    private String universityChangeCause;
}