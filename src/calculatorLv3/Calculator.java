package calculatorLv3;

public class Calculator {

    public enum Operation {
        SUM("+") {
            public double math(double x, double y) {
                return x + y;
            }
        },
        MINUS("*") {
            public double math(double x, double y) {
                return x - y;
            }
        },
        MULTI("-") {
            public double math(double x, double y) {
                return x * y;
            }
        },
        DIVIDE("/") {
            public double math(double x, double y) {
                return x / y;
            }
        };
        // 부호 저장
        private final String symbol;


        public abstract double math(double x, double y);

        Operation(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        public static Operation selectSymbol(String symbol) {
            for (Operation op : Operation.values()) {
                if (op.getSymbol().equals(symbol)) {
                    return op;
                }
            }
            throw new IllegalArgumentException("잘못입력했습니다. : " + symbol);
        }

    }

}
