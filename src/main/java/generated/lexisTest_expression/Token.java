package generated.lexisTest_expression;
public record Token (TypeToken typeToken, String text) {
    @Override
    public String toString() {
        return typeToken.name();
    }
}