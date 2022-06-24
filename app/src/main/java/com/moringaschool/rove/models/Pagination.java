
package com.moringaschool.rove.models;

import java.io.Serializable;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination implements Serializable, Parcelable
{

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("prev")
    @Expose
    private Object prev;
    public final static Creator<Pagination> CREATOR = new Creator<Pagination>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pagination createFromParcel(android.os.Parcel in) {
            return new Pagination(in);
        }

        public Pagination[] newArray(int size) {
            return (new Pagination[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6334559628885083139L;

    protected Pagination(android.os.Parcel in) {
        this.count = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.next = ((String) in.readValue((String.class.getClassLoader())));
        this.prev = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pagination() {
    }

    /**
     * 
     * @param next
     * @param total
     * @param prev
     * @param count
     */
    public Pagination(Integer count, Integer total, String next, Object prev) {
        super();
        this.count = count;
        this.total = total;
        this.next = next;
        this.prev = prev;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrev() {
        return prev;
    }

    public void setPrev(Object prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pagination.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("next");
        sb.append('=');
        sb.append(((this.next == null)?"<null>":this.next));
        sb.append(',');
        sb.append("prev");
        sb.append('=');
        sb.append(((this.prev == null)?"<null>":this.prev));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.next == null)? 0 :this.next.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.prev == null)? 0 :this.prev.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pagination) == false) {
            return false;
        }
        Pagination rhs = ((Pagination) other);
        return (((((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.next == rhs.next)||((this.next!= null)&&this.next.equals(rhs.next))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.prev == rhs.prev)||((this.prev!= null)&&this.prev.equals(rhs.prev))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(count);
        dest.writeValue(total);
        dest.writeValue(next);
        dest.writeValue(prev);
    }

    public int describeContents() {
        return  0;
    }

}
