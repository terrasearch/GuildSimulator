package at.englert.bertram.guildsimulator.control.game;

public enum ExitCodes {
    SUCCESS(0),
    UNDEFINED_ERROR(1);

    private final int codeValue;

    ExitCodes(final int codeValue) {
        this.codeValue = codeValue;
    }

    public int getCodeValue() {
        return codeValue;
    }
}
