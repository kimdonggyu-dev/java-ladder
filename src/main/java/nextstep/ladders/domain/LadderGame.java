package nextstep.ladders.domain;

import nextstep.ladders.exception.DifferentCountException;

import java.util.Arrays;

public class LadderGame {

    private static final String REGEX_COMMA = ",";

    private final Participants participants;
    private final ExecutionResults executionResults;

    public LadderGame(final String participantsText, final String executionResultText) {
        checkEqualsCount(participantsText, executionResultText);
        this.participants = new Participants(participantsText);
        this.executionResults = new ExecutionResults(executionResultText);
    }

    private void checkEqualsCount(final String participantsText, final String executionResultText) {

        long participantsCount = Arrays.stream(participantsText.split(REGEX_COMMA)).count();
        long executionResultCount = Arrays.stream(executionResultText.split(REGEX_COMMA)).count();

        if (participantsCount != executionResultCount) {
            throw new DifferentCountException();
        }
    }

    public Participants getParticipants() {
        return participants;
    }

    public ExecutionResults getExecutionResults() {
        return executionResults;
    }
}