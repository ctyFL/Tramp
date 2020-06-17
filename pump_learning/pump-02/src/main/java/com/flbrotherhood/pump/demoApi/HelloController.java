package com.flbrotherhood.pump.demoApi;
/**
 * @author ctyFL
 * @date 2020年5月24日
 */
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Value("${minMoney}")
	private BigDecimal minMoney;
	
	@Value("${description}")
	private String description;
	
	/**此方法仅支持GET方式请求*/
	@GetMapping({"/sayg", "/hig"})
	public String sayByget() {
		return "（GET）minMoney:" + minMoney + "，" + description;
	}

	/**此方法仅支持POST方式请求*/
	@PostMapping({"/sayp", "/hip"})
	public String sayBypost() {
		return "（POST）minMoney:" + minMoney + "，" + description;
	}
	
	/**此方法支持GET也支持POST*/
	@RequestMapping({"/say", "/hi"})
	public String say() {
		return "minMoney:" + minMoney + "，" + description;
	}
	
	/**
	 * GET传参数方法1 url/100
	 * @param id
	 * @return
	 */
	@GetMapping("/saywithparambygetpath/{id}")
	public String sayWithParamByGetPath(@PathVariable("id") Integer id) {
		return "path参数为：id=" + id;
	}
	
	/**
	 * GET传参数方法2 url?id=100
	 * （参数必传，否则会报错）
	 * @param id
	 * @return
	 */
	@GetMapping("/saywithparambygetreqmust")
	public String sayWithParamByGetReqMust(@RequestParam("id") Integer id) {
		return "req参数必传，参数为：id=" + id;
	}
	
	/**
	 * GET传参数方法2.1 url?id=100
	 * （设置参数非必传，并设置默认参数）
	 * @param id
	 * @return
	 */
	@GetMapping("/saywithparambygetreq")
	public String sayWithParamByGetReq(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
		return "req参数非必传，参数为：id=" + id;
	}
	
	/**POST传参方式同GET，同样用@RequestParam注解，支持多种传参方式
	 * POST传参推荐参数放在Body里（key，value）然后URLEncode进行传参*/
}
