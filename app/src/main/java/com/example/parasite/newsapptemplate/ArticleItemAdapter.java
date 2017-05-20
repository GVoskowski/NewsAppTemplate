package com.example.parasite.newsapptemplate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Parasite on 19-May-17.
 */

@SuppressWarnings("ALL")
class ArticleItemAdapter extends ArrayAdapter<ArticleItem> {


    public ArticleItemAdapter(@NonNull Context context, @NonNull List<ArticleItem> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        ViewHolderItem viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);

            viewHolder = new ViewHolderItem();
            viewHolder.title = (TextView) convertView.findViewById(R.id.article_title);
            viewHolder.category = (TextView) convertView.findViewById(R.id.article_category);
            viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.article_thumbnail);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolderItem) convertView.getTag();
        }


        ArticleItem currentItem = getItem(position);
        if (currentItem != null) {
            viewHolder.title.setText(currentItem.getWebTitle());
            viewHolder.category.setText(currentItem.getSectionName());
            viewHolder.thumbnail.setImageDrawable(currentItem.getArticleThumbnail());


        }
        return convertView;
    }

    private static class ViewHolderItem {
        TextView title;
        TextView category;
        ImageView thumbnail;
    }


}

