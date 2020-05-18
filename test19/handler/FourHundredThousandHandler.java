package test19.handler;

import static test19.ProfitConstants.FOUR_HUNDRED_THOUSAND;
import static test19.ProfitConstants.TWO_HUNDRED_THOUSAND;

public class FourHundredThousandHandler extends AbstractHandler {
    @Override
    public double handleProfit(double profit) {
        if (profit > TWO_HUNDRED_THOUSAND && profit <= FOUR_HUNDRED_THOUSAND) {
            System.out.println("我是FourHundredThousandHandler");
            return (profit - TWO_HUNDRED_THOUSAND) * 0.05 + getNextHandler().handleProfit(TWO_HUNDRED_THOUSAND);
        }


        return this.getNextHandler().handleProfit(profit);
    }
}
