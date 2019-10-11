package com.example.projet_stories_master;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity1 extends Activity{
    private Story mStory = new Story();
    private TextView mTextView;
    private ImageView mImageView;
    private Button mChoice1;
    private Button mChoice2;
    private Page mCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView)findViewById(R.id.storyImageView);
        mTextView = (TextView)findViewById(R.id.storyTextView);
        mChoice1 = (Button)findViewById(R.id.choiceButton1);
        mChoice2 = (Button)findViewById(R.id.choiceButton2);

        loadPage(0);//When we launched our app it will show the story of **mPages[0]**
    }
    private void loadPage(int choice) {
        mCurrentPage = mStory.getPage(choice);

        String pageText = mCurrentPage.getmText();
        mTextView.setText(pageText);
        mChoice1.setText(mCurrentPage.getmChoice1().getmText());
        mChoice2.setText(mCurrentPage.getmChoice2().getmText());

        //Now we are setting onClickListenere For each button and replace the story with new story

        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = mCurrentPage.getmChoice1().getmNextPage();//getting which next story
                loadPage(nextPage);// and replace with old story
            }
        });

        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = mCurrentPage.getmChoice1().getmNextPage();
                loadPage(nextPage);
            }
        });
    }

}
