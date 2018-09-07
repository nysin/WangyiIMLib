package com.helijia.wangyiyun.lib.testact;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * packagename com.helijia.wangyiyun.lib.testact
 *
 * @author tanglang
 */
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.layout_test);
        setContentView(new TextView(this.getApplicationContext()));
    }

}
