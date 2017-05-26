package com.neelam.venkatesh.intentswork;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mbutton;
    private EditText mSearchEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton = (Button) findViewById(R.id.button1);
        mSearchEt = (EditText) findViewById(R.id.et_search);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchKey = mSearchEt.getText().toString();

                startMySearch(searchKey);
            }

        });
    }
    private void startMySearch(String searchKey) {

        Intent intent = new Intent (Intent.ACTION_SEARCH);
        intent.putExtra (SearchManager.QUERY, searchKey);
        Uri.parse("www.google.com");
        startActivity(intent);

    }
}