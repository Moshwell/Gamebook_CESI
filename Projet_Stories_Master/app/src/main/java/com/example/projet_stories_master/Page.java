package com.example.projet_stories_master;

public class Page {
    private String mText; //Store the Story
    private Choice mChoice1; //Remember in our Choice.java class.
    private Choice mChoice2; //Remember in our Choice.java class.
    public Page(String text, Choice choice1, Choice choice2) {
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public Choice getmChoice1() {
        return mChoice1;
    }

    public void setmChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public Choice getmChoice2() {
        return mChoice2;
    }

    public void setmChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }

}