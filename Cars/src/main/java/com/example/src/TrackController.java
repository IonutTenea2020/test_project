package com.example.src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Service
@Controller
public class TrackController {
	@Autowired
	private RepositoryClient repoClt;
	@Autowired
	private RepositoryComanda repoCom;
	@Autowired
	private RepositoryConducator repoCond;
	@Autowired
	private RepositoryCursa repoCrs;
	@Autowired
	private RepositoryFactura repoFact;
	@Autowired
	private RepositoryMasina repoMas;
	
	
	@GetMapping("/adaugareMasina")
	public String adaugareMasina(Model model) {
		model.addAttribute("masina", new Masina());		
		return "adaugareMasina";
	}
	@PostMapping("/creareMasina")
	public String creareMasina(@ModelAttribute Masina masina, Model model) {
		model.addAttribute("masina", masina);
		repoMas.save(masina);
		return "redirect:adaugareMasina";
	}
	@GetMapping("/adaugareClient")
	public String adaugareClient(Model model) {
		model.addAttribute("client", new Client());		
		return "adaugareClient";
	}
	@PostMapping("/creareClient")
	public String creareClient(@ModelAttribute Client client, Model model) {
		model.addAttribute("client", client);
		repoClt.save(client);
		return "redirect:adaugareClient";
	}
	@GetMapping("/clienti")
	public String clienti(Model model) {
		model.addAttribute("clienti", repoClt.findAll());
		return "clienti";
	}
	@GetMapping("/adaugareComanda")
	public String adaugareComanda(Model model) {
		model.addAttribute("comanda", new Comanda());		
		return "adaugareComanda";
	}
	@PostMapping("/creareComanda")
	public String creareComanda(@ModelAttribute Comanda comanda, Model model) {
		model.addAttribute("comanda", comanda);
		repoCom.save(comanda);
		return "redirect:adaugareComanda";
	}
	}