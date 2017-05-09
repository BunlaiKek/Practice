package kh.edu.kekbunlai.rupp.fe.myapplication.Adapter;

/**
 * Created by Kek Bunlai on 26-Apr-17.
 */

public class Document {
    public Document(String title, String thumNailUrl, int size) {
        this.title = title;
        this.thumNailUrl = thumNailUrl;
        this.size = size;
    }

    private String title;
    private String thumNailUrl;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumNailUrl() {
        return thumNailUrl;
    }

    public void setThumNailUrl(String thumNailUrl) {
        this.thumNailUrl = thumNailUrl;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size;

}
