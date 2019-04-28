package com.test.asus.tambahbarang.presenter;

import com.test.asus.tambahbarang.modeler.getall.GetResponse;

public interface MainView {
    void getSuccess(GetResponse list);
    void setToast(String message);
    void onError(String errorMessage);
    void onFailure(String failureMessage);
}
