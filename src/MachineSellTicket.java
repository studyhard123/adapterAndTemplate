public class MachineSellTicket implements TicketsWays {
    @Override
    public boolean support(TicketsWays tw) {
        return tw instanceof MachineSellTicket;
    }

    @Override
    public void sellTicktes(int number) {
        System.out.println("自动售票机售票");
    }
}
