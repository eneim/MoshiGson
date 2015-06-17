
package im.ene.lab.moshigson.api.model;

import com.google.gson.annotations.Expose;
import com.squareup.moshi.JsonAdapter;

import im.ene.lab.moshigson.util.JsonUtil;

public class Photo {

    public static JsonAdapter<Photo> moshi = JsonUtil.getMoshi().adapter(Photo.class);

    @Expose
    private int albumId;
    @Expose
    private int id;
    @Expose
    private String title;
    @Expose
    private String url;
    @Expose
    private String thumbnailUrl;

    /**
     * 
     * @return
     *     The albumId
     */
    public int getAlbumId() {
        return albumId;
    }

    /**
     * 
     * @param albumId
     *     The albumId
     */
    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The thumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * 
     * @param thumbnailUrl
     *     The thumbnailUrl
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

}
