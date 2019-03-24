package com.lsm.recyclerviewtype;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TypeOneViewHolder extends BaseViewHolder<DataModel> {
    public ImageView avatar;
    public TextView name;

    public TypeOneViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        itemView.setBackgroundColor(Color.GRAY);
    }
    @Override
    public void bindHolder(DataModel model){
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
    }
}
