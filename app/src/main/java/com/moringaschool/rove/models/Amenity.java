
package com.moringaschool.rove.models;

import java.io.Serializable;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Amenity implements Serializable, Parcelable
{

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("formatted")
    @Expose
    private String formatted;
    public final static Creator<Amenity> CREATOR = new Creator<Amenity>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Amenity createFromParcel(android.os.Parcel in) {
            return new Amenity(in);
        }

        public Amenity[] newArray(int size) {
            return (new Amenity[size]);
        }

    }
    ;
    private final static long serialVersionUID = -8715142486946454629L;

    protected Amenity(android.os.Parcel in) {
        this.code = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.formatted = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Amenity() {
    }

    /**
     * 
     * @param code
     * @param formatted
     */
    public Amenity(Integer code, String formatted) {
        super();
        this.code = code;
        this.formatted = formatted;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Amenity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("formatted");
        sb.append('=');
        sb.append(((this.formatted == null)?"<null>":this.formatted));
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
        result = ((result* 31)+((this.formatted == null)? 0 :this.formatted.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Amenity) == false) {
            return false;
        }
        Amenity rhs = ((Amenity) other);
        return (((this.formatted == rhs.formatted)||((this.formatted!= null)&&this.formatted.equals(rhs.formatted)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(code);
        dest.writeValue(formatted);
    }

    public int describeContents() {
        return  0;
    }

}
