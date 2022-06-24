
package com.moringaschool.rove.models;

import java.io.Serializable;
import java.util.List;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class HotelListResponse implements Serializable, Parcelable
{

    @SerializedName("data")
    @Expose
    private List<com.moringaschool.rove.models.Datum> data = null;
    @SerializedName("pagination")
    @Expose
    private com.moringaschool.rove.models.Pagination pagination;
    public final static Creator<HotelListResponse> CREATOR = new Creator<HotelListResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public HotelListResponse createFromParcel(android.os.Parcel in) {
            return new HotelListResponse(in);
        }

        public HotelListResponse[] newArray(int size) {
            return (new HotelListResponse[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3985674842894719239L;

    protected HotelListResponse(android.os.Parcel in) {
        in.readList(this.data, (com.moringaschool.rove.models.Datum.class.getClassLoader()));
        this.pagination = ((com.moringaschool.rove.models.Pagination) in.readValue((com.moringaschool.rove.models.Pagination.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public HotelListResponse() {
    }

    /**
     * 
     * @param pagination
     * @param data
     */
    public HotelListResponse(List<com.moringaschool.rove.models.Datum> data, com.moringaschool.rove.models.Pagination pagination) {
        super();
        this.data = data;
        this.pagination = pagination;
    }

    public List<com.moringaschool.rove.models.Datum> getData() {
        return data;
    }

    public void setData(List<com.moringaschool.rove.models.Datum> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HotelListResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("pagination");
        sb.append('=');
        sb.append(((this.pagination == null)?"<null>":this.pagination));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.pagination == null)? 0 :this.pagination.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HotelListResponse) == false) {
            return false;
        }
        HotelListResponse rhs = ((HotelListResponse) other);
        return (((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)))&&((this.pagination == rhs.pagination)||((this.pagination!= null)&&this.pagination.equals(rhs.pagination))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(data);
        dest.writeValue(pagination);
    }

    public int describeContents() {
        return  0;
    }

}
