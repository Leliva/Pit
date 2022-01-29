import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvMaper {
    void metCsv() {
        String fileName = "C:\\Users\\jkorc\\OneDrive\\Desktop\\CSVKI\\pit5l.csv";

        List<DaneCsv> beans = null;
        try {
            beans = new CsvToBeanBuilder(new FileReader(fileName))
                    .withType(DaneCsv.class)
                    .withSeparator(';')
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        beans.forEach(System.out::println);

    }
}
