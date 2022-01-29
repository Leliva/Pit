import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

import java.math.BigDecimal;
import java.util.Date;

public class DaneCsv {

    @CsvDate(value ="yyyy-MM-dd" )
    @CsvBindByPosition(position = 0)
    Date operationDate;

    @CsvBindByPosition(position = 3)
    String category;

    @CsvBindByPosition(position = 4)
    private String amount;

    public BigDecimal getAmount() {

        String toBeReplaced = amount
                .replaceAll("\\s", "")
                .replaceAll("PLN", "")
                .replace(",",".");

        return new BigDecimal(toBeReplaced);
    }

    @Override
    public String toString() {
        return "DaneCsv{" +
                "operationDate: '" + operationDate + '\'' +
                ", kategoria: '" + category + '\'' +
                ", Kwota='" + getAmount() + '\'' +
                '}';
    }
}
