
package im.ene.lab.moshigson.api.model;

import com.google.gson.annotations.Expose;
import com.squareup.moshi.JsonAdapter;

import im.ene.lab.moshigson.util.JsonUtil;

public class Comment {

    public static JsonAdapter<Comment> moshi = JsonUtil.getMoshi().adapter(Comment.class);

    @Expose
    private int postId;
    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private String email;
    @Expose
    private String body;

    /**
     * 
     * @return
     *     The postId
     */
    public int getPostId() {
        return postId;
    }

    /**
     * 
     * @param postId
     *     The postId
     */
    public void setPostId(int postId) {
        this.postId = postId;
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
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The body
     */
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    public void setBody(String body) {
        this.body = body;
    }

}
