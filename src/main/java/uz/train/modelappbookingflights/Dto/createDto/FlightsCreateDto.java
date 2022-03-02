package uz.train.modelappbookingflights.Dto.createDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightsCreateDto {
    @NotNull
    private String name;
    @NotNull
    private Integer trainId;
    @NotNull
    private LocalDate startTime;
    @NotNull
    private LocalDate entTime;
    @NotNull
    private LocalDate flightDate;

}
