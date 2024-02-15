// Data Access Component
public interface SharePriceDao {

List<SharePrice> getSharePrices(String symbol, LocalDate startDate, LocalDate endDate);

void saveSharePrices(List<SharePrice> sharePrices);
}

// Charting Component
public interface ChartingService {

Chart generateChart(List<SharePrice> sharePrices);

Chart compareCharts(List<SharePrice> sharePrices1, List<SharePrice> sharePrices2);
}

// User Interface Component
public class SharePriceComparisonApp {

private SharePriceDao sharePriceDao;
private ChartingService chartingService;

public SharePriceComparisonApp(SharePriceDao sharePriceDao, ChartingService chartingService) {
this.sharePriceDao = sharePriceDao;
this.chartingService = chartingService;
}

// Data Model Component
public class SharePrice {

private String symbol;
private LocalDate date;
private double price;
}

// Service Layer Component
public class SharePriceComparisonService {

private SharePriceDao sharePriceDao;
private ChartingService chartingService;

public SharePriceComparisonService(SharePriceDao sharePriceDao, ChartingService chartingService) {
this.sharePriceDao = sharePriceDao;
this.chartingService = chartingService;
}
}

