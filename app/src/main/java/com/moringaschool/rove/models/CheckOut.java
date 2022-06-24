
package com.moringaschool.rove.models;

import java.io.Serializable;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckOut implements Serializable, Parcelable
{

    @SerializedName("to")
    @Expose
    private String to;
    public final static Creator<CheckOut> CREATOR = new Creator<CheckOut>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CheckOut createFromParcel(android.os.Parcel in) {
            return new CheckOut(in);
        }

        public CheckOut[] newArray(int size) {
            return (new CheckOut[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7718150921716125265L;

    protected CheckOut(android.os.Parcel in) {
        this.to = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public CheckOut() {
    }

    /**
     * 
     * @param to
     */
    public CheckOut(String to) {
        super();
        this.to = to;
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
        sb.append(CheckOut.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckOut) == false) {
            return false;
        }
        CheckOut rhs = ((CheckOut) other);
        return ((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to)));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(to);
    }

    public int describeContents() {
        return  0;
    }

}
