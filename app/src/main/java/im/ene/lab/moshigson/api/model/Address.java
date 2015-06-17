
package im.ene.lab.moshigson.api.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.google.gson.annotations.Expose;
import com.squareup.moshi.JsonAdapter;

import im.ene.lab.moshigson.util.JsonUtil;

@JsonObject
public class Address {

    public static JsonAdapter<Address> moshi = JsonUtil.getMoshi().adapter(Address.class);

    @JsonField
    @Expose
    private String street;
    @JsonField
    @Expose
    private String suite;
    @JsonField
    @Expose
    private String city;
    @JsonField
    @Expose
    private String zipcode;
    @JsonField
    @Expose
    private Geo geo;

    /**
     * 
     * @return
     *     The street
     */
    public String getStreet() {
        return street;
    }

    /**
     * 
     * @param street
     *     The street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 
     * @return
     *     The suite
     */
    public String getSuite() {
        return suite;
    }

    /**
     * 
     * @param suite
     *     The suite
     */
    public void setSuite(String suite) {
        this.suite = suite;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 
     * @param zipcode
     *     The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * 
     * @return
     *     The geo
     */
    public Geo getGeo() {
        return geo;
    }

    /**
     * 
     * @param geo
     *     The geo
     */
    public void setGeo(Geo geo) {
        this.geo = geo;
    }

}
