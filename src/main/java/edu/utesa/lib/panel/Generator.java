package edu.utesa.lib.panel;

import java.util.ArrayList;
import java.util.List;

class Generator {
    static List<ParticipantPanel> generalParticipant(int num) {
        List<ParticipantPanel> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(new ParticipantPanel("Participant: " + (i + 1)));
        }
        return result;
    }
}
