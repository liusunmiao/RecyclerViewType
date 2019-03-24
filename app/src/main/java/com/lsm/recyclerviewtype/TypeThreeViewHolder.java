package com.lsm.recyclerviewtype;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TypeThreeViewHolder extends BaseViewHolder<DataModel> {
    public ImageView avatar;
    public TextView name;
    public TextView content;
    public ImageView avatarRightIcon;

    public TypeThreeViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        content = itemView.findViewById(R.id.content);
        avatarRightIcon = itemView.findViewById(R.id.avatar_right);
        itemView.setBackgroundColor(Color.GREEN);
    }

    @Override
    public void bindHolder(DataModel model) {
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
        content.setText(model.content);
        avatarRightIcon.setBackgroundResource(model.contentColor);
    }
}
