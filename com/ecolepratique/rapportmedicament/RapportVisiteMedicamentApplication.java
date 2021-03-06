package com.ecolepratique.rapportmedicament;

import java.time.LocalDate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ecolepratique.rapportmedicament.entite.Medicament;
import com.ecolepratique.rapportmedicament.entite.Offrir;
import com.ecolepratique.rapportmedicament.entite.Praticien;
import com.ecolepratique.rapportmedicament.entite.Rapport;
import com.ecolepratique.rapportmedicament.entite.User;
import com.ecolepratique.rapportmedicament.entite.UserRole;
import com.ecolepratique.rapportmedicament.entite.Visiteur;
import com.ecolepratique.rapportmedicament.repository.MedicamentRepositoryItf;
import com.ecolepratique.rapportmedicament.repository.OffrirRepositoryItf;
import com.ecolepratique.rapportmedicament.repository.PraticienRepositoryItf;
import com.ecolepratique.rapportmedicament.repository.RapportRepositoryItf;
import com.ecolepratique.rapportmedicament.repository.UserRepositoryItf;
import com.ecolepratique.rapportmedicament.repository.UserRoleRepositoryItf;
import com.ecolepratique.rapportmedicament.repository.VisiteurRepositoryItf;
import com.ecolepratique.rapportmedicament.service.PraticienServiceItf;


@SpringBootApplication
public class RapportVisiteMedicamentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RapportVisiteMedicamentApplication.class, args);
		RapportRepositoryItf  rapportDao = ctx.getBean(RapportRepositoryItf.class);
		VisiteurRepositoryItf visiteurDao = ctx.getBean(VisiteurRepositoryItf.class);
		OffrirRepositoryItf offrirDao = ctx.getBean(OffrirRepositoryItf.class);
		MedicamentRepositoryItf medicamentDao = ctx.getBean(MedicamentRepositoryItf.class);
         PraticienRepositoryItf praticienRepository = ctx.getBean(PraticienRepositoryItf.class);
		
		PraticienServiceItf praticienService = ctx.getBean(PraticienServiceItf.class);
		
		Praticien praticien1 = new Praticien("Lee", "Bruce", "24 Avenue des Aygalades, 13014 Marseille", "ophtalmologue");
		praticienRepository.save(praticien1);
		Praticien praticien2 = new Praticien("Hugo", "Victor", "24 avenue des Poilus 13090 Aix-En-Provence", "Dentiste");
		praticienRepository.save(praticien2);
		Praticien praticien3 = new Praticien("Mozart", "Amadeus", "12 rue du Charolais 75012 Paris", "Dentiste");
		praticienRepository.save(praticien3);
		Praticien praticien4 = new Praticien("Beethoven", "Ludwig Von", "4 All??e des Tanneurs 44000 Nantes", "ophtalmologue");
		praticienRepository.save(praticien4);
		Praticien praticien5 = new Praticien("Proust", "Marcel", "6 Rue de la Loge 13002 Marseille", "Dentiste");
		praticienRepository.save(praticien5);
		Praticien praticien6 = new Praticien("Arouet", "Fran??ois-Marie", "64 rue de Rivoli 75004 Paris", "ophtalmologue");
		praticien6.setVisite(true);
		praticienRepository.save(praticien6);
		Praticien praticien7 = new Praticien("Poquelin", "Jean-baptiste", "12 Boulevard de la Libert?? 59000 Lille", "Dentiste");
		praticienRepository.save(praticien7);
		Praticien praticien8 = new Praticien("Shakespear", "William", "4 rue Maurice Ripoche 75014 Paris", "Infirmier");
		praticien8.setVisite(true);
		praticienRepository.save(praticien8);
		Praticien praticien9 = new Praticien("Geldog", "Bob", "4 rue des Faulx 76000 Rouen", "Infirmier");
		praticienRepository.save(praticien9);
		Praticien praticien10 = new Praticien("Shakespear", "Edith", "32 rue de Solf??rino 59000 Lille", "Dentiste");
		praticienRepository.save(praticien10);
		Praticien praticien11 = new Praticien("Platini", "Michel", "12 rue des Orgues 13004 Marseille", "Dentiste");
		praticienRepository.save(praticien11);
		Praticien praticien12 = new Praticien("Giresse", "Alain", "32 rue de Rome 13006 Marseille", "Dentiste");
		praticienRepository.save(praticien12);
		Praticien praticien13 = new Praticien("Faubert", "Gustave", "10 Boulevard Massenet 13014 Marseille", "Dentiste");
		praticienRepository.save(praticien13);
		Praticien praticien14 = new Praticien("Camus", "Albert", "2 rue Lafon 13006 Marseille", "Dentiste");
		praticienRepository.save(praticien14);
		Praticien praticien15 = new Praticien("Zola", "Emile", "46 avenue du Prado 13008 Marseille", "Dentiste");
		praticien15.setVisite(true);
		praticienRepository.save(praticien15);
		Praticien praticien16 = new Praticien("Apolliaire", "Guillaume", "4 rue Granoux 13004 Marseille", "Dentiste");
		praticien16.setVisite(true);
		praticienRepository.save(praticien16);
		System.out.println("Liste praticien");
		System.out.println(praticienService.list());
		
		
		
		
		UserRepositoryItf userDao = ctx.getBean(UserRepositoryItf.class);
		userDao.save(new User("uadmin", "padmin"));
		userDao.save(new User("uuser", "puser"));
		
		UserRoleRepositoryItf userRoleDao = ctx.getBean(UserRoleRepositoryItf.class);
		userRoleDao.save(new UserRole("uadmin","ADMIN"));
		userRoleDao.save(new UserRole("uadmin","USER"));
		userRoleDao.save(new UserRole("uuser","USER"));
					
		Visiteur visiteur1 = new Visiteur("Lee", LocalDate.of(2017, 8, 12));
		Rapport rapport1 = new Rapport(LocalDate.of(2018, 1, 14), "J'ai pr??sent?? le m??dicament HELICIDINE au g??n??raliste, Monsieur Baturin, qui a une action s??dative sur la toux. "
				+ "Il est utilis?? dans le traitement symptomatique des toux s??ches. Le praticien a paru ??tre tr??s interess??. Je lui ai laiss?? 4 ??chantillons afin qu'il puisse le tester"
				+ " J'ai ??t?? agr??ablement de son retour et esp??re qu'il sera un contact moteur pour l'avenir. Cette visite est une totale r??ussite."
				, "Ce praticien n'a pas encore ??t?? visit??");
		System.out.println("Taille chaine=" + rapport1.getBilan().length());
		Rapport rapport2 = new Rapport(LocalDate.of(2020, 10, 22), "J'ai pr??sent?? notre nouveau m??dicament, HELICIDINE, au pneumologue, Monsieur Raphaelle, qui a une action s??dative sur la toux. \"\n" + 
				"				+ \"Il est utilis?? dans le traitement symptomatique des toux s??ches. Le praticien a paru septique. Je lui ai laiss?? 6 ??chantillons afin qu'il puisse le tester et lui prouv?? l'efficacit?? de ce m??dicament\"\n" + 
				"				+ \" Son retour n'a pas ??t?? bon, je lui ai dit que je le recontacterais dans 3 mois, le temps qu'il teste le m??dicament et qu'il puisse faire un prmeier retour. Cette visite a ??t?? d??licate.\"\n" + 
				"				, \"Ce praticien n'a pas encore ??t?? visit??", "Ce praticien ne connaissait pas notre nouveau m??dicament, l'HELICIDINE");
		rapportDao.save(rapport1);
		rapportDao.save(rapport2);
		visiteur1.addRapport(rapport1);
		visiteur1.addRapport(rapport2);
		visiteurDao.save(visiteur1);
		
		
		Visiteur visiteur2 = new Visiteur("Hugo", LocalDate.of(2016, 2, 6));
		rapport1 = new Rapport(LocalDate.of(2016, 04, 10), "J'ai pr??sent?? notre m??dicament SPEDIFEN, au g??n??raliste Monsieur Touffart. Ce m??dicament est un anti-inflammatoire non st??ro??dien (AINS). Il lutte contre la douleur et fait baisser la fi??vre. Ses propri??t??s anti-inflammatoires se manifestent ?? forte dose.\n" + 
				"\n" + 
				"Il est utilis?? dans le traitement de courte dur??e de la fi??vre et de la douleur (maux de t??te, douleurs dentaires, courbatures, r??gles douloureuses...). Monsieur Touffart a sembl?? ??tre tr??s int??ress?? par les r??sultats des ??tudes que je lui ai pr??sent??. Je lui ai laiss?? 2 ??chantillons.", "Quand j'ai contact?? ce praticien, il ??tait demandeur d'une rencontre.");
		rapport2 = new Rapport(LocalDate.of(2018, 01, 12), "J'ai pr??sent?? notre nouveau m??dicament l'IXPRIM, ?? l'infirmi??re Madame Bichard qui officie ?? l'h??pital conception. Traitement symptomatique des douleurs mod??r??es ?? intenses.\n" + 
				"L'utilisation d'Ixprim doit ??tre limit??e aux patients dont la douleur mod??r??e ?? intense n??cessite un traitement par une association de parac??tamol et de tramadol. Madame Bichard avait tr??s peu de temps et ?? l'air d??bord??e en cette p??riode. en fin d'entretin je lui ai promis de revenir la voir quand elle aura plus de disponibilit??.", "Premi??re rencontre de cette praticienne. Permet d'??tablir un contact");
		Rapport rapport3 = new Rapport(LocalDate.of(2014, 01, 14), "J'ai rencontr?? le docteur Mabuse qui est cardilogue ?? l'h??pital bichat pour lui pr??senter notre m??dicament le DAFLON. Ce m??dicament est un veinotonique et un protecteur vasculaire. Il stimule la circulation du sang dans les veines et lutte contre l'alt??ration des vaisseaux capillaires. Le praticien a sembl?? tr??s "
				+ "int??ress?? par les ??tudes d'impact que je lui ai pr??sent??. Il avait des questions tr??s pr??cise et semble ??tre tr??s comp??tent dans son domaine",
				"Praticien qui a une grande influence dans le milieur de la cardiologie");
		rapportDao.save(rapport1);
		rapportDao.save(rapport2);
		rapportDao.save(rapport3);
		visiteur2.addRapport(rapport1);
		visiteur2.addRapport(rapport2);
		
		
		visiteur2.addRapport(rapport3);
		visiteurDao.save(visiteur2);
		
		Visiteur visiteur3 = new Visiteur("Hugo", LocalDate.of(2021, 1, 8));
		visiteurDao.save(visiteur3);
		
		Medicament medicament1 = new Medicament(12468L, "LEVOTHYROX"); 
		Medicament medicament2 = new Medicament(14680L, "TAHOR"); 
		Medicament medicament3 = new Medicament(24682L, "HELICIDINE"); 
		Medicament medicament4 = new Medicament(80642L, "ANTARENE"); 
		
		medicament1.addEffet("Naus??es");
		medicament1.addEffet("Maux de t??te");
		medicament1.addEffet("D??mangeaisons");
		medicament1.addContreIndication("Gentamicine");
		medicament1.addContreIndication("Halofantrine");
		medicamentDao.save(medicament1);
		
		medicament2.addEffet("Somnolence");
		medicament2.addEffet("Diarrh??e");
		medicament2.addContreIndication("Lincomycine");
		medicament2.addContreIndication("Pindolol");
		medicamentDao.save(medicament2);
		
		medicament3.addEffet("Vision floue");
		medicament3.addEffet("Fatigue");
		medicament3.addContreIndication("Propaf??none");
		medicament3.addContreIndication("Quinine");
		medicamentDao.save(medicament3);
		
		medicament4.addEffet("Somnolence");
		medicament4.addEffet("Vision floue");
		medicament4.addEffet("Eruption cutan??e");
		medicament4.addContreIndication("Halofantrine");
		medicament4.addContreIndication("Pindolol");
		medicament4.addContreIndication("Quinine");
		medicamentDao.save(medicament4);
		
		/*
		 * medicamentDao.create(medicament1); medicamentDao.create(medicament2);
		 * medicamentDao.create(medicament3); medicamentDao.create(medicament4);
		 */

		/*
		 * medicamentService.create(medicament1); medicamentService.create(medicament2);
		 * medicamentService.create(medicament3); medicamentService.create(medicament4);
		 */
		Offrir offrir1 = new Offrir(1234L,  3, medicament1, rapport1);
		
		offrirDao.save(offrir1);
		}
}


