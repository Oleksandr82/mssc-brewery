package guru.springframework.msscbrewery.domain;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Null
    private UUID id;

    @NotBlank
    @Min(3)
    @Max(100)
    private String name;
}
