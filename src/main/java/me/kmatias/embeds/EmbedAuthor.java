package me.kmatias.embeds;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author matias
 */
public class EmbedAuthor {

    /**
     * Authors name
     */
    @Getter
    @Setter
    private String name;

    /**
     * Authors home page url
     */
    @Getter
    @Setter
    private String url;

    /**
     * Icon url
     */
    @Getter
    @Setter
    @SerializedName("icon_url")
    private String iconURL;
}
