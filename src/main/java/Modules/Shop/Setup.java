package Modules.Shop;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.emoji.CustomEmoji;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.component.ActionRow;
import org.javacord.api.entity.message.component.Button;
import org.javacord.api.entity.message.embed.EmbedBuilder;

import java.awt.*;


public class Setup {
    public static void logIn(TextChannel ch, DiscordApi api) {
        CustomEmoji fort = api.getCustomEmojiById(1214622080247795823L).get();
        CustomEmoji dis = api.getCustomEmojiById(1217150390278164530L).get();
        CustomEmoji tg = api.getCustomEmojiById(1216145786287558676L).get();
        CustomEmoji spot = api.getCustomEmojiById(1216496726421278873L).get();
        new MessageBuilder().addEmbed(new EmbedBuilder()
                .setAuthor("CIRNIK Shop", "", Setup.class.getClassLoader().getResourceAsStream("Images/serv.webp"))
                .setTitle("Приветствуем в магазине CIRNIK Shop").setDescription("Выберите интересующую вас категорию и воспользуйтесь\n **интерактивной кнопкой**, чтобы ознакомиться с информацией\n о товарах.")
                .setColor(Color.decode("#11aeb8"))
                .addField("", "")
                .addField("", "")
                .addField("", "Ниже вы можете ознакомиться с кратким описанием к каждой\n категории." +
                        "\n>>> <:fortnite:1214622080247795823> ・ **[Fortnite](https://www.fortnite.com/)** - V-bucks и наборы для Fortnite." +
                        "\n<:discord:1217150390278164530> ・ **[Discord](https://discord.com/)** - услуги и товары связанные с мессенджером." +
                        "\n<:tg:1216145786287558676> ・ **[Telegram](https://telegram.org/)** - подписка премиум для Telegram." +
                        "\n<:spotify:1216496726421278873> ・ **[Spotify](https://open.spotify.com/)** - премиум подписки для Spotify." +
                        "\n:shopping_bags: ・ **[Разное](https://google.com/)** - и другие подписки на различные сервисы.")).addComponents(
                ActionRow.of(
                        Button.primary("fort", "Fortnite", fort),
                        Button.primary("dis", "Discord", dis),
                        Button.primary("tg", "Telegram", tg),
                        Button.primary("spot", "Spotify", spot),
                        Button.primary("list1", "След. стр. (1/2)", "🛍️")
                )).send(ch);
    }
}
