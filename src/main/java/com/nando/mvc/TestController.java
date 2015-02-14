package com.nando.mvc;

import java.net.URISyntaxException;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nando.dto.TestDTO;

@Controller
public class TestController {
	
	private static final Logger logger = Logger.getLogger(TestController.class.getName());

	public TestController(){

	}

	
	@RequestMapping("/test")
	@ResponseBody 
	public TestDTO test(TestDTO input) throws URISyntaxException{
		logger.info("Input: "+input);	
		
		return input;
	}
	
//	@RequestMapping("/api/DDPreauthCreationLink")
//	@ResponseBody 
//	public PreautorizationLinkDTO gePreauthCreationLink(CreatePreautorizationLinkParametersDTO inDTO) throws URISyntaxException{
//
//		//TODO: como saco esto de aquí?
//		gocardless.GoCardless.environment = gocardless.GoCardless.Environment.SANDBOX;
//
//		Connect connect = new Connect(theAccountDetails);
//		PreAuthorization preauth = new PreAuthorization(theAccountDetails.getMerchantId(), new java.math.BigDecimal(inDTO.getMaxAmount()), 1, "month");
//		
//		String url = connect.newPreAuthorizationUrl(preauth, new URI(inDTO.getRedirectURI()), null, inDTO.getUserId());
//
//		logger.info("The url to bre returned : "+url );
//		
//		PreautorizationLinkDTO result = new PreautorizationLinkDTO(url);
//		
//		return result;
//	}
	
//	@RequestMapping(value = "/ddCreated", method = RequestMethod.GET)
//	public String ddCreated (
//			@RequestParam("state") String state, 
//			@RequestParam("resource_uri") String resource_uri,
//			@RequestParam("resource_id") String resource_id,
//			@RequestParam("resource_type") String resource_type,
//			@RequestParam("signature") String signature,
//			Model model, HttpSession session) throws URISyntaxException, SignatureException {
//		
//		logger.info("DDCreatedController.ddCreated");
//		logger.info("__State "+state);
//		logger.info("__resource_id "+resource_id);
//		
//		//llamamos a la confirmación
//		GoCardless.environment = GoCardless.Environment.SANDBOX;
//
//		Connect connect = new Connect(theAccountDetails);
//		Resource resource = new Resource();
//
//		resource.setState(state);
//		resource.setResourceUri(resource_uri);
//		resource.setResourceId(resource_id);
//		resource.setResourceType(resource_type);
//		resource.setSignature(signature);
//
//		connect.confirm(resource);
//		
//		model.addAttribute("resource", resource);
//		
//		return "ddCreated";
//	}

}