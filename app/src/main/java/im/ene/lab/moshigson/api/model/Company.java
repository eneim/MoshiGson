
package im.ene.lab.moshigson.api.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.google.gson.annotations.Expose;
import com.squareup.moshi.JsonAdapter;

import im.ene.lab.moshigson.util.JsonUtil;

@JsonObject
public class Company {

    public static JsonAdapter<Company> moshi = JsonUtil.getMoshi().adapter(Company.class);

    @JsonField
    @Expose
    private String name;
    @JsonField
    @Expose
    private String catchPhrase;
    @JsonField
    @Expose
    private String bs;

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
     *     The catchPhrase
     */
    public String getCatchPhrase() {
        return catchPhrase;
    }

    /**
     * 
     * @param catchPhrase
     *     The catchPhrase
     */
    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    /**
     * 
     * @return
     *     The bs
     */
    public String getBs() {
        return bs;
    }

    /**
     * 
     * @param bs
     *     The bs
     */
    public void setBs(String bs) {
        this.bs = bs;
    }

}
