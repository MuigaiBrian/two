
package com.moringaschool.rove.models;

import java.io.Serializable;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Image implements Serializable, Parcelable
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
    @SerializedName("isHeroImage")
    @Expose
    private Boolean isHeroImage;
    public final static Creator<Image> CREATOR = new Creator<Image>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Image createFromParcel(android.os.Parcel in) {
            return new Image(in);
        }

        public Image[] newArray(int size) {
            return (new Image[size]);
        }

    }
    ;
    private final static long serialVersionUID = -1725469531165002145L;

    protected Image(android.os.Parcel in) {
        this.altText = ((Object) in.readValue((Object.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.isHeroImage = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param altText
     * @param width
     * @param url
     * @param isHeroImage
     * @param height
     */
    public Image(Object altText, Integer height, Integer width, String url, Boolean isHeroImage) {
        super();
        this.altText = altText;
        this.height = height;
        this.width = width;
        this.url = url;
        this.isHeroImage = isHeroImage;
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

    public Boolean getIsHeroImage() {
        return isHeroImage;
    }

    public void setIsHeroImage(Boolean isHeroImage) {
        this.isHeroImage = isHeroImage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("isHeroImage");
        sb.append('=');
        sb.append(((this.isHeroImage == null)?"<null>":this.isHeroImage));
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
        result = ((result* 31)+((this.isHeroImage == null)? 0 :this.isHeroImage.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return ((((((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width)))&&((this.altText == rhs.altText)||((this.altText!= null)&&this.altText.equals(rhs.altText))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.isHeroImage == rhs.isHeroImage)||((this.isHeroImage!= null)&&this.isHeroImage.equals(rhs.isHeroImage))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(altText);
        dest.writeValue(height);
        dest.writeValue(width);
        dest.writeValue(url);
        dest.writeValue(isHeroImage);
    }

    public int describeContents() {
        return  0;
    }

}
