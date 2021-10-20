package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analysemood("I am in SAD mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analysemood("This is a happy message");
        Assert.assertEquals("HAPPY",mood);
    }
}
