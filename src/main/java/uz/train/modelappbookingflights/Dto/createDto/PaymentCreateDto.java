package uz.train.modelappbookingflights.Dto.createDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentCreateDto {
    @NotNull
    private String name;
    @NotNull
    private String cardNumber;
    @NotNull
    private String expiryDate;
    @NotNull
    private LocalDate issuedDate;

}
