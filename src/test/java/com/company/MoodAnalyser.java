package com.company;

public class MoodAnalyser {

    public static String analyseMood() {
        if (" ".contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Mood Analysis Exception Give proper mood");

//            return "HAPPY";
        }
    }
//    public static void main(String[] args) {
//        analyseMood();
//        System.out.println(analyseMood());
//    }
}
