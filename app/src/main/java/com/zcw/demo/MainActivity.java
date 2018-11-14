package com.zcw.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        findViewById(R.id.btn_slide_listView).setOnClickListener(listener);
    }

    private Intent getIntent(Class<?> cls) {
        return new Intent(MainActivity.this, cls);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_slide_listView:
                    startActivity(getIntent(SlideDeleteActivity.class));
                    break;
            }
        }
    };
}
