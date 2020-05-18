package test19.handler;

public class OneHundredThousandHandler extends AbstractHandler {

    @Override
    public double handleProfit(double profit) {
        return profit * 0.1;
    }
}
