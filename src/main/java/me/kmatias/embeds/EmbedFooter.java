package me.kmatias.embeds;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author matias
 */
public class EmbedFooter {

    @Getter @Setter @SerializedName("icon_url")
    private String iconURL;

    @Getter @Setter
    private String text;
}
