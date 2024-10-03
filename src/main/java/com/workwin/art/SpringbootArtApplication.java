package com.workwin.art;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class SpringbootArtApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootArtApplication.class, args);
	}

	/*
	 * @Autowired private HotelRepository hotelRepository;
	 * 
	 * @Autowired private ProductRepository productRepository;
	 * 
	 * @Autowired private ArtTypeRepository artTypeRepository;
	 * 
	 * 
	 */
	public void run(String... args) throws Exception {		
		/*
		
		product.setName("MK");
		product.setPrice(400);
		product.setQuantity(1);
		productRepository.save(product);
		
		Hotel hotel = new Hotel();
		hotel.setName("simi");
		hotel.setEmail("simi@gmail.com");
		hotel.setBuissitem("ACROOM");
		hotel.setBuissdesc("ac room for 3");
		hotel.setCost(5000);
		hotelRepository.save(hotel);
		
		ArtType artType = new ArtType();
		artType.setArtName("sunset painting");
		artType.setArtType("Nature painting");
		artTypeRepository.save(artType);
		 */
		
	}

}
