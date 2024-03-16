package Modules;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    static DiscordApi api;

    public static void logIn() {
        DiscordApi api = new DiscordApiBuilder()
                .setToken()
                .setAllIntents()
                .login().join();
        api.setMessageCacheSize(10, 60*60);
        System.out.println("Api logged in");
             Modules.Ticket.Main.logIn(api);
            Modules.Shop.Main.logIn(api);





    }

    public static DiscordApi api() {
        return api;
    }

    public static void logOut() throws InterruptedException {
        if (api != null) {
            api.disconnect();
            Thread.sleep(1000);
            System.exit(0);
            System.out.println("Api logged out");
        }
    }
}
