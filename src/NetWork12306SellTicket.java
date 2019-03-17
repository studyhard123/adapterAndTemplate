public class NetWork12306SellTicket implements  TicketsWays {
    @Override
    public boolean support(TicketsWays tw) {
        return tw instanceof  NetWork12306SellTicket;
    }

    @Override
    public void sellTicktes(int number) {
        System.out.println("12306网络售票");
    }
}
