package org.scoula;

import com.opencsv.bean.CsvToBeanBuilder;
import org.scoula.travel.domain.TravelVO;

import java.io.FileReader;
import java.util.List;

public class CSVTest2 {
    public static void main(String[] args) throws Exception{
        List<TravelVO> travellist = new CsvToBeanBuilder<TravelVO>(new FileReader("travel.csv"))
                .withType(TravelVO.class)
                .build()
                .parse();

        travellist.forEach(System.out::println);

    }
}
