package uz.train.modelappbookingflights.Dto.responseDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeatResponseDto {
    private Integer seatNumber;
    private double seatPrice;
    private boolean seatStatus;
    private String trainNumber;
    private String trainName;
    private Integer wagonNumber;

}
