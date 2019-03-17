public interface SellTicketAdapterTool {

    /**
     * 微信卖票
     */
    void wechatSellTicket(int number);

    /**
     * 售票机卖票
     */
    void machineSellTicket(int number);

    /**
     * 网络12306官网卖票
     */
    void netWork12306SellTicket(int number);
}
