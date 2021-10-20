package com.company;

public class MoodAnalyser {
    public String analysemood(String message) {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
