package bufferings;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mia Gruvman
 */
public class GsonWrapper {

    private Gson gson = new Gson();

    private Type dogType = new TypeToken<List<DogModel>>() {
    }.getType();
    private List<DogModel> allDogs = new ArrayList<>();

    private Type puppyType = new TypeToken<List<PuppyModel>>() {
    }.getType();
    private List<PuppyModel> allPuppies = new ArrayList<>();

    private Type shopType = new TypeToken<List<ProductModel>>() {
    }.getType();
    private List<ProductModel> allProducts = new ArrayList<>();

    public GsonWrapper() {
    }

    public List<DogModel> getAllDogs() {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("Dogs.json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            allDogs = gson.fromJson(bufferedReader, dogType);
            bufferedReader.close();
            inputStream.close();

            return allDogs;
        } catch (IOException e) {
            return null;
        }
    }

    public List<PuppyModel> getAllPuppies() {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("Puppies.json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            allPuppies = gson.fromJson(bufferedReader, puppyType);
            bufferedReader.close();
            inputStream.close();

            return allPuppies;
        } catch (IOException e) {
            return null;
        }

    }

    public List<ProductModel> getAllProducts() {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("shop.json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            allProducts = gson.fromJson(bufferedReader, shopType);
            bufferedReader.close();
            inputStream.close();

            return allProducts;
        } catch (IOException e) {
            return null;
        }

    }
    
    public List<DogModel> getDogsByGender(String gender) {
        List<DogModel> dogsByGender = new ArrayList();

        for (DogModel h : getAllDogs()) {
            if (h.getGender().equals(gender)) {
                dogsByGender.add(h);
            }
        }
        return dogsByGender;
    }

    public List<ProductModel> getProductsById(String id) {
        List<ProductModel> productsById = new ArrayList<>();

        for (ProductModel s : getAllProducts()) {
            if (s.getId().equals(id)) {
                productsById.add(s);
            }
        }
        return productsById;
    }

    public ProductModel getProductById(String id) {
        
        for(ProductModel product : allProducts) {
            if(product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
    
    public List<PuppyModel> getPuppiesByLitter(String litter) {
        List<PuppyModel> puppiesByLitter = new ArrayList();

        for (PuppyModel p : getAllPuppies()) {
            if (p.getLitter().equals(litter)) {
                puppiesByLitter.add(p);
            }
        }
        return puppiesByLitter;
    }

}
