
package im.ene.lab.moshigson.api.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.google.gson.annotations.Expose;
import com.squareup.moshi.JsonAdapter;

import im.ene.lab.moshigson.util.JsonUtil;

@JsonObject
public class User {

    public static JsonAdapter<User> moshi = JsonUtil.getMoshi().adapter(User.class);

    @JsonField
    @Expose
    private int id;
    @JsonField
    @Expose
    private String name;
    @JsonField
    @Expose
    private String username;
    @JsonField
    @Expose
    private String email;
    @JsonField
    @Expose
    private Address address;
    @JsonField
    @Expose
    private String phone;
    @JsonField
    @Expose
    private String website;
    @JsonField
    @Expose
    private Company company;

    /**
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return The company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company The company
     */
    public void setCompany(Company company) {
        this.company = company;
    }

}
