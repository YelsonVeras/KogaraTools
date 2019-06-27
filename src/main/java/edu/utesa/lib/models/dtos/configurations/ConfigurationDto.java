package edu.utesa.lib.models.dtos.configurations;

public class ConfigurationDto {
    private String mode;
    private String questions;
    private String difficulty;

    //creo que para la dificultad y el modo se pueden crear enums

    public ConfigurationDto(String mode, String questions, String difficulty) {
        this.mode = mode;
        this.questions = questions;
        this.difficulty = difficulty;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
