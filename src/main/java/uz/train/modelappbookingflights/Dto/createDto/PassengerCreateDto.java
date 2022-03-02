package uz.train.modelappbookingflights.Dto.createDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PassengerCreateDto {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String patronymic;
    @NotNull
    private String gender;
    @NotNull
    private LocalDate birthday;
    @NotNull
    private String passport;
    @NotNull
    private UUID userId;

}
