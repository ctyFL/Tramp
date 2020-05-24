package com.flbrotherhood.pump.demoApi;

import java.math.BigDecimal;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * @author ctyFL
 * @date 2020年5月24日
 */
@Component
@ConfigurationProperties(prefix = "amount-config")
public class AmountConfig {

	private BigDecimal minAmount;
	
	private BigDecimal maxAmount;
	
	private String remark;

	public BigDecimal getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(BigDecimal minAmount) {
		this.minAmount = minAmount;
	}

	public BigDecimal getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(BigDecimal maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
