package com.example.administrator.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2017/11/13.
 */

public class ContactsActivity extends AppCompatActivity{
    private String[] data={"何进","赵晓","王雪","曲小轩","肖潇","麦子","欧阳文雪","韩晓玉","吴正","钟清","江翔","万书颜","李丽丽","Alic","Dive"
    };
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                ContactsActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
