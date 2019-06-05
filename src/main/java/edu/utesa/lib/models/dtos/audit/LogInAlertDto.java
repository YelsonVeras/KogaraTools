package edu.utesa.lib.models.dtos.audit;

import java.util.Date;

public class LogInAlertDto {
    private Long userId;
    private Date loginDate;

    public LogInAlertDto(Long userId, Date loginDate) {
        this.userId = userId;
        this.loginDate = loginDate;
    }
}
