package Modules.Ticket;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.channel.*;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.MessageFlag;
import org.javacord.api.entity.message.component.ActionRow;
import org.javacord.api.entity.message.component.Button;
import org.javacord.api.entity.message.component.TextInput;
import org.javacord.api.entity.message.component.TextInputStyle;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.entity.permission.PermissionType;
import org.javacord.api.entity.permission.PermissionsBuilder;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.entity.server.Server;
import org.javacord.api.event.interaction.ButtonClickEvent;

import java.awt.*;

public class Runner {
    static TextChannel ch;
    static ButtonClickEvent evennt;
    static DiscordApi api;
    static Server serv;
    static Role member;
    private static void modal () {
        api.addButtonClickListener(event -> {
            if (event.getButtonInteraction().getCustomId().equals("close")) {
                if (!event.getInteraction().getChannel().get().asServerTextChannel().get().getCategory().get().equals(serv.getChannelById(1216129956120367114L).get().asChannelCategory().get())) {
                    event.getInteraction().getChannel().get().asServerTextChannel().get().createUpdater().setCategory(serv.getChannelById(1216129956120367114L).get().asChannelCategory().get()).update();
                    event.getInteraction().createImmediateResponder().respond();
                    new MessageBuilder().addEmbed(new EmbedBuilder().setDescription("Тикет закрыт <@" + event.getInteraction().getUser().getId() + ">")).send(event.getInteraction().getChannel().get());
                } else event.getInteraction().createImmediateResponder().setContent("Этот тикет уже закрыт").setFlags(MessageFlag.EPHEMERAL).respond();
            }
        });
        api.addModalSubmitListener(event -> {
            event.getModalInteraction().createImmediateResponder().respond();
            TextChannel text = new ServerTextChannelBuilder(serv).setCategory(serv.getChannelById(1216129625185452283L).get().asChannelCategory().get()).setName(evennt.getInteraction().getUser().getName() + " Ticket").create().join();
            text.asServerTextChannel().get().createUpdater().removePermissionOverwrite(member).update().join();
            PermissionsBuilder perm2 = new PermissionsBuilder()
                    .setAllowed(PermissionType.VIEW_CHANNEL)
                    .setAllowed(PermissionType.SEND_MESSAGES);
            text.asServerTextChannel().get().createUpdater().addPermissionOverwrite(evennt.getInteraction().getUser(), perm2.build()).update();
            new MessageBuilder().addEmbed(new EmbedBuilder().setTitle("").setColor(Color.decode("#11aeb8")).setDescription("<@" + evennt.getInteraction().getUser().getId() + "> Спасибо за заказ\nСкоро ответит продавец").setFooter("CIRNIK Shop", Runner.class.getClassLoader().getResourceAsStream("Images/serv.webp")))
                    .addEmbed(new EmbedBuilder()
                                    .addField("Товар", "```" + event.getModalInteraction().getTextInputValueByCustomId("1").get() + "```")
                                    .addField("ПОЧТА/ЛОГИН", "```" + event.getModalInteraction().getTextInputValueByCustomId("2").get() + "```")
                                    .addField("ПАРОЛЬ", "```" + event.getModalInteraction().getTextInputValueByCustomId("3").get() + "```")).addComponents(
                                            ActionRow.of(Button.danger("close", "Закрыть"))
                    ).send(text);
        });
    }
    public static void logIn(DiscordApi api1, TextChannel ch1) {
        ch = ch1;
        api = api1;
        member = api.getRoleById(1212109095004545144L).get();
        serv = api1.getServerById(1212079778186797167L).get();
        modal();
        api.addButtonClickListener(event -> {
            evennt = event;
            switch (event.getButtonInteraction().getCustomId()) {
                case ("ticket"):
                    event.getInteraction().respondWithModal("modal1","Оформление заказа",
                            ActionRow.of(TextInput.create(TextInputStyle.SHORT, "1", "ВЫБЕРИТЕ ТОВАР , КОТОРЫЙ ХОТИТЕ КУПИТЬ", "Fortnite/Discord/Twitch/Faceit/Playstation", "", true)),
                            ActionRow.of(TextInput.create(TextInputStyle.SHORT, "2", "ПОЧТА/ЛОГИН ДЛЯ ВХОДА В АККАУНТ", "Почта/Логин от аккаунта. Зависить от товара", "", true )),
                            ActionRow.of(TextInput.create(TextInputStyle.SHORT, "3", "ПАРОЛЬ ДЛЯ ВХОДА В АККАУНТ", "Пароль от аккаунта. Зависить от товара", "", true )));
                    break;
            }
        });

    }
}
