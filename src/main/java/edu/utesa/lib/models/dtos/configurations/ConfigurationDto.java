package edu.utesa.lib.models.dtos.configurations;

import edu.utesa.lib.models.enums.ExamDifficulty;
import edu.utesa.lib.models.enums.GameMode;

public class ConfigurationDto {
    private GameMode mode;
    private Integer questions;
    private ExamDifficulty difficulty;

    public ConfigurationDto() {
    }

    public ConfigurationDto(GameMode mode, Integer questions, ExamDifficulty difficulty) {
        this.mode = mode;
        this.questions = questions;
        this.difficulty = difficulty;
    }

    public GameMode getMode() {
        return mode;
    }

    public void setMode(GameMode mode) {
        this.mode = mode;
    }

    public Integer getQuestions() {
        return questions;
    }

    public void setQuestions(Integer questions) {
        this.questions = questions;
    }

    public ExamDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(ExamDifficulty difficulty) {
        this.difficulty = difficulty;
    }
}
