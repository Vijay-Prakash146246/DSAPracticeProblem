package com.test.helper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.model.Tutorial;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.web.multipart.MultipartFile;

public class CSVHelper {
    public static String TYPE = "text/csv";
    static String[] HEADERs = { "Id", "Title", "Description", "Published" };

    public static boolean hasCSVFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<Tutorial> csvToTutorials(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<Tutorial> tutorials = new ArrayList<Tutorial>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
                Tutorial tutorial = new Tutorial(
                        Long.parseLong(csvRecord.get("Id")),
//                        csvRecord.get("Title"),
//                        csvRecord.get("Description"),
//                        Boolean.parseBoolean(csvRecord.get("Published"))
                       // csvRecord.get("Service_Order_Number"),
                        csvRecord.get("Job_Position"),
                        csvRecord.get("Job_Description"),
                        csvRecord.get("Hiring_Company_Name"),
                        csvRecord.get("Recruiting_Company_Name"),
                        csvRecord.get("Hiring_Manager_ID"),
                        csvRecord.get("Hiring_Manager_Name"),
                        csvRecord.get("Candidate_Source"),
                        csvRecord.get("Candidate_Source"),
                        csvRecord.get("Referee_Name"),
                        csvRecord.get("Candidate_ID"),
                        csvRecord.get("Candidate_Name"),
                        csvRecord.get("Candidate_Mobile_Number"),
                        csvRecord.get("Candidate_Email")
                );

                tutorials.add(tutorial);
            }

            return tutorials;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }

    public static ByteArrayInputStream tutorialsToCSV(List<Tutorial> tutorials) {
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
            for (Tutorial tutorial : tutorials) {
                List<String> data = Arrays.asList(
                        String.valueOf(tutorial.getId()),
//                        tutorial.getTitle(),
//                        tutorial.getDescription(),
//                        String.valueOf(tutorial.isPublished())
                        /*


                        csvRecord.get("Hiring_Manager_Name"),
                        csvRecord.get("Candidate_Source"),
                        csvRecord.get("Candidate_Source"),
                        csvRecord.get("Referee_Name"),
                        csvRecord.get("Candidate_ID"),
                        csvRecord.get("Candidate_Name"),
                        csvRecord.get("Candidate_Mobile_Number"),
                        csvRecord.get("Candidate_Email")
                        */

                        tutorial.getService_Order_Number(),
                        tutorial.getJob_Position(),
                        tutorial.getJob_Description(),
                        tutorial.getHiring_Company_Name(),
                        tutorial.getRecruiting_Company_Name(),
                        tutorial.getHiring_Manager_ID()

                );

                csvPrinter.printRecord(data);
            }

            csvPrinter.flush();
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
        }
    }

}
