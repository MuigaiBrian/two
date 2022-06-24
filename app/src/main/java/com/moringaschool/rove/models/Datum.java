
package com.moringaschool.rove.models;

import java.io.Serializable;
import java.util.List;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum implements Serializable, Parcelable
{

    @SerializedName("hotelId")
    @Expose
    private String hotelId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("starRating")
    @Expose
    private Integer starRating;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("phoneNumbers")
    @Expose
    private List<String> phoneNumbers = null;
    @SerializedName("contractable")
    @Expose
    private Boolean contractable;
    @SerializedName("emails")
    @Expose
    private List<String> emails = null;
    @SerializedName("websiteUrl")
    @Expose
    private Object websiteUrl;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("amenities")
    @Expose
    private List<Amenity> amenities = null;
    @SerializedName("roomCount")
    @Expose
    private Integer roomCount;
    @SerializedName("checkIn")
    @Expose
    private CheckIn checkIn;
    @SerializedName("checkOut")
    @Expose
    private CheckOut checkOut;
    @SerializedName("termsAndConditions")
    @Expose
    private String termsAndConditions;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("externalUrls")
    @Expose
    private List<Object> externalUrls = null;
    @SerializedName("roomTypes")
    @Expose
    private List<RoomType> roomTypes = null;
    public final static Creator<Datum> CREATOR = new Creator<Datum>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Datum createFromParcel(android.os.Parcel in) {
            return new Datum(in);
        }

        public Datum[] newArray(int size) {
            return (new Datum[size]);
        }

    }
    ;
    private final static long serialVersionUID = 605073368819155389L;

    protected Datum(android.os.Parcel in) {
        this.hotelId = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.starRating = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.description = ((Description) in.readValue((Description.class.getClassLoader())));
        in.readList(this.phoneNumbers, (java.lang.String.class.getClassLoader()));
        this.contractable = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.emails, (java.lang.String.class.getClassLoader()));
        this.websiteUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.images, (com.moringaschool.rove.models.Image.class.getClassLoader()));
        this.address = ((Address) in.readValue((Address.class.getClassLoader())));
        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
        this.timezone = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.amenities, (com.moringaschool.rove.models.Amenity.class.getClassLoader()));
        this.roomCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.checkIn = ((CheckIn) in.readValue((CheckIn.class.getClassLoader())));
        this.checkOut = ((CheckOut) in.readValue((CheckOut.class.getClassLoader())));
        this.termsAndConditions = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.externalUrls, (java.lang.Object.class.getClassLoader()));
        in.readList(this.roomTypes, (com.moringaschool.rove.models.RoomType.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param roomCount
     * @param amenities
     * @param images
     * @param contractable
     * @param address
     * @param timezone
     * @param description
     * @param hotelId
     * @param externalUrls
     * @param phoneNumbers
     * @param termsAndConditions
     * @param emails
     * @param createdAt
     * @param checkIn
     * @param websiteUrl
     * @param roomTypes
     * @param name
     * @param currency
     * @param location
     * @param starRating
     * @param checkOut
     * @param updatedAt
     */
    public Datum(String hotelId, String name, String currency, Integer starRating, Description description, List<String> phoneNumbers, Boolean contractable, List<String> emails, Object websiteUrl, List<Image> images, Address address, Location location, String timezone, List<Amenity> amenities, Integer roomCount, CheckIn checkIn, CheckOut checkOut, String termsAndConditions, String createdAt, String updatedAt, List<Object> externalUrls, List<RoomType> roomTypes) {
        super();
        this.hotelId = hotelId;
        this.name = name;
        this.currency = currency;
        this.starRating = starRating;
        this.description = description;
        this.phoneNumbers = phoneNumbers;
        this.contractable = contractable;
        this.emails = emails;
        this.websiteUrl = websiteUrl;
        this.images = images;
        this.address = address;
        this.location = location;
        this.timezone = timezone;
        this.amenities = amenities;
        this.roomCount = roomCount;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.termsAndConditions = termsAndConditions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalUrls = externalUrls;
        this.roomTypes = roomTypes;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getStarRating() {
        return starRating;
    }

    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Boolean getContractable() {
        return contractable;
    }

    public void setContractable(Boolean contractable) {
        this.contractable = contractable;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Object getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(Object websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public CheckIn getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }

    public CheckOut getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(CheckOut checkOut) {
        this.checkOut = checkOut;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Object> getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(List<Object> externalUrls) {
        this.externalUrls = externalUrls;
    }

    public List<RoomType> getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(List<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hotelId");
        sb.append('=');
        sb.append(((this.hotelId == null)?"<null>":this.hotelId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("starRating");
        sb.append('=');
        sb.append(((this.starRating == null)?"<null>":this.starRating));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("phoneNumbers");
        sb.append('=');
        sb.append(((this.phoneNumbers == null)?"<null>":this.phoneNumbers));
        sb.append(',');
        sb.append("contractable");
        sb.append('=');
        sb.append(((this.contractable == null)?"<null>":this.contractable));
        sb.append(',');
        sb.append("emails");
        sb.append('=');
        sb.append(((this.emails == null)?"<null>":this.emails));
        sb.append(',');
        sb.append("websiteUrl");
        sb.append('=');
        sb.append(((this.websiteUrl == null)?"<null>":this.websiteUrl));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("amenities");
        sb.append('=');
        sb.append(((this.amenities == null)?"<null>":this.amenities));
        sb.append(',');
        sb.append("roomCount");
        sb.append('=');
        sb.append(((this.roomCount == null)?"<null>":this.roomCount));
        sb.append(',');
        sb.append("checkIn");
        sb.append('=');
        sb.append(((this.checkIn == null)?"<null>":this.checkIn));
        sb.append(',');
        sb.append("checkOut");
        sb.append('=');
        sb.append(((this.checkOut == null)?"<null>":this.checkOut));
        sb.append(',');
        sb.append("termsAndConditions");
        sb.append('=');
        sb.append(((this.termsAndConditions == null)?"<null>":this.termsAndConditions));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("externalUrls");
        sb.append('=');
        sb.append(((this.externalUrls == null)?"<null>":this.externalUrls));
        sb.append(',');
        sb.append("roomTypes");
        sb.append('=');
        sb.append(((this.roomTypes == null)?"<null>":this.roomTypes));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.roomCount == null)? 0 :this.roomCount.hashCode()));
        result = ((result* 31)+((this.amenities == null)? 0 :this.amenities.hashCode()));
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.contractable == null)? 0 :this.contractable.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.hotelId == null)? 0 :this.hotelId.hashCode()));
        result = ((result* 31)+((this.externalUrls == null)? 0 :this.externalUrls.hashCode()));
        result = ((result* 31)+((this.phoneNumbers == null)? 0 :this.phoneNumbers.hashCode()));
        result = ((result* 31)+((this.termsAndConditions == null)? 0 :this.termsAndConditions.hashCode()));
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.checkIn == null)? 0 :this.checkIn.hashCode()));
        result = ((result* 31)+((this.websiteUrl == null)? 0 :this.websiteUrl.hashCode()));
        result = ((result* 31)+((this.roomTypes == null)? 0 :this.roomTypes.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.starRating == null)? 0 :this.starRating.hashCode()));
        result = ((result* 31)+((this.checkOut == null)? 0 :this.checkOut.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return (((((((((((((((((((((((this.roomCount == rhs.roomCount)||((this.roomCount!= null)&&this.roomCount.equals(rhs.roomCount)))&&((this.amenities == rhs.amenities)||((this.amenities!= null)&&this.amenities.equals(rhs.amenities))))&&((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images))))&&((this.contractable == rhs.contractable)||((this.contractable!= null)&&this.contractable.equals(rhs.contractable))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.hotelId == rhs.hotelId)||((this.hotelId!= null)&&this.hotelId.equals(rhs.hotelId))))&&((this.externalUrls == rhs.externalUrls)||((this.externalUrls!= null)&&this.externalUrls.equals(rhs.externalUrls))))&&((this.phoneNumbers == rhs.phoneNumbers)||((this.phoneNumbers!= null)&&this.phoneNumbers.equals(rhs.phoneNumbers))))&&((this.termsAndConditions == rhs.termsAndConditions)||((this.termsAndConditions!= null)&&this.termsAndConditions.equals(rhs.termsAndConditions))))&&((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.checkIn == rhs.checkIn)||((this.checkIn!= null)&&this.checkIn.equals(rhs.checkIn))))&&((this.websiteUrl == rhs.websiteUrl)||((this.websiteUrl!= null)&&this.websiteUrl.equals(rhs.websiteUrl))))&&((this.roomTypes == rhs.roomTypes)||((this.roomTypes!= null)&&this.roomTypes.equals(rhs.roomTypes))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.starRating == rhs.starRating)||((this.starRating!= null)&&this.starRating.equals(rhs.starRating))))&&((this.checkOut == rhs.checkOut)||((this.checkOut!= null)&&this.checkOut.equals(rhs.checkOut))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(hotelId);
        dest.writeValue(name);
        dest.writeValue(currency);
        dest.writeValue(starRating);
        dest.writeValue(description);
        dest.writeList(phoneNumbers);
        dest.writeValue(contractable);
        dest.writeList(emails);
        dest.writeValue(websiteUrl);
        dest.writeList(images);
        dest.writeValue(address);
        dest.writeValue(location);
        dest.writeValue(timezone);
        dest.writeList(amenities);
        dest.writeValue(roomCount);
        dest.writeValue(checkIn);
        dest.writeValue(checkOut);
        dest.writeValue(termsAndConditions);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeList(externalUrls);
        dest.writeList(roomTypes);
    }

    public int describeContents() {
        return  0;
    }

}
