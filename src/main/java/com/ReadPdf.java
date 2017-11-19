package com;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class ReadPdf {

    public static void main(String[] args) throws IOException {

        try (PDDocument document = PDDocument.load(new File("src/main/ressources/pdf/brocheTarifaireBouygues.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()) {

                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

                // split by whitespace
                //String lines[] = pdfFileInText.split("\\r?\\n");
                String lines[] = pdfFileInText.split("\\n");
                System.out.println(lines[12]);
                System.out.println(lines[12+10]);
                //     String prix=lines[12].toString();
                //String lines[] = pdfFileInText.split("\\n");
         /*     System.out.println( String.format("Name : %s Url : %s Price :", lines[12], lines[8]));
                System.out.print(lines[12].charAt(0));
                System.out.print("s");
                System.out.print(lines[12].charAt(1));
                System.out.print(lines[12].charAt(2));
                System.out.print(lines[12].charAt(3));
                System.out.print(lines[12].charAt(4));
                System.out.print(lines[12].charAt(5));*/
                //  System.out.println(lines[12].charAt(6));
                // System.out.println(lines[12]);
                // String prix=lines[12].toString();
                //System.out.println("|"+lines[12]+"|");
                // System.out.print("ds") ;
                //  System.out.print(lines[12]);
                //     .toString()+"|");
               //  System.out.println("ici");


              /*  for (String line : lines) {
                    System.out.println(line);
                }*/
               /* for (String line : lines) {
                   // if (line.equals("50 Go")){
                    if (line.contains("50 Go")){
                    System.out.println(line);}*/


            }

        }

    }
}