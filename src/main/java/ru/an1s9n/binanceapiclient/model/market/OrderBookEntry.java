package ru.an1s9n.binanceapiclient.model.market;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class OrderBookEntry {
  private BigDecimal price;
  private BigDecimal qty;
}
