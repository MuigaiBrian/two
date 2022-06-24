
package com.moringaschool.rove.models;

import java.io.Serializable;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckIn implements Serializable, Parcelable
{

    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private String to;
    public final static Creator<CheckIn> CREATOR = new Creator<CheckIn>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CheckIn createFromParcel(android.os.Parcel in) {
            return new CheckIn(in);
        }

        public CheckIn[] newArray(int size) {
            return (new CheckIn[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8946004946106486480L;

    protected CheckIn(android.os.Parcel in) {
        this.from = ((String) in.readValue((String.class.getClassLoader())));
        this.to = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public CheckIn() {
    }

    /**
     * 
     * @param from
     * @param to
     */
    public CheckIn(String from, String to) {
        super();
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CheckIn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(((this.to == null)?"<null>":this.to));
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
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckIn) == false) {
            return false;
        }
        CheckIn rhs = ((CheckIn) other);
        return (((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from)))&&((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(from);
        dest.writeValue(to);
    }

    public int describeContents() {
        return  0;
    }

}
