package at.olb.Project;

public class Calculator implements Adder, Subtractor{
    @Override
    public long subtract(long... operands) {
        long result = operands[0];

        for (int i = 1; i < operands.length; i++) {
            result -= operands[i];
        }

        return result;
    }

    @Override
    public long add(long... operands) {
        long result = 0;

        for (long operand : operands) {
            result += operand;
        }

        return result;
    }
}
