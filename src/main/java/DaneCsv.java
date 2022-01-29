import com.opencsv.bean.CsvBindByPosition;

public class DaneCsv {
    @CsvBindByPosition(position = 0)
    String operationDate;

    @CsvBindByPosition(position = 3)
    String kategoria;

    @CsvBindByPosition(position = 4)
    String Kwota;

    @Override
    public String toString() {
        return "DaneCsv{" +
                "operationDate: '" + operationDate + '\'' +
                ", kategoria: '" + kategoria + '\'' +
                ", Kwota='" + Kwota + '\'' +
                '}';
    }
}
