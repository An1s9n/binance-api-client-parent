package ru.an1s9n.binanceapiclient.model.market;

import lombok.Data;

import java.util.List;

@Data
public class OrderBook {

  private Long lastUpdateId;
  private List<OrderBookEntry> bids;
  private List<OrderBookEntry> asks;

}
