package br.com.confidencecambio.javabasico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.HelloService;
import br.com.confidencecambio.javabasico.service.ImcService;



@RestController
public class ImcRestController {
	
	 private ImcService service;

	    public ImcRestController(final ImcService service) {

	        this.service = service;
	    }


//	@RequestMapping(value = "/calculo", method = RequestMethod.GET)	
//	  public ResponseEntity<String> olaMundo(@RequestParam(value = "iCalculo", required = false) double iCalculo) {
//        var retorno = "Valor " + service.calculo(iCalculo);
//        
//        return new ResponseEntity<>(retorno, HttpStatus.OK);
//    }

}
