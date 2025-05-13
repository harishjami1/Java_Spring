public class TaxCalc{

public static BigDecimal getInhandAmount(BigDecimal totalAmount)
		{
			if(totalAmount.compareTo(new BigDecimal("1200000"))<0)
			{
				return totalAmount.divide(new BigDecimal(12),2,RoundingMode.HALF_UP);
			}

			BigDecimal totalTax = new BigDecimal(0);
			BigDecimal remainingAmount = new BigDecimal(String.valueOf(totalAmount));
			Integer number =0;
			while (remainingAmount.compareTo(new BigDecimal(0))>0)
			{
				long amountToTax = Math.min(remainingAmount.longValue(),new BigDecimal(400000).longValue());
				totalTax = totalTax.add(new BigDecimal(number*5).multiply(new BigDecimal(amountToTax)).divide(new BigDecimal(100)));
				remainingAmount=remainingAmount.subtract(new BigDecimal(400000));
				if(number<6)
					number++;
			}
			return totalAmount.subtract(totalTax).divide(new BigDecimal(12),2,RoundingMode.HALF_UP);


		}

}
