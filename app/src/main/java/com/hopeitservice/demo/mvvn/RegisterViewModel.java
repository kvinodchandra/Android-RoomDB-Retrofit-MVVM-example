package com.hopeitservice.demo.mvvn;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
//import androidx.databinding.library.baseAdapters.BR;


public class RegisterViewModel extends BaseObservable {

    private RegModel model;


    private String successMsg = "Success";
    private String errorMsg = "Failed";

    @Bindable
    private String toastMsg = null;


    public void setToastMsg(String toastMsg) {
        this.toastMsg = toastMsg;
       // notifyPropertyChanged(BR.toastMsg);
    }

    public String getToastMsg() {
        return toastMsg;
    }

    public void setMEmail(String email){
        model.setEmail(email);
        //notifyPropertyChanged(BR.mEmail);
    }

    @Bindable
    public String getMEmail(){
        return model.getEmail();
    }

    public void setMName(String name){
        model.setName(name);
        //notifyPropertyChanged(BR.mName);
    }

    @Bindable
    public String getMName(){
        return model.getName();
    }

    public void setMPassword(String password){
        model.setPassword(password);
        //notifyPropertyChanged(BR.mPassword);
    }

    @Bindable
    public String getMPassword(){
        return model.getPassword();
    }

    public RegisterViewModel() {
        model = new RegModel("", "", "");
    }

    public void onClickSubmit(){
        if (isValid()){
            setToastMsg(successMsg);
        }else {
            setToastMsg(errorMsg);
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(getMEmail()) && !TextUtils.isEmpty(getMPassword()) && !TextUtils.isEmpty(getMName());
    }
}
