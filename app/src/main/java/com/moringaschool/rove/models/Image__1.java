
package com.moringaschool.rove.models;

import java.io.Serializable;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Image__1 implements Serializable, Parcelable
{

    @SerializedName("altText")
    @Expose
    private Object altText;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<Image__1> CREATOR = new Creator<Image__1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Image__1 createFromParcel(android.os.Parcel in) {
            return new Image__1(in);
        }

        public Image__1 [] newArray(int size) {
            return (new Image__1[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6897033159529432076L;

    protected Image__1(android.os.Parcel in) {
        this.altText = ((Object) in.readValue((Object.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image__1() {
    }

    /**
     * 
     * @param altText
     * @param width
     * @param url
     * @param height
     */
    public Image__1(Object altText, Integer height, Integer width, String url) {
        super();
        this.altText = altText;
        this.height = height;
        this.width = width;
        this.url = url;
    }

    public Object getAltText() {
        return altText;
    }

    public void setAltText(Object altText) {
        this.altText = altText;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("altText");
        sb.append('=');
        sb.append(((this.altText == null)?"<null>":this.altText));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
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
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.altText == null)? 0 :this.altText.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image__1) == false) {
            return false;
        }
        Image__1 rhs = ((Image__1) other);
        return (((((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width)))&&((this.altText == rhs.altText)||((this.altText!= null)&&this.altText.equals(rhs.altText))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(altText);
        dest.writeValue(height);
        dest.writeValue(width);
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
