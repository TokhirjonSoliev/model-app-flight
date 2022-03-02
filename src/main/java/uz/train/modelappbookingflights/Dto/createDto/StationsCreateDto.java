package uz.train.modelappbookingflights.Dto.createDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StationsCreateDto {
    @NotNull
    private String name;
    @NotNull
    private String details;

}
