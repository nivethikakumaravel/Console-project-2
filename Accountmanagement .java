import java.util.HashMap;
public class AccountModule {
    private HashMap<Integer, String> accounts = new HashMap<>();
    public void createAccount(int id, String name) {
        accounts.put(id, name);
        System.out.println("Account created successfully");
    }
    public void searchAccount(int id) {
        String name = accounts.get(id);
        if (name != null)
            System.out.println("Account Holder: " + name);
        else
            System.out.println("Account not found");
    }
    public void deleteAccount(int id) {
        accounts.remove(id);
        System.out.println("Account deleted successfully");
    }
}
