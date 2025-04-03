package enums;

public enum MyEnum {
    SUM('+'), EXTRACT('-'), MULTIPLY('*'), DIVIDE('/'), UNKNOWN();

    private char c;
    MyEnum() { // unknown uses this constructor

    }

    MyEnum(char c) {
        this.c = c;
    }

    public double op(double a, double b) {
        if (c == '+') {
            return a+b;
        } else if (c=='-') {
            return a-b;
        } else if (c=='*') {
            return a*b;
        } else if (c=='/') {
            return a/b;
        }
        return -1;
    }

    public static MyEnum operation(char c) {
//        if (c == '+') {
//            return SUM;
//        } else if (c=='-') {
//            return EXTRACT;
//        } else if (c=='*') {
//            return MULTIPLY;
//        } else if (c=='/') {
//            return DIVIDE;
//        }
//        return UNKNOWN;
        return c == '+' ? SUM : c == '-' ? EXTRACT : c == '*' ? MULTIPLY : c == '/' ? DIVIDE : UNKNOWN;
    }
}


