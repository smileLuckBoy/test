package test19.handler;

import static test19.ProfitConstants.FOUR_HUNDRED_THOUSAND;
import static test19.ProfitConstants.SIX_HUNDRED_THOUSAND;

public class SixHundredThousandHandler extends AbstractHandler {
    @Override
    public double handleProfit(double profit) {
        if (profit > FOUR_HUNDRED_THOUSAND && profit <= SIX_HUNDRED_THOUSAND) {
            return (profit - FOUR_HUNDRED_THOUSAND) * 0.03 + getNextHandler().handleProfit(FOUR_HUNDRED_THOUSAND);
        }


        return this.getNextHandler().handleProfit(profit);
    }
}
