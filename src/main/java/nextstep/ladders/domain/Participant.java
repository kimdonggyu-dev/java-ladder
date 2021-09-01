package nextstep.ladders.domain;

import nextstep.ladders.exception.NameLengthInvalidException;

import java.util.Objects;

public class Participant {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    private Participant(final String name) {
        checkMaxNameLength(name);
        this.name = name;
    }

    public static Participant valueOf(final String name) {
        return new Participant(name);
    }

    private void checkMaxNameLength(final String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new NameLengthInvalidException();
        }
    }

    public String value() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
