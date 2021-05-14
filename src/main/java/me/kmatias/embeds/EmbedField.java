package me.kmatias.embeds;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author matias
 */
public class EmbedField {

    /**
     * The fields name
     */
    @Getter
    @Setter
    private String name;

    /**
     * The string that shows up under the name
     */
    @Getter
    @Setter
    @SerializedName("value")
    private String description;

    @Getter
    @Setter
    private boolean inline = false;
}
