package test19.handler;

import static test19.ProfitConstants.MILLION;
import static test19.ProfitConstants.SIX_HUNDRED_THOUSAND;

public class MillionHandler extends AbstractHandler {
    @Override
    public double handleProfit(double profit) {
        if (profit > SIX_HUNDRED_THOUSAND && profit <= MILLION) {
            System.out.println("我是MillionPlusHandler");
            return (profit - SIX_HUNDRED_THOUSAND) * 0.015 + getNextHandler().handleProfit(SIX_HUNDRED_THOUSAND);
        }


        return this.getNextHandler().handleProfit(profit);
    }
}
