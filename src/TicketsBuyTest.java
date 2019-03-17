public class TicketsBuyTest {

    public static void main(String[] args) {
        BuyTicketsAdapter bta = new BuyTicketsAdapter();
        bta.ticketByperson(1);//人工售票
        bta.machineSellTicket(1);//自动售票机售票
        bta.netWork12306SellTicket(1);//12306网络售票
        bta.wechatSellTicket(1);// 微信售票
    }
}
