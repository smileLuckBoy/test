package test19.handler;

import static test19.ProfitConstants.MILLION;


public class MillionPlusHandler extends AbstractHandler {
    @Override
    public double handleProfit(double profit) {
        if (profit > MILLION) {
            System.out.println("我是MillionPlusHandler");
            return (profit - MILLION) * 0.01 + getNextHandler().handleProfit(MILLION);
        }


        return this.getNextHandler().handleProfit(profit);
    }
}
