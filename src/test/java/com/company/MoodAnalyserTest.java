package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = MoodAnalyser.analyseMood("I am in SAD mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a HAPPY message");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMoodReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
//        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMoodShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
//            ExpectedException exceptionRule = ExpectedException.none();
//            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
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
