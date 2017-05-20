package com.example.parasite.newsapptemplate;

import android.graphics.drawable.Drawable;

/**
 * Created by Parasite on 19-May-17.
 */

@SuppressWarnings("DefaultFileTemplate")
class ArticleItem {

    private final String mWebTitle;
    private final String mSectionName;
    private final Drawable mArticleThumbnail;
    private final String mUrl;

    public ArticleItem(String webTitle, String sectionName, Drawable articleThumbnail, String url) {
        mWebTitle = webTitle;
        mSectionName = sectionName;
        mArticleThumbnail = articleThumbnail;
        mUrl = url;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public Drawable getArticleThumbnail() {
        return mArticleThumbnail;
    }

    public String getUrl() {
        return mUrl;
    }
}
