package me.kmatias;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import me.kmatias.embeds.Embed;

import java.util.ArrayList;

/**
 * @author matias
 */
public class APIRequest {

    /**
     * URL for the webhooks name, if empty the name will be the webhooks default name
     */
    @Setter
    @Getter
    private String username;

    /**
     * URL for the webhooks avatar, can be left empty
     */
    @Setter
    @Getter
    @SerializedName("avatar_url")
    private String avatarURL;

    /**
     * The message that the webhook will send
     */
    @Setter
    @Getter
    @SerializedName("content")
    private String message;

    @Setter @Getter
    private ArrayList<Embed> embeds = new ArrayList<>();
}
