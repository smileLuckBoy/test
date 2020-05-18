package test19;

import test19.handler.*;

public class ProfitManager {

    static MillionPlusHandler handler;

    static {
        handler = new MillionPlusHandler();
        MillionHandler millionHandler = new MillionHandler();
        SixHundredThousandHandler sixHundredThousandHandler = new SixHundredThousandHandler();
        FourHundredThousandHandler fourHundredThousandHandler = new FourHundredThousandHandler();
        TwoHundredThousandHandler twoHundredThousandHandler = new TwoHundredThousandHandler();
        OneHundredThousandHandler oneHundredThousandHandler = new OneHundredThousandHandler();

        handler.setNextHandler(millionHandler);
        millionHandler.setNextHandler(sixHundredThousandHandler);
        sixHundredThousandHandler.setNextHandler(fourHundredThousandHandler);
        fourHundredThousandHandler.setNextHandler(twoHundredThousandHandler);
        twoHundredThousandHandler.setNextHandler(oneHundredThousandHandler);
    }

    public static double handleProfit(double profit) {
        if (profit <= 0) return 0;
        return handler.handleProfit(profit);
    }
}
