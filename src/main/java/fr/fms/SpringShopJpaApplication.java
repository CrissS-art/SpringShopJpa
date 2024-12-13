package fr.fms;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringShopJpaApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
//	    categoryRepository.save(new Category("Printer"));
//	    categoryRepository.save(new Category("Camera"));
//	    categoryRepository.save(new Category("TV"));
//		categoryRepository.save(new Category("Apple"));
//		Category smartphone = categoryRepository.save(new Category ("Smartphone"));
//		Category tablet = categoryRepository.save(new Category ("Tablet"));
//		Category pc = categoryRepository.save(new Category ("PC"));
//	    articleRepository.save(new Article("S10","Samsung",500.00,smartphone));
//	    articleRepository.save(new Article("S9","Samsung",350.00,smartphone));
//	    articleRepository.save(new Article("MI10","Xiaomi",100.00,smartphone));
//	    articleRepository.save(new Article("GalaxiTab","Samsung",450.00,tablet));
//	    articleRepository.save(new Article("IPad","Apple",350.00,tablet));   
//	    articleRepository.save(new Article("R510","Asus",600.00,pc));
	    
		
//		for(Article article : articleRepository.findByBrand("Samsung")) {
//	    	System.out.println(article);
//	    }
//		for(Article article : articleRepository.findByBrandAndPrice("Samsung",250)) {
//	    	System.out.println(article);
//	    } 
//	    for(Article article : articleRepository.findByBrandAndPriceGreaterThan("Samsung",300)) {
//	    	System.out.println(article);
//	    }
//		for(Article article : articleRepository.findByCategoryId(2L)) {
//	    	System.out.println(article);
//    }
//	    for(Article article : articleRepository.searchArticles("sung",200)) {
//	    	System.out.println(article);
//	    }
//	 Exercice 1.2 : Trouver 2 moyens pour récupérer et afficher sur la console un article en base 
//	 puis, dans un second temps, afficher tous les articles en base
//	    for(Article article : articleRepository.searchArticles("As",500)) {
//	    	System.out.println("1.2.1 : " + article);
//	    }
//	    for(Article article : articleRepository.searchArticlesById(6L)) {
//	    	System.out.println("1.2.2 : " + article);
//	    }
//	    for(Article article : articleRepository.searchListArticles(0)) {
//		    System.out.println("1.2.3 : " + article);
//		}
		
//		Exercice 1.3 : Ajouter une méthode qui permette de renvoyer tous les articles contenant telle description et telle marque.
//	    for(Article article : articleRepository.findByBrandAndDescription("Samsung","S10")) {
//    	System.out.println(article);
//    }
		
//		Exercice 1.4 : Ajouter une méthode qui permet de supprimer un article à partir de l’id
//		articleRepository.deleteById(1L);
		
//		Exercice 1.5 : Ajouter une méthode qui permet de mettre à jour un article à partir de l’id
//		articleRepository.updateArticleById(1L,"159UK","Dido",269.00); 
		
//		Exercice 1.6 : Ajouter des moyens pour afficher les noms des catégories classées par ordre croissant puis décroissant
//		        List<Category> categoryAsc = categoryRepository.findAllByOrderByNameAsc();
//		        System.out.println("Category.names in Ascending Order:");
//		        for (Category category : categoryAsc) {
//		            System.out.println(category.getName());
//		        }
//
//		        List<Category> categoryDesc = categoryRepository.findAllByOrderByNameDesc();
//		        System.out.println("Category.names in Descending Order:");
//		        for (Category category : categoryDesc) {
//		            System.out.println(category.getName());
//	}
		            
//		Exercice 1.7-1 : Ajouter une méthode de votre choix
//		            inner join avec Category.name Tablet(id2) et Article.price=350
//	    for (Article article: articleRepository.findArticlesByCategoryAndPrice("Tablet", 350)) {
//	    	System.out.println(article);
//		    }
//      Exercice 1.7-2 : inner join avec Category.name (id1) et tous les Articles de category.name
//	    for (Article article: articleRepository.findArticlesByCategoryName("Smartphone")) {
//    	System.out.println(article);
//	    	}
//      Exercice 1.7-3 : inner join avec les category != de PC et le prix < 499.00
//	    for (Article article: articleRepository.findArticlesNotInCategoryAndPriceLowerThan("PC", 499.00)) {
//    	System.out.println(article);
//	    }
        
        public class menuConsole {
        	Scanner scanner = new Scanner(System.in);
        	
            System.out.println("\nBienvenue dans notre application de gestion d'articles !");
            System.out.println("1 : Afficher tous les articles sans pagination");
            System.out.println("2 : Afficher tous les articles avec pagination");
            System.out.println("*********************");
            System.out.println("3 : Ajouter un article");
            System.out.println("4 : Afficher un article");
            System.out.println("5 : Supprimer un article");
            System.out.println("6 : Modifier un article");
            System.out.println("*********************");
            System.out.println("7 : Ajouter une catégorie");
            System.out.println("8 : Afficher une catégorie");
            System.out.println("9 : Supprimer une catégorie");
            System.out.println("10 : Mettre à jour une catégorie");
            System.out.println("11 : Afficher tous les articles d'une catégorie");
            System.out.println("*********************");
            System.out.println("12 : Sortir du programme");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
            case 1:
//        		articles sans pagination
              for (Article article : articleRepository.findAll()) {
              System.out.println(article.getDescription() + " - " + article.getBrand() + " - " + article.getPrice());
              }
                break;

            case 2:
//              articles avec pagination
        		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s", "ID", "DESCRIPTION", "MARQUE", "PRIX", "CATEGORIE"));
                for (Article article2 : articleRepository.findAllByOrderByIdAsc()) {
                	System.out.println(String.format("%-20d %-20s %-20s %-20.2f %-20s", 
                	article2.getId(), article2.getDescription(), article2.getBrand(), article2.getPrice(), article2.getCategory().getName()));
                }
                break;

            case 3:
                // Ajouter un article
                addArticle(scanner);
                break;
            
        }
	}
}