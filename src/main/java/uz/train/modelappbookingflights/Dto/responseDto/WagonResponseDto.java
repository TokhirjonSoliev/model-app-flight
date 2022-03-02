package uz.train.modelappbookingflights.Dto.responseDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WagonResponseDto {
    private Integer wagonNumber;
    private Integer maxSeats;
    private Integer countOfSeats;
    private boolean wagonStatus;
    private String trainName;
    private String trainNumber;

}
