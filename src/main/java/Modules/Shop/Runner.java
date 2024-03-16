package Modules.Shop;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.emoji.CustomEmoji;
import org.javacord.api.entity.message.component.ActionRow;
import org.javacord.api.entity.message.component.Button;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.interaction.ButtonClickEvent;

import java.awt.*;

public class Runner {
    static TextChannel ch;
    static ButtonClickEvent evennt;
    static DiscordApi api;

    private static void list2() {
        CustomEmoji fort = api.getCustomEmojiById(1215692706244988928L).get();
        CustomEmoji dis = api.getCustomEmojiById(1217161261049970769L).get();
        CustomEmoji tg = api.getCustomEmojiById(1214651548194447490L).get();
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setAuthor("CIRNIK Shop", "", Setup.class.getClassLoader().getResourceAsStream("Images/serv.webp"))
                    .setTitle("Приветствуем в магазине CIRNIK Shop").setDescription("Выберите интересующую вас категорию и воспользуйтесь\n **интерактивной кнопкой**, чтобы ознакомиться с информацией\n о товарах.")
                    .setColor(Color.decode("#11aeb8"))
                    .addField("", "")
                    .addField("", "")
                    .addField("", "Ниже вы можете ознакомиться с кратким описанием к каждой\n категории." +
                            "\n>>> <:ps:1215692706244988928> ・ **[Playstation](https://www.playstation.com/)** - Подписка на плюс для Playstation." +
                            "\n<:faceit:1214651548194447490> ・ **[Faceit](https://www.faceit.com/)** - Подписка премиум или плюс для Faceit." +
                            "\n<:twitch:1217161261049970769> ・ **[Twitch](https://www.twitch.tv/)** - Подписка на стримера.")).addComponents(
                    ActionRow.of(
                            Button.primary("play", "Playstation", fort),
                            Button.primary("twitch", "Twitch", dis),
                            Button.primary("face", "Faceit", tg))
            ).update();
        });

    }

    private static void fort() {
        CustomEmoji bucks = api.getCustomEmojiById(1212327306593304606L).get();
        CustomEmoji squad = api.getCustomEmojiById(1217188563318210741L).get();
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setAuthor("CIRNIK Shop", "", Runner.class.getClassLoader().getResourceAsStream("Images/serv.webp"))
                    .setTitle("Приветствуем в магазине CIRNIK Shop").setDescription("Выберите интересующую вас категорию и воспользуйтесь\n **интерактивной кнопкой**, чтобы ознакомиться с информацией\n о товарах.")
                    .setColor(Color.decode("#11aeb8"))
                    .addField("", "")
                    .addField("", "")
                    .addField("", "Ниже вы можете ознакомиться с категориями товаров из игры \n **Fortnite**")
                    .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/fort.webp"))).addComponents(
                    ActionRow.of(
                            Button.primary("vbucks", "V-bucks", bucks),
                            Button.primary("kit", "Наборы", "🗳️"),
                            Button.primary("squad", "Отряд", squad))).update();
        });
    }

    private static void squad() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/squad/image.webp"))
                    .setTitle("<:shop:1212328634443112508>  Fortnite: Отряд Март 2024")
                    .setColor(Color.decode("#11aeb8"))
                    .setDescription("**Цена - 299**₽\n" +
                            "**Перед покупкой ознакомься с: <#1212079778786451538> и <#1212132129782239293>**")
                    .addField("", "")
                    .addField("", "")).addComponents(
                    ActionRow.of(
                            Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    private static void kit() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                            .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/kit/1.webp"))
                            .setTitle("<:shop:1212328634443112508>  Fortnite: Отряд Март 2024")
                            .setColor(Color.decode("#11aeb8"))
                            .setDescription("**Цена - 239₽\n" +
                                    "Перед покупкой ознакомьтесь с : <#1212079778786451538> и <#1212132129782239293>.**\n"))
                    .addEmbed(new EmbedBuilder()
                            .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/kit/2.webp"))
                            .setTitle("<:shop:1212328634443112508>  Fortnite: Набор «Виндерман 2.0» + 1500 <:Vbucks:1212327306593304606>")
                            .setColor(Color.decode("#11aeb8"))
                            .setDescription("**Цена - 849₽\n" +
                                    "Перед покупкой ознакомьтесь с : <#1212079778786451538> и <#1212132129782239293>.**\n"))
                    .addEmbed(new EmbedBuilder()
                            .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/kit/3.webp"))
                            .setTitle("<:shop:1212328634443112508>  Fortnite: Стартовый набор для режима LEGO «Идеальная Стратегия»")
                            .setColor(Color.decode("#11aeb8"))
                            .setDescription("**Цена - 199₽\n" +
                                    "Перед покупкой ознакомьтесь с : <#1212079778786451538> и <#1212132129782239293>.**"))
                    .addEmbed(new EmbedBuilder()
                            .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/kit/4.webp"))
                            .setTitle("<:shop:1212328634443112508>  Fortnite: Набор «Ценные Агенты»")
                            .setColor(Color.decode("#11aeb8"))
                            .setDescription("**Цена - 849₽\n" +
                                    "Перед покупкой ознакомьтесь с : <#1212079778786451538> и <#1212132129782239293>.**")).addComponents(
                            ActionRow.of(
                                    Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    private static void vbucks() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                             .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/vbucks/bucks.webp"))
                            .setTitle("<:Vbucks:1212327306593304606> V-Bucks на ваш аккаунт!")
                            .setColor(Color.decode("#11aeb8"))
                            .setDescription("**1000** <:Vbucks:1212327306593304606> **- 429₽**\n" +
                                    "**2800** <:Vbucks:1212327306593304606> **- 1199₽**\n" +
                                    "**5000** <:Vbucks:1212327306593304606> **- 1649₽**\n" +
                                    "**13500** <:Vbucks:1212327306593304606> **- 4299₽**\n" +
                                    "**==============**\n" +
                                    "**ДОПОЛНИТЕЛЬНО : **\n" +
                                    "**27000** <:Vbucks:1212327306593304606> **- 8399₽**\n" +
                                    "**40500** <:Vbucks:1212327306593304606> **- 12499₽**\n" +
                                    "\n" +
                                    "*Для покупки открывайте тикет <#1212329341120282644>*"))
                    .addEmbed(new EmbedBuilder()
                            .setTitle("Как происходит покупка?")
                            .setColor(Color.decode("#11aeb8"))
                            .setDescription("<:shop:1212328634443112508> **1. Вы оплачиваете выбранный товар, после оплаты вы должны отправить данные от привязанного Microsoft аккаунта (инструкция как привязать Microsoft аккаунт к Epic Games <#1212132129782239293> ) **\n" +
                                    "<:timer:1212330690494996491> **2. Ожидайте, в течении 5-20 минут ваши вбаксы будут уже на вашем аккаунте! **")).addComponents(
                            ActionRow.of(
                                    Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    private static void dis() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setColor(Color.decode("#11aeb8"))
                    .setTitle("<:shop:1212328634443112508>  Discord Nitro Full | Basic")
                    .setDescription("**Nitro Full :\n" +
                            "1 Месяц - 379₽\n" +
                            "12 Месяцев - 3799₽**\n" +
                            "\n" +
                            "**Nitro Basic :\n" +
                            "1 Месяц - 149₽\n" +
                            "12 Месяцев - 1499₽**\n" +
                            "\n" +
                            "**Перед покупкой ознакомься с: <#1212079778786451538>**\n" +
                            "\n" +
                            "Для покупки открывайте тикет <#1212329341120282644>")
                    .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/dis/1.webp"))).addComponents(
                    ActionRow.of(
                            Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    private static void tg() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setColor(Color.decode("#11aeb8"))
                    .setTitle("<:tg:1216145786287558676> Подписка Telegram Premium!")
                    .setDescription("**<:tgprem:1216146574858653846> Premium [1 Month] - 249₽\n" +
                            "<:tgprem:1216146574858653846> Premium [12 Months] - 1599₽**\n" +
                            "\n" +
                            "*Для покупки открывайте тикет <#1212329341120282644>*")
                    .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/tg/1.webp"))).addComponents(
                    ActionRow.of(
                            Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    private static void spot() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setColor(Color.decode("#11aeb8"))
                    .setTitle("<:spotify:1216496726421278873> Подписка Spotify Premium!")
                    .setDescription("**<:spotify:1216496726421278873> Premium [1 Month] - 249₽ | New Account - 49₽\n" +
                            "<:spotify:1216496726421278873> Premium [3 Month] - 649₽\n" +
                            "<:spotify:1216496726421278873> Premium [6 Months] - 1249₽\n" +
                            "<:spotify:1216496726421278873> Premium [12 Month] - 2199₽**\n" +
                            "\n" +
                            "*Для покупки открывайте тикет <#1212329341120282644>*")
                    .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/spot/1.webp"))).addComponents(
                    ActionRow.of(
                            Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    private static void play() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setColor(Color.decode("#11aeb8"))
                    .setTitle("<:ps:1215692706244988928> Подписки PlayStation Plus!")
                    .setDescription("**<:psplus:1215692311728750642> Essential [1 Month] - 699₽\n" +
                            "<:psplus:1215692311728750642> Essential [3 Months] - 1599₽\n" +
                            "<:psplus:1215692311728750642> Essential [12 Months] - 4799₽**\n" +
                            "\n" +
                            "**<:psplus:1215692311728750642> Extra [1 Month] - 999₽\n" +
                            "<:psplus:1215692311728750642> Extra [3 Months] - 2499₽\n" +
                            "<:psplus:1215692311728750642> Extra [12 Months] - 7899₽**\n" +
                            "\n" +
                            "**<:psplus:1215692311728750642> Deluxe [1 Month] - 1399₽\n" +
                            "<:psplus:1215692311728750642> Deluxe [3 Months] - 2899₽\n" +
                            "<:psplus:1215692311728750642> Deluxe [12 Months] - 9599₽**\n" +
                            "\n" +
                            "*Для покупки открывайте тикет <#1212329341120282644>*")
                    .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/play/1.webp"))).addEmbed(new EmbedBuilder()
                    .setTitle("Как происходит покупка?")
                    .setColor(Color.decode("#11aeb8"))
                    .setDescription("<:shop:1212328634443112508> **1. Вы выбираете как получить подписку. На ваш аккаунт [ Есть риск блокировки ] или мы даем вам аккаунт который будет ТОЛЬКО у вас.  **\n" +
                            "<:timer:1212330690494996491> **2. Оплачиваете покупку и мы делаем заказ в зависимости от вашего выбора. **")).addComponents(
                    ActionRow.of(
                            Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    private static void twitch() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setColor(Color.decode("#11aeb8"))
                    .setTitle("<:shop:1212328634443112508>  Twitch Subscribe")
                    .setDescription("<:twitch:1217161261049970769> **1 уровень :\n" +
                            "1 месяц - 49₽\n" +
                            "3 месяца - 129₽\n" +
                            "6 месяцев - 239₽\n" +
                            "12 Месяцев - 429₽ \n" +
                            "-------------------------\n" +
                            "<:twitch:1217161261049970769> 2 Уровень\n" +
                            "1 месяц 90₽ \n" +
                            "-------------------------\n" +
                            "<:twitch:1217161261049970769> 3 Уровень \n" +
                            "1 Месяц 199₽ **\n" +
                            "\n" +
                            "*Для покупки открывайте тикет <#1212329341120282644>*")
                    .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/twitch/1.webp"))).addComponents(
                    ActionRow.of(
                            Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    private static void face() {
        evennt.getInteraction().respondLater(true).thenAccept(res -> {
            res.addEmbed(new EmbedBuilder()
                    .setColor(Color.decode("#11aeb8"))
                    .setTitle("<:shop:1212328634443112508>  FACEIT Plus | Premium")
                    .setDescription("**Plus :\n" +
                            "1 Месяц - 179₽\n" +
                            "12 Месяцев - 999₽**\n" +
                            "\n" +
                            "**Premium :\n" +
                            "1 Месяц - 249₽\n" +
                            "12 Месяцев - 1899₽**\n" +
                            "\n" +
                            "**Перед покупкой ознакомься с: \u2060<#1212079778786451538>**\n" +
                            "\n" +
                            "Для покупки открывайте тикет \u2060<#1212329341120282644>")
                    .setImage(Runner.class.getClassLoader().getResourceAsStream("Images/face/1.webp"))).addComponents(
                    ActionRow.of(
                            Button.link("https://discord.com/channels/1212079778186797167/1212329341120282644", "Купить"))).update();
        });
    }

    public static void logIn(DiscordApi api1, TextChannel ch1) {
        ch = ch1;
        api = api1;
        api.addButtonClickListener(event -> {
            System.out.println("Buton event in shop");
            evennt = event;
            switch (event.getButtonInteraction().getCustomId()) {
                case ("dis"):
                    dis();
                    break;
                case ("tg"):
                    tg();
                    break;
                case ("spot"):
                    spot();
                    break;
                case ("play"):
                    play();
                    break;
                case ("twitch"):
                    twitch();
                    break;
                case ("face"):
                    face();
                    break;
                case ("vbucks"):
                    vbucks();
                    break;
                case ("kit"):
                    kit();
                    break;
                case ("squad"):
                    squad();
                    break;
                case ("fort"):
                    fort();
                    break;
                case ("list1"):
                    list2();
                    break;
            }
        });

    }
}
