package kata4.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        String fileName = "email.txt";
        
        List<Mail> mailList;
        MailListReader reader = new MailListReader();
        MailHistogramBuilder builder = new MailHistogramBuilder();
        
        mailList = reader.read(fileName);
        
        Histogram<String> histogram = builder.build(mailList);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
