package com.example.projet_stories_master;

public class Story { //Here we use previously made model class and store our story and navigate through functionality.
    private Page[] mPages;

    public Story() {
        mPages = new Page[5]; //Suppose I have 5 story.So I made 5 array of Page.java

        mPages[0] = new Page(
                "Story 1",
                new Choice("Navigate to the story 1", 1),
                new Choice("Navigate to the story 2", 2));

        mPages[1] = new Page(
                "Story 2",
                new Choice("Navigate to the story 3", 3),
                new Choice("Navigate to the story 4", 4));

        mPages[2] = new Page(
                "Story 3",
                new Choice("Navigate to the story 4", 4),
                new Choice("Navigate to the story 6", 6));

        mPages[3] = new Page(
                "Story 4",
                new Choice("Navigate to the story 4", 4),
                new Choice("5", 5));

        mPages[4] = new Page(
                "Story 5",
                new Choice("Navigate to the story 5", 5),
                new Choice("Navigate to the story 6", 6));
    }
    public Page getPage(int pageNumber) {
        return mPages[pageNumber]; //This method will called in MainActivity1 to get the appropriate Page Object.
         }
}