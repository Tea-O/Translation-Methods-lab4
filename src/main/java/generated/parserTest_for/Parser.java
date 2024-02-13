package generated.parserTest_for;

import generated.lexisTest_for.LexicalAnalyzer;
import generated.lexisTest_for.Token;
import generated.lexisTest_for.TypeToken;

public class Parser {
    private final LexicalAnalyzer tokens;
    private Token token;

    private void nextToken() {
        tokens.nextToken();
        token = tokens.getToken();
    }

    public Parser(LexicalAnalyzer tokens) {
        this.tokens = tokens;
        nextToken();
    }

    public An an() {
        An res = new An("an");
        switch(token.typeToken()) {
            case POINT -> {
                if (token.typeToken() != TypeToken.POINT) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String POINT0 = token.text();
                res.addChild(token.text());
                nextToken();
                An an1 = an();
                res.addChild(an1);
            }
            case WORD -> {
                if (token.typeToken() != TypeToken.WORD) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String WORD0 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public A a() {
        A res = new A("a");
        switch(token.typeToken()) {
            case FOR -> {
                if (token.typeToken() != TypeToken.FOR) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String FOR0 = token.text();
                res.addChild(token.text());
                nextToken();
                An an1 = an();
                res.addChild(an1);
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public S s() {
        S res = new S("s");
        switch(token.typeToken()) {
            case FOR -> {
                if (token.typeToken() != TypeToken.FOR) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String FOR0 = token.text();
                res.addChild(token.text());
                nextToken();
                if (token.typeToken() != TypeToken.WORD) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String WORD1 = token.text();
                res.addChild(token.text());
                nextToken();
                if (token.typeToken() != TypeToken.OB) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String OB2 = token.text();
                res.addChild(token.text());
                nextToken();
                As as3 = as();
                res.addChild(as3);
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public Ab ab() {
        Ab res = new Ab("ab");
        switch(token.typeToken()) {
            case FOR -> {
                A a0 = a();
                res.addChild(a0);
                Ac ac1 = ac();
                res.addChild(ac1);
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public Ac ac() {
        Ac res = new Ac("ac");
        switch(token.typeToken()) {
            case CB -> {
                if (token.typeToken() != TypeToken.CB) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String CB0 = token.text();
                res.addChild(token.text());
                nextToken();
                if (token.typeToken() != TypeToken.SEM) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String SEM1 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            case ZAP -> {
                if (token.typeToken() != TypeToken.ZAP) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String ZAP0 = token.text();
                res.addChild(token.text());
                nextToken();
                Ab ab1 = ab();
                res.addChild(ab1);
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }

    public As as() {
        As res = new As("as");
        switch(token.typeToken()) {
            case FOR -> {
                Ab ab0 = ab();
                res.addChild(ab0);
            }
            case CB -> {
                if (token.typeToken() != TypeToken.CB) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String CB0 = token.text();
                res.addChild(token.text());
                nextToken();
                if (token.typeToken() != TypeToken.SEM) {
                    throw new ParseException("No valid token: " + token.text());
                }
                String SEM1 = token.text();
                res.addChild(token.text());
                nextToken();
            }
            default ->
                throw new ParseException("No valid token: " + token.text());
        }

        return res;
    }


    public static class An extends Tree {
        public An(String node) {
            super(node);
        }
    }

    public static class A extends Tree {
        public A(String node) {
            super(node);
        }
    }

    public static class S extends Tree {
        public S(String node) {
            super(node);
        }
    }

    public static class Ab extends Tree {
        public Ab(String node) {
            super(node);
        }
    }

    public static class Ac extends Tree {
        public Ac(String node) {
            super(node);
        }
    }

    public static class As extends Tree {
        public As(String node) {
            super(node);
        }
    }

}
