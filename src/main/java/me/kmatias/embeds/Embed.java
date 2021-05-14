package me.kmatias.embeds;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author matias
 */
public class Embed {

    /**
     * This embeds author
     */
    @Getter
    @Setter
    private EmbedAuthor author;

    /**
     * The embeds title, the fields have their own titles
     */
    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String url;

    /**
     * The description, markdown is allowed here
     */
    @Getter
    @Setter
    private String description;

    /**
     * The color for the embeds border
     */
    @Getter
    @Setter
    private int color;

    /**
     * URL for small image in the embed
     */
    @Getter
    @Setter
    @SerializedName("thumbnail")
    private EmbedImageURL thumbnailURL;

    /**
     * URL for large image in the embed
     */
    @Getter
    @Setter
    @SerializedName("image")
    private EmbedImageURL imageURL;
}
