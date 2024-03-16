package Modules.Ticket;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.Message;


public class Main {
    private static final String channelIdByConfig = "1217585210506608771";
    private static boolean exist = false;
    private static TextChannel ch;

    public static void logIn(DiscordApi api) {

        ch = api.getChannelById(channelIdByConfig).get().asTextChannel().get();
        ch.getMessages(10).thenAccept(messages -> {
            for (Message message : messages) {
                if (!message.getComponents().isEmpty()) {
                    if (message.getComponents().get(0).asActionRow().get().getComponents().get(0).asButton().get().getCustomId().orElse("").equals("ticket")) {
                        exist = true;
                        break;
                    }
                }
            }
            if (!exist) {
                Setup.logIn(ch);
            }
            Runner.logIn(api, ch);
        });
    }
}