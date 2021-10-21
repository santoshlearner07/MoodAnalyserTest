package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = MoodAnalyser.analyseMood("I am in SAD mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a HAPPY message");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMoodReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void whenCalled_WithoutParam_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = MoodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void whenCalled_WithoutParam_ReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = MoodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
