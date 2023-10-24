package br.com.brasilapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name="brasilapi", url="https://brasilapi.com.br/api/")
@RestController
public interface Service {

	@GetMapping("{parameter}")
	String connection(@PathVariable("parameter") String urlParameter);

}
