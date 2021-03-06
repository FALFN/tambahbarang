package com.test.asus.tambahbarang.viewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.test.asus.tambahbarang.R;
import com.test.asus.tambahbarang.modeler.getall.GetResponse;
import com.test.asus.tambahbarang.presenter.MainPresenter;
import com.test.asus.tambahbarang.presenter.MainView;

public class MainActivity extends AppCompatActivity implements MainView {
    EditText a, b;
    Button btn, btn2;
    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.name);
        b = findViewById(R.id.description);
        btn = findViewById(R.id.btn_submit);
        btn2 = findViewById(R.id.btn_lihat);
        mainPresenter = new MainPresenter(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mainPresenter.createItems(a.getText().toString(), b.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(getApplicationContext(), TampilData.class);
                startActivity(x);
            }
        });
    }

    @Override
    public void getSuccess(GetResponse list) {

    }

    @Override
    public void setToast(String message) {
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String errorMessage) {

    }

    @Override
    public void onFailure(String failureMessage) {

    }
}
