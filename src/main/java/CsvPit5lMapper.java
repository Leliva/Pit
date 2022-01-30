import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvPit5lMapper {

    void parserCsv(String fileName) {

        try {
            List<DaneCsvPit5l> beans = new CsvToBeanBuilder(new FileReader(fileName))
                    .withType(DaneCsvPit5l.class)
                    .withSeparator(';')
                    .build()
                    .parse();

            beans.forEach(System.out::println);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
