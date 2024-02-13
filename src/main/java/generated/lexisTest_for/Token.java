package generated.lexisTest_for;
public record Token (TypeToken typeToken, String text) {
    @Override
    public String toString() {
        return typeToken.name();
    }
}