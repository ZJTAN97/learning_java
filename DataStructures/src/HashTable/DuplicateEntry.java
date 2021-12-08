package HashTable;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEntry {

    private static Map<String, Boolean> voters = new HashMap<>();

    private static void checkVoter(String name) {        
        if(voters.containsKey(name)) {
            System.out.println("Already voted");
        } else {
            voters.put(name, true);
            System.out.println("Just voted.");
        }

    }

    public static void main(String[] args) {
        checkVoter("Docker");
        checkVoter("Docker");
        checkVoter("Docker");
        checkVoter("Kubernetes");
    }
}
