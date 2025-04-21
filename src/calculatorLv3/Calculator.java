package calculatorLv3;

public class Calculator {

    public enum Operation {
        SUM{public double math(double x, double y) {return x + y;}
        },
        MINUS{public double math(double x, double y) {return x - y;}
        },
        MULTI{public double math(double x, double y) {return x * y;}
        },
        DIVDIVE{public double math(double x, double y) {return x / y;}
        };

        // 이거 없으면 에러남
        public abstract double math(double x, double y);

    }

    private Operation type;

    public Calculator(Operation type) {
        this.type = type;
    }

    public double getType(double x, double y) {
        return type.math(x, y);
    }
}
