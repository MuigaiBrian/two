
package com.moringaschool.rove.models;

import java.io.Serializable;
import java.util.List;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RoomType implements Serializable, Parcelable
{

    @SerializedName("roomTypeId")
    @Expose
    private String roomTypeId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("maxOccupancy")
    @Expose
    private Integer maxOccupancy;
    @SerializedName("rates")
    @Expose
    private List<Object> rates = null;
    @SerializedName("amenities")
    @Expose
    private List<Amenity__1> amenities = null;
    @SerializedName("images")
    @Expose
    private List<Image__1> images = null;
    public final static Creator<RoomType> CREATOR = new Creator<RoomType>() {


        @SuppressWarnings({
            "unchecked"
        })
        public RoomType createFromParcel(android.os.Parcel in) {
            return new RoomType(in);
        }

        public RoomType[] newArray(int size) {
            return (new RoomType[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6689301376621217114L;

    protected RoomType(android.os.Parcel in) {
        this.roomTypeId = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.maxOccupancy = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.rates, (java.lang.Object.class.getClassLoader()));
        in.readList(this.amenities, (com.moringaschool.rove.models.Amenity__1.class.getClassLoader()));
        in.readList(this.images, (com.moringaschool.rove.models.Image__1.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public RoomType() {
    }

    /**
     * 
     * @param amenities
     * @param images
     * @param rates
     * @param name
     * @param description
     * @param maxOccupancy
     * @param roomTypeId
     */
    public RoomType(String roomTypeId, String name, String description, Integer maxOccupancy, List<Object> rates, List<Amenity__1> amenities, List<Image__1> images) {
        super();
        this.roomTypeId = roomTypeId;
        this.name = name;
        this.description = description;
        this.maxOccupancy = maxOccupancy;
        this.rates = rates;
        this.amenities = amenities;
        this.images = images;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public List<Object> getRates() {
        return rates;
    }

    public void setRates(List<Object> rates) {
        this.rates = rates;
    }

    public List<Amenity__1> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenity__1> amenities) {
        this.amenities = amenities;
    }

    public List<Image__1> getImages() {
        return images;
    }

    public void setImages(List<Image__1> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("roomTypeId");
        sb.append('=');
        sb.append(((this.roomTypeId == null)?"<null>":this.roomTypeId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("maxOccupancy");
        sb.append('=');
        sb.append(((this.maxOccupancy == null)?"<null>":this.maxOccupancy));
        sb.append(',');
        sb.append("rates");
        sb.append('=');
        sb.append(((this.rates == null)?"<null>":this.rates));
        sb.append(',');
        sb.append("amenities");
        sb.append('=');
        sb.append(((this.amenities == null)?"<null>":this.amenities));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
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
        result = ((result* 31)+((this.amenities == null)? 0 :this.amenities.hashCode()));
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.rates == null)? 0 :this.rates.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.maxOccupancy == null)? 0 :this.maxOccupancy.hashCode()));
        result = ((result* 31)+((this.roomTypeId == null)? 0 :this.roomTypeId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomType) == false) {
            return false;
        }
        RoomType rhs = ((RoomType) other);
        return ((((((((this.amenities == rhs.amenities)||((this.amenities!= null)&&this.amenities.equals(rhs.amenities)))&&((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images))))&&((this.rates == rhs.rates)||((this.rates!= null)&&this.rates.equals(rhs.rates))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.maxOccupancy == rhs.maxOccupancy)||((this.maxOccupancy!= null)&&this.maxOccupancy.equals(rhs.maxOccupancy))))&&((this.roomTypeId == rhs.roomTypeId)||((this.roomTypeId!= null)&&this.roomTypeId.equals(rhs.roomTypeId))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(roomTypeId);
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(maxOccupancy);
        dest.writeList(rates);
        dest.writeList(amenities);
        dest.writeList(images);
    }

    public int describeContents() {
        return  0;
    }

}
