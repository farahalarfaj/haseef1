package com.example.haseef4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerView_config {
    private Context mContext;
private StaffsAdapter mstaffsAdapter;

public void setConfig(RecyclerView recyclerView,Context context, List<staff> staffs,List<String> keys){
    mContext=context;
    mstaffsAdapter=new StaffsAdapter (staffs,keys);
    recyclerView.setLayoutManager(new LinearLayoutManager(context));
    recyclerView.setAdapter(mstaffsAdapter);

}

    class StaffItemView extends RecyclerView.ViewHolder {
        private TextView mName;
        private TextView mAge;
        private TextView mWorkingsince;
        private TextView mLocation;
        private TextView mstaffID;
        private String key;

        public StaffItemView(ViewGroup parent){
            super(LayoutInflater.from(mContext).
                    inflate(R.layout.stafflestitem,parent,false));

            mName=(TextView) itemView.findViewById(R.id.staffName);
            mAge=(TextView) itemView.findViewById(R.id.staffAge);
            mWorkingsince=(TextView) itemView.findViewById(R.id.staffWorkingsince);
            mLocation=(TextView) itemView.findViewById(R.id.staffLocation);
            mstaffID=(TextView) itemView.findViewById(R.id.staffID);

        }
        public void bind (staff Staff,String key){
            mName.setText(Staff.getstaffName());
            mAge.setText(Staff.getage());
            mWorkingsince.setText(Staff.getworking_since());
            mLocation.setText(Staff.getlocation());
            mstaffID.setText(Staff.getStaffID());
            this.key=key;

        }
    }
    class StaffsAdapter extends RecyclerView.Adapter<StaffItemView>{
        private List<staff> mstaffList;
        private List<String> mKeys;

        public StaffsAdapter (List<staff> mstaffList, List<String> mKeys){
            this.mstaffList=mstaffList;
            this.mKeys=mKeys;
        }

        @NonNull
        @Override
        public StaffItemView onCreateViewHolder( ViewGroup parent, int viewType) {
            return new StaffItemView(parent);
        }

        @Override
        public void onBindViewHolder( StaffItemView holder, int position) {
            holder.bind(mstaffList.get(position) , mKeys.get(position));
        }

        @Override
        public int getItemCount() {
            return mstaffList.size();
        }
    }
}
