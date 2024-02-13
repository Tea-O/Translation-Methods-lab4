package generated.lexisTest_for;

import java.util.regex.Pattern;

public enum TypeToken {
    END("\\$"),
    FOR("int|double|float|void"),
    WORD("[a-zA-Z]+"),
    NUM("[0-9]+"),

    OB("\\("),
    CB("\\)"),
    SEM(";"),
    POINT("\\*"),
    ASSIGN("="),
    ZAP("\\,"),
    EPS("");
    private final Pattern pattern;

    TypeToken (String regexp) {
        this.pattern = Pattern.compile(regexp);
    }

    public boolean match(String text) {
        return pattern.matcher(text).matches();
    }
}
