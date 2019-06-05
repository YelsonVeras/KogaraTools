package edu.utesa.lib.models.dtos.summerwork;

import edu.utesa.lib.models.dtos.company.CompanyDto;
import edu.utesa.lib.models.dtos.security.UserDto;
import edu.utesa.lib.models.enums.Status.AppointmentStatus;

import java.util.Date;

public class AppointmentDto {
    private UserDto sender;
    private CompanyDto companyDto;
    private EventTypeDto event;
    private boolean reminder;
    private Date date;
    private String description;
    private AppointmentStatus status = AppointmentStatus.PENDING;
}