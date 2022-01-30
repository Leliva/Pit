import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

import java.math.BigDecimal;
import java.util.Date;

public class DaneCsvPit5l {

    @CsvDate(value ="yyyy-MM-dd" )
    @CsvBindByPosition(position = 0)
    Date operationDate;

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
                ", Kwota='" + getAmount() + '\'' +
                '}';
    }
}
