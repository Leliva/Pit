import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvMapper {

    void parserCsv() {
        String fileName = "C:\\Users\\jkorc\\OneDrive\\Desktop\\CSVKI\\pit5l.csv";
        try {
            List<DaneCsv> beans = new CsvToBeanBuilder(new FileReader(fileName))
                    .withType(DaneCsv.class)
                    .withSeparator(';')
                    .build()
                    .parse();

            beans.forEach(System.out::println);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
