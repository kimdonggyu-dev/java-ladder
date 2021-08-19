package nextstep.ladders;

import nextstep.ladders.controller.LadderController;
import nextstep.ladders.domain.Ladder;
import nextstep.ladders.domain.Participants;
import nextstep.ladders.views.ConsoleInputView;
import nextstep.ladders.views.ConsoleOutputView;

import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ConsoleInputView inputView = new ConsoleInputView(scanner);
        ConsoleOutputView outputView = new ConsoleOutputView();
        LadderController ladderController = new LadderController();

        String participantsText = inputView.enterParticipants();
        String maxLadderHeightText = inputView.enterMaxLadderHeight();

        Participants participants = ladderController.register(participantsText);
        Ladder ladder = ladderController.start(participants.count(), maxLadderHeightText);

        outputView.print(participants, ladder);

        scanner.close();
    }
}
