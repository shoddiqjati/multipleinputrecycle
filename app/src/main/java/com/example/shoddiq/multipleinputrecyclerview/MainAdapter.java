package com.example.shoddiq.multipleinputrecyclerview;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by shoddiq on 03/11/17.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyHolder> {
    private Context context;
    private List<String> header;

    MainAdapter(Context context, List<String> header) {
        this.context = context;
        this.header = header;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_view, parent, false);
        return new  MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.tilInput.setHint(header.get(position));
        holder.setIsRecyclable(false);
    }

    @Override
    public int getItemCount() {
        return header.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private TextInputLayout tilInput;
        private TextInputEditText etInput;

        MyHolder(View itemView) {
            super(itemView);
            tilInput = itemView.findViewById(R.id.til_input);
            etInput = itemView.findViewById(R.id.tiet_input);
        }
    }
}
