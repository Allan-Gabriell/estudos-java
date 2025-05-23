package GenericsSetMap;

import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99711133"); // Não permite repetição de chave

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); // Quando o elemento não existe retorna Null
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COKKIES: ");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
