package Modules.Ticket;

import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.component.ActionRow;
import org.javacord.api.entity.message.component.Button;
import org.javacord.api.entity.message.embed.EmbedBuilder;

import java.awt.*;

public class Setup {
    public static void logIn (TextChannel ch) {
        new MessageBuilder().addEmbed(new EmbedBuilder()
                .setTitle("Оформление заказа")
                .setDescription("Оформить заказ по кнопке ниже :envelope_with_arrow:")
                .setColor(Color.decode("#11aeb8")))
                .addComponents(ActionRow.of(
                Button.danger("ticket", "Оформить", "📩")
        )).send(ch);
    }
}
