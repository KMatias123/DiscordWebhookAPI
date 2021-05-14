### Discord webhook API

A lib for building discord webhook requests

example usage:

```java
import me.kmatias.DiscordAPI;
import me.kmatias.embeds.Embed;

public class test {

    public static void main(String[] args) {
        DiscordAPI api = new DiscordAPI("Your webhooks URL");
        Embed embed = new Embed();
        embed.setTitle("test1");
        embed.setDescription("test2");
        api.getWebhookRequest().getEmbeds().add(embed);
        api.getWebhookRequest().setMessage("Message");
        api.doRequest();
    }
}
```