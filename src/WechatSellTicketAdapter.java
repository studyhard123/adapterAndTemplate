public class WechatSellTicketAdapter implements TicketsWays {
    @Override
    public boolean support(TicketsWays tw) {
        return tw instanceof  WechatSellTicketAdapter;
    }

    @Override
    public void sellTicktes(int number) {
        System.out.println("微信售票");
    }
}
