package edu.utesa.lib.models.dtos.audit;

import java.util.Date;

public class LogInAlertDto {
    private Long userId;
    private Date loginDate;

    public LogInAlertDto(Long userId, Date loginDate) {
        this.userId = userId;
        this.loginDate = loginDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}
