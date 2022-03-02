package uz.train.modelappbookingflights.Dto.createDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WagonCreateDto {
    @NotNull
    private Integer wagonNumber;
    @NotNull
    private Integer maxSeats;
    @NotNull
    private Integer countOfSeats;
    @NotNull
    private Integer wagonStatus;

}
