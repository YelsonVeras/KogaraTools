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

    public ParticipantDto getParticipantDto() {
        return participantDto;
    }

    public void setParticipantDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }

    public UniversityDto getUniversityDto() {
        return universityDto;
    }

    public void setUniversityDto(UniversityDto universityDto) {
        this.universityDto = universityDto;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

    public CareerDto getCareerDto() {
        return careerDto;
    }

    public void setCareerDto(CareerDto careerDto) {
        this.careerDto = careerDto;
    }

    public PeriodType getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
    }

    public Long getPeriodQuantity() {
        return periodQuantity;
    }

    public void setPeriodQuantity(Long periodQuantity) {
        this.periodQuantity = periodQuantity;
    }

    public Boolean getInterruption() {
        return interruption;
    }

    public void setInterruption(Boolean interruption) {
        this.interruption = interruption;
    }

    public String getInterruptionCause() {
        return interruptionCause;
    }

    public void setInterruptionCause(String interruptionCause) {
        this.interruptionCause = interruptionCause;
    }

    public Date getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(Date initialTime) {
        this.initialTime = initialTime;
    }

    public Long getApprovedSubjectsQuantity() {
        return approvedSubjectsQuantity;
    }

    public void setApprovedSubjectsQuantity(Long approvedSubjectsQuantity) {
        this.approvedSubjectsQuantity = approvedSubjectsQuantity;
    }

    public Long getActualPeriodSubjectsQuantity() {
        return actualPeriodSubjectsQuantity;
    }

    public void setActualPeriodSubjectsQuantity(Long actualPeriodSubjectsQuantity) {
        this.actualPeriodSubjectsQuantity = actualPeriodSubjectsQuantity;
    }

    public Double getAcademicIndex() {
        return academicIndex;
    }

    public void setAcademicIndex(Double academicIndex) {
        this.academicIndex = academicIndex;
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public Boolean getCareerChange() {
        return careerChange;
    }

    public void setCareerChange(Boolean careerChange) {
        this.careerChange = careerChange;
    }

    public String getCareerChangeCause() {
        return careerChangeCause;
    }

    public void setCareerChangeCause(String careerChangeCause) {
        this.careerChangeCause = careerChangeCause;
    }

    public Boolean getUniversityChange() {
        return universityChange;
    }

    public void setUniversityChange(Boolean universityChange) {
        this.universityChange = universityChange;
    }

    public String getUniversityChangeCause() {
        return universityChangeCause;
    }

    public void setUniversityChangeCause(String universityChangeCause) {
        this.universityChangeCause = universityChangeCause;
    }
}