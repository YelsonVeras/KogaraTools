package edu.utesa.lib.models.dtos.configurations;

import edu.utesa.lib.models.enums.GameDifficulty;
import edu.utesa.lib.models.enums.GameMode;

public class ConfigurationDto {
    private GameMode mode;
    private Integer questions;
    private GameDifficulty difficulty;

    public ConfigurationDto(GameMode mode, Integer questions, GameDifficulty difficulty) {
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

    public GameDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(GameDifficulty difficulty) {
        this.difficulty = difficulty;
    }
}
