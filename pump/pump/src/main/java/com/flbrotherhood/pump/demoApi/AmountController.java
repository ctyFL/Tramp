package com.flbrotherhood.pump.demoApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author ctyFL
 * @date 2020年5月24日
 */
@RestController
public class AmountController {
	
	@Autowired
	private AmountConfig amountConfig;
	
	@GetMapping({"/amountConfig", "/moneyConfig"})
	private String getAmountConfig() {
		return amountConfig.getRemark();
	}

}
