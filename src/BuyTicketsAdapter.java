public class BuyTicketsAdapter extends ArtificialTicket implements SellTicketAdapterTool {

    @Override
    public void wechatSellTicket(int number) {
        publicSellFactory(new WechatSellTicketAdapter(), number);
    }

    @Override
    public void machineSellTicket(int number) {
        publicSellFactory(new MachineSellTicket(), number);
    }

    @Override
    public void netWork12306SellTicket(int number) {
       publicSellFactory(new NetWork12306SellTicket(), number);
    }

    private void publicSellFactory(TicketsWays tw , int number){
        if(tw.support(tw)){
            tw.sellTicktes(number);
        }else{
            throw new RuntimeException("请选择合适的售票方式进行购票！");
        }
    }

}
