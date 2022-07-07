package az.express.controller;

import az.express.data.dto.request.BalanceRequestDto;
import az.express.data.dto.response.StockResponseDto;
import az.express.service.PaydayTradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/stocks")
public class PaydayTradeController {

    private final PaydayTradeService paydayTradeService;

    @GetMapping(value = "/findAllStocks")
    public ResponseEntity<List<StockResponseDto>> findAll() {
        return ResponseEntity.ok(paydayTradeService.showAllStockWithTheLastPrice());
    }

    @PostMapping(value = "/loadBalance{accountId}")
    public HttpStatus loadBalance(@RequestBody BalanceRequestDto requestDto, @PathVariable Long accountId) {
        paydayTradeService.loadBalance(requestDto, accountId);
        return HttpStatus.OK;
    }

    @PostMapping(value = "/buy-stock/{userId}/{accountId}")
    public HttpStatus buyStock(@RequestBody BalanceRequestDto requestDto, @PathVariable Long userId, @PathVariable Long accountId) {
        paydayTradeService.buyStock(requestDto, userId, accountId);
        return HttpStatus.OK;
    }

    @PostMapping(value = "/sell-stock/{userId}/{accountId}")
    public HttpStatus sellStock(@RequestBody BalanceRequestDto requestDto, @PathVariable Long userId, @PathVariable Long accountId) {
        paydayTradeService.selStock(requestDto, userId, accountId);
        return HttpStatus.OK;
    }
}
