package test19.handler;

import static test19.ProfitConstants.ONE_HUNDRED_THOUSAND;
import static test19.ProfitConstants.TWO_HUNDRED_THOUSAND;

public class TwoHundredThousandHandler extends AbstractHandler {
    @Override
    public double handleProfit(double profit) {
        if (profit > ONE_HUNDRED_THOUSAND && profit <= TWO_HUNDRED_THOUSAND) {
            return (profit - ONE_HUNDRED_THOUSAND) * 0.075 + getNextHandler().handleProfit(ONE_HUNDRED_THOUSAND);
        }

        return this.getNextHandler().handleProfit(profit);
    }
}
