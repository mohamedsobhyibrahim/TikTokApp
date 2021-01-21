package com.sobhy.tiktokapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videoViewPager = findViewById(R.id.videoViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItem1 = new VideoItem();
        videoItem1.videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";
        videoItem1.videoTitle = " Big Buck Bunny";
        videoItem1.videoDescription = "Big Buck Bunny tells the story of a giant rabbit with a heart bigger than himself. When one sunny day three rodents rudely harass him, something snaps";
        videoItems.add(videoItem1);

        VideoItem videoItem2 = new VideoItem();
        videoItem2.videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4";
        videoItem2.videoTitle = " Elephant Dream";
        videoItem2.videoDescription = "The first Blender Open Movie from 2006";
        videoItems.add(videoItem2);

        VideoItem videoItem3 = new VideoItem();
        videoItem3.videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4";
        videoItem3.videoTitle = " For Bigger Blazes";
        videoItem3.videoDescription = "HBO GO now works with Chromecast -- the easiest way to enjoy online video on your TV. For when you want to settle into your Iron Throne to watch the latest episodes";
        videoItems.add(videoItem3);

        VideoItem videoItem4 = new VideoItem();
        videoItem4.videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4";
        videoItem4.videoTitle = " For Bigger Escape";
        videoItem4.videoDescription = "Introducing Chromecast. The easiest way to enjoy online video and music on your TV—for when Batman's escapes aren't quite big enough";
        videoItems.add(videoItem4);

        VideoItem videoItem5 = new VideoItem();
        videoItem5.videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4";
        videoItem5.videoTitle = " For Bigger Fun";
        videoItem5.videoDescription = "Introducing Chromecast. The easiest way to enjoy online video and music on your TV";
        videoItems.add(videoItem5);

        VideoItem videoItem6 = new VideoItem();
        videoItem6.videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerJoyrides.mp4";
        videoItem6.videoTitle = " For Bigger Joyrides";
        videoItem6.videoDescription = "Introducing Chromecast. The easiest way to enjoy online video and music on your TV—for the times that call for bigger joyrides.";
        videoItems.add(videoItem6);

        VideoItem videoItem7 = new VideoItem();
        videoItem7.videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4";
        videoItem7.videoTitle = " For Bigger Meltdowns";
        videoItem7.videoDescription = "\"Introducing Chromecast. The easiest way to enjoy online video and music on your TV—for the times that call for bigger joyrides.";
        videoItems.add(videoItem7);

        videoViewPager.setAdapter(new VideoAdapter(videoItems));

    }
}