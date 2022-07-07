package az.express.data.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class BalanceRequestDto implements Serializable {
    private Double amount;
}
