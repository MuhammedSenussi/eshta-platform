package com.eshta.platform.services.merchantPayment.service;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshta.platform.services.merchantPayment.model.MerchantPayment;

/**
 * Created by Senussi at night :)
 */
@RestController
@RequestMapping("/merchant")
public class MerchantTransactionREST {

	/**
	 * Sample usage: curl $HOST:$PORT/user/1
	 *
	 * @param transId
	 * @return
	 */
	@RequestMapping("payment/{transId}")
	public MerchantPayment getUser(@PathVariable Long transId) {

		return new MerchantPayment(transId, "Merchant Payment #" + transId, new BigDecimal(22));
	}
}
