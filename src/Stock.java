

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public void setCurrntPrice(double Current){
        this.currentPrice = Current;
    }

    public static void main(String[] args) {
        Stock oracleStock = new Stock("ORCL", "Oracle Corporation");
        oracleStock.setPreviousClosingPrice(34.5);
        oracleStock.setCurrntPrice(34.35);
        System.out.println("Previous Closing Price: " + oracleStock.previousClosingPrice);
        System.out.println("Current Price: " + oracleStock.currentPrice);
        System.out.println("Price Change: " + oracleStock.getChangePercent() + "%");
    }
}
