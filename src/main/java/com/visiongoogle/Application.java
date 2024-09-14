package com.visiongoogle;

import java.io.PrintStream;

public class Application {

    public static void main(String[] args) {

        System.out.println("Trying the google cloud vision api");
        try {
//            Vision.detectDocumentsGcs("gs://simple-pdf-soruce/pdf-test.pdf","gs://simple-pdf-destination/response/");
            Vision.detectText(Application.class.getResource("/pdf-test.pdf").getPath(), new PrintStream("W:\\_dev\\_isen\\PocGoogleVision/result1.txt"));

        }catch (Exception e){
            System.out.println("Exception -> "+ e.getMessage());
        }
    }





}
