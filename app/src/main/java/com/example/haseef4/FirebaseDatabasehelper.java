package com.example.haseef4;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FirebaseDatabasehelper {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mRefrencestaffs;
    private List<staff> staffs=new ArrayList<>();

    public interface DataStatus{
        void DataIsLoaded(List<staff> staffs,List<String> keys);
        void DataIsInserted();
        void DataIsUpdated();
        void DataIsDeleted();
    }

    public FirebaseDatabasehelper( ) {
        mDatabase=FirebaseDatabase.getInstance();
        mRefrencestaffs=mDatabase.getReference("staff");
    }
    public void readstaffs(final DataStatus dataStatus){
        mRefrencestaffs.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                staffs.clear();
                List<String> keys =new ArrayList<>();
                for(DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    staff Staff=keyNode.getValue(staff.class);
                    staffs.add(Staff);
                }
                dataStatus.DataIsLoaded(staffs,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
