package com.example.haseef4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class staff1 extends AppCompatActivity {
private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff1);
mRecyclerView=(RecyclerView) findViewById(R.id.recyclerview);
new FirebaseDatabasehelper().readstaffs(new FirebaseDatabasehelper.DataStatus() {
    @Override
    public void DataIsLoaded(List<staff> staffs, List<String> keys) {
        new RecyclerView_config().setConfig(mRecyclerView,staff1.this, staffs, keys);
    }

    @Override
    public void DataIsInserted() {

    }

    @Override
    public void DataIsUpdated() {

    }

    @Override
    public void DataIsDeleted() {

    }
});
    }
}