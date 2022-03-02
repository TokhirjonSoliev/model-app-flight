package uz.train.modelappbookingflights.Dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StationsResponseDto {
    private Integer cityNumber;
    private String cityName;
    private String stationName;
    private String details;
}
