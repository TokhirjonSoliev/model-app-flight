package uz.train.modelappbookingflights.Dto.responseDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrainResponseDto {
    private String name;
    private String fromCity;
    private String fromStation;
    private String toCity;
    private String toStation;
    private String trainNumber;
    private String countOfWagons;
    private boolean trainStatus;
    private List<String> includeStations;

}
