package fr.fms.dao;

import java.lang.Long;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.fms.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {	
	public List<Article> findByBrand(String brand);
	public List<Article> findByBrandContains(String brand);
	public List<Article> findByBrandAndPrice(String brand, double price);
	public List<Article> findByBrandAndPriceGreaterThan(String brand, double price);
	public List<Article> findByCategoryId(Long id);
	@Query("select A from Article A where A.brand like %:x% and A.price > :y")
	public List<Article> searchArticles(@Param("x") String kw, @Param("y")double price);
	
	
//	 Exercice 1.2
//	@Query("select A from Article A where A.brand like %:x% and A.price > :y")
//	public List<Article> searchArticles(@Param("x") String kw, @Param("y")double price);	
//	@Query("select A from Article A where A.id = :y")
//	public List<Article> searchArticlesById(@Param("y")Long id);
//	@Query("select A from Article A where A.price > :y")
//	public List<Article> searchListArticles(@Param("y")double price);
	
//	Exercice 1.3
//	public List<Article> findByBrandAndDescription(String brand, String description);
	
//	Exercice 1.4
//  @Transactional
//  @Modifying
//	@Query ("delete from Article A where A.id=:id")
//	void deleteArticleById(@Param("id") Long id);

//	Exercice 1.5 : Ajouter une méthode qui permet de mettre à jour un article à partir de l’id
//  @Transactional
//  @Modifying
//	@Query("Update Article A set A.description=:description,  set A.brand=:brand, set A.price=:price  where A.id=:id")
//	public void updateArticleById(@Param("id") Long id, @Param("description") String description, 
//	@Param("brand") String brand, @Param("price") Double price);
	
//	Exercice 1.7-1 : 	
//	@Query("SELECT A FROM Article A INNER JOIN A.category C WHERE C.name = :categoryName AND A.price = :price")
//  public List<Article> findArticlesByCategoryAndPrice(@Param("categoryName") String categoryName, @Param("price") double price);
	
//	Exercice 1.7-2 :
//	@Query("SELECT A FROM Article A INNER JOIN A.category C WHERE C.name = :categoryName");
//	public List<Article> findArticlesByCategoryName(@Param("categoryName") String categoryName);
	
//	Exercice 1.7-3 :
//    @Query("SELECT A FROM Article A INNER JOIN A.category C WHERE C.name != :categoryName AND A.price < :price")
//    public List<Article> findArticlesNotInCategoryAndPriceLowerThan(@Param("categoryName") String categoryName, @Param("price") double price);

//	TP - 1
	List<Article> findAll();
	
//	TP - 2
	List<Article> findAllByOrderByIdAsc();
		
}