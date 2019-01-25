package com.himanshflashchat.flashchatnewfirebase;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class ChatListAdapter extends BaseAdapter {
    private Activity mActivity;
    private DatabaseReference mDatabaseReference;
    private String mDisplayname;
    private ArrayList<DataSnapshot> mSnapshotArrayList;
    public ChatListAdapter(Activity activity, DatabaseReference ref, String author){
        mActivity = activity;
        mDisplayname = author;
        mDatabaseReference = ref.child("messages");
        mSnapshotArrayList = new ArrayList<>();
    }
    public class ViewHolder{
        TextView author;
        TextView body;
        LinearLayout.LayoutParams params;
    }
    @Override
    public int getCount() {

        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater)mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.chat_msg_row,parent,false);
            final ViewHolder holder = new ViewHolder();
            holder.author = (TextView)convertView.findViewById(R.id.author);
            holder.body = (TextView)convertView.findViewById(R.id.message);

        }
        return null;
    }
}
