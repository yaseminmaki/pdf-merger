/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdfmerger;

/**
 *
 * @author SONY
 */
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
  
import java.io.File;
import java.io.IOException;

public class PDFMerger {
 public static void main(String[] args) throws IOException {
        // Create a new PDFMergerUtility object
        PDFMergerUtility merger = new PDFMergerUtility();

        // Add the source PDF files to be merged
        merger.addSource(new File("C:\\Users\\SONY\\Downloads\\laplace_tablosu.pdf"));
        merger.addSource(new File("C:\\Users\\SONY\\Downloads\\dif1_2014-15-final.pdf"));
        //merger.addSource(new File("file3.pdf"));

        // Set the destination file name for the merged PDF
        merger.setDestinationFileName("merged.pdf");

        // Merge the PDF files
        merger.mergeDocuments(null);

        // Print a message indicating that the merge was successful
        System.out.println("PDF files merged successfully.");
    }}