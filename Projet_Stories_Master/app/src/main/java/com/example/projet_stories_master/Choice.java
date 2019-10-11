package com.example.projet_stories_master;

public class Choice {
    private String mText; //The text that will show on the button
    private int mNextPage; //mNextPage store the Next com.example.gamebook1.ui.main.Page number If a user click on this button then which story should load?

    public Choice(String text, int nextPage) { //Constructor
        mText = text;
        mNextPage = nextPage;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public int getmNextPage() {
        return mNextPage;
    }

    public void setmNextPage(int mNextPage) {
        this.mNextPage = mNextPage;
    }
}
