package id.co.blogspot.wimsonevel.android_moviedb.util;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Wim on 5/29/17.
 */

public abstract class EndlessRecyclerOnScrollListener extends RecyclerView.OnScrollListener {

    private int previousTotal = 0;
    private boolean loading = true;
    private int visibleThreshold = 1;
    int firstVisibleItem, visibleItemCount, totalItemCount;

    private int offset = 0;
    private int limit = 0;

    private RecyclerView.LayoutManager mLayoutManager;
    private boolean isUseLinearLayoutManager = false;

    public EndlessRecyclerOnScrollListener(LinearLayoutManager linearLayoutManager, int offset, int limit) {
        this.mLayoutManager = linearLayoutManager;
        isUseLinearLayoutManager = true;
        this.offset = offset;
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        if (isUseLinearLayoutManager && mLayoutManager instanceof LinearLayoutManager) {
            firstVisibleItem = ((LinearLayoutManager) mLayoutManager).findFirstVisibleItemPosition();
        }

        visibleItemCount = mLayoutManager.getChildCount();
        totalItemCount = mLayoutManager.getItemCount();

        if (loading) {
            if (totalItemCount > previousTotal) {
                loading = false;
                previousTotal = totalItemCount;
            }
        }
        if (!loading && (totalItemCount - visibleItemCount)
                <= (firstVisibleItem + visibleThreshold)
                && totalItemCount >= limit) {
            // End has been reached

            // Do something
            offset++;
            onLoadMore(offset);

            loading = true;
        }
    }

    public abstract void onLoadMore(int offset);
}
