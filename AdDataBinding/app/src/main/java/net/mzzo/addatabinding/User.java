package net.mzzo.addatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Admin on 2015/6/8.
 */
public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    private boolean isAdult;

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(net.mzzo.addatabinding.BR.firstName);
    }

    @Bindable
    public boolean getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
        notifyPropertyChanged(net.mzzo.addatabinding.BR.isAdult);
    }
}
