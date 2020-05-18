package test19.handler;


public abstract class AbstractHandler {
    /**
     * 下个处理handler
     */
    private AbstractHandler nextHandler;


    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 利润处理
     *
     * @param profit
     * @return
     */
    public abstract double handleProfit(double profit);
}
