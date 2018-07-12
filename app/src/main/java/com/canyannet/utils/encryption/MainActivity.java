package com.canyannet.utils.encryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RSAUtils.getPublicKey("54f5sf5s5af5sf54s6f46s4f6sa4f684");
    }
}
