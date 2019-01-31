package com.test.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class DataActivity implements Parcelable {
    private String message;
    private String name;

    //??
    public DataActivity(String name, String message) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }
    public String getName() {
        return name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(message);
        dest.writeString(name);
    }

    public DataActivity (Parcel parcel) {
        message = parcel.readString();
        name = parcel.readString();
    }

    public static final Parcelable.Creator<DataActivity> CREATOR = new Parcelable.Creator<DataActivity>() {

        @Override
        public DataActivity createFromParcel(Parcel parcel) {
            return new DataActivity(parcel);
        }

        @Override
        public DataActivity[] newArray(int size) {
            return new DataActivity[0];
        }
    };
}
