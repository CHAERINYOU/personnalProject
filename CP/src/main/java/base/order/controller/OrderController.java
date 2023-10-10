package base.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class OrderController {
	@PostMapping(value = "/order")
	public String order_html() {
		return "order";
	}
}
