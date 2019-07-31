package edu.utesa.lib.panel;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ParticipantPanel {
    private String name;
    private boolean active;
    private List<String> balls;
    private int play;

    ParticipantPanel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<String> getBalls() {
        return balls;
    }

    public void addBall(String ball) {
        this.balls.add(ball);
    }

    public void cleanBall() {
        this.balls = new ArrayList<>();
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public void printBall() {
        System.out.print(name + " | ");
        balls.forEach(s -> System.out.print(s + "\t"));
        System.out.println();
    }
}
