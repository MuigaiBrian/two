
package com.moringaschool.rove.models;

import java.io.Serializable;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Amenity__1 implements Serializable, Parcelable
{

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("formatted")
    @Expose
    private String formatted;
    public final static Creator<Amenity__1> CREATOR = new Creator<Amenity__1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Amenity__1 createFromParcel(android.os.Parcel in) {
            return new Amenity__1(in);
        }

        public Amenity__1 [] newArray(int size) {
            return (new Amenity__1[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3825207902224134882L;

    protected Amenity__1(android.os.Parcel in) {
        this.code = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.formatted = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Amenity__1() {
    }

    /**
     * 
     * @param code
     * @param formatted
     */
    public Amenity__1(Integer code, String formatted) {
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
        sb.append(Amenity__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Amenity__1) == false) {
            return false;
        }
        Amenity__1 rhs = ((Amenity__1) other);
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
