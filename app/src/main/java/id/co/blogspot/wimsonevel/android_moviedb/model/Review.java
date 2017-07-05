package id.co.blogspot.wimsonevel.android_moviedb.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wim on 5/29/17.
 */

public class Review extends BaseModel<ReviewData> {

    @SerializedName("id")
    private int id;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("total_results")
    private int totalResults;

    public Review() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
