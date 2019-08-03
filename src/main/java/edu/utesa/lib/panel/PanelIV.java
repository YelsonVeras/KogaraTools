package edu.utesa.lib.panel;

import java.util.ArrayList;
import java.util.List;

public class PanelIV {
    private static List<ParticipantPanel> participants = Generator.generalParticipant(50);
    private static List<ParticipantPanel> consursantes = new ArrayList<>();
    private static Box box;
    private static int intent = 3;

    public static void main(String[] args) {
        for (ParticipantPanel participant : participants) {
            setBall(participant);
            evaluate(participant);
            if (consursantes.size() >= 20) break;
        }
    }

    private static void setBall(ParticipantPanel participant) {
        box = new Box();
        participant.cleanBall();
        for (int i = 0; i < intent; i++) {
            participant.addBall(box.get().getName());
        }
    }

    private static void evaluate(ParticipantPanel participant) {
        if (hasPurple(participant)) {
            participant.setActive(true);
            consursantes.add(participant);
            participant.printBall();
        } else if (hasPurple(participant) && hasRed(participant) && hasBlue(participant)) {
            participant.setActive(true);
            consursantes.add(participant);
            participant.printBall();
        }
    }

    private static boolean hasWhite(ParticipantPanel participant) {
        return participant.getBalls().stream().anyMatch(s -> s.equals("BLANCO"));
    }

    private static boolean hasBlack(ParticipantPanel participant) {
        return participant.getBalls().stream().anyMatch(s -> s.equals("NEGRO"));
    }

    private static boolean hasRed(ParticipantPanel participant) {
        return participant.getBalls().stream().anyMatch(s -> s.equals("ROJO"));
    }

    private static boolean hasBlue(ParticipantPanel participant) {
        return participant.getBalls().stream().anyMatch(s -> s.equals("AZUL"));
    }

    private static boolean hasPurple(ParticipantPanel participant) {
        return participant.getBalls().stream().anyMatch(s -> s.equals("MORADO"));
    }
}
