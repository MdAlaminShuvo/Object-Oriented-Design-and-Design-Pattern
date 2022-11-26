public class ClientCode {
    public static void main(String[] args) {
        boolean isAuthorized;
        AbstractAuthorizer authorizerChain = new WithDrawChain().getAuthorizerChain();
        Account account = new Account("Alamin", 100000);

        Integer amount = 10000;
        isAuthorized = authorizerChain.authorize(account,amount);
        if(isAuthorized) {
            account.withdraw(amount);
        }
        else {
            System.out.println("Withdrawal failed");
        }
    }
}
