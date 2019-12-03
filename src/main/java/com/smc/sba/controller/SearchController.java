package com.smc.sba.controller;


import com.smc.sba.service.CompanyService;
import com.smc.sba.service.StockPriceService;
import com.smc.sba.utils.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/search")
public class SearchController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private StockPriceService stockPriceService;
	@Autowired
	private CompanyService companyService;

	@GetMapping("/company")
	public CommonResult searchCompany(@RequestParam(required = false) String companyCode,
			@RequestParam(required = false) String companyName) {
		return companyService.findAll();
	}

	@GetMapping("/exchange")
	public CommonResult searchExchange(@RequestParam String code) {
		return null;
	}
}
