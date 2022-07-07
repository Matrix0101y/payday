package az.express.data.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class StockResponseDto implements Serializable {
    private String stockName;
    private Double latestPrice;
}
