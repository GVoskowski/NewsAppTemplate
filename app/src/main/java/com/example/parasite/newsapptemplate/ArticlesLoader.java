package com.example.parasite.newsapptemplate;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Parasite on 19-May-17.
 */

@SuppressWarnings("ALL")
class ArticlesLoader extends AsyncTaskLoader<List<ArticleItem>> {
    private static final String LOG_TAG = ArticlesLoader.class.getName();
    private final String mUrl;

    public ArticlesLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, " onStartLoading,called");
        forceLoad();
    }

    @Override
    public List<ArticleItem> loadInBackground() {
        Log.i(LOG_TAG, " loadInBackground,called");
        if (mUrl == null) {
            return null;
        }
        return QueryUtils.fetchArticleData(mUrl);
    }

}
