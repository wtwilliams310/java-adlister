package dao;

public class DaoFactoryPractice {
    private static Products productsDao;

    public static Products getProductsDao(){
        if(productsDao == null){
            productsDao = new InMemoryProductsDao();
        }
        return productsDao;
    }
}
