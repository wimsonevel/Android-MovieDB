package id.co.blogspot.wimsonevel.android_moviedb.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wim on 5/29/17.
 */

public class Movie extends BaseModel<MovieData> {

    @SerializedName("total_results")
    private int totalResult;
    @SerializedName("total_pages")
    private int totalPages;

    public Movie() {
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
