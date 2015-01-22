package bufferings;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import com.google.gson.Gson;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.view.Viewable;
import java.util.List;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

@Path("/")
public class IgrocResource {

    private GsonWrapper gson = new GsonWrapper();
    private List<DogModel> dogs = gson.getAllDogs();
    private List<PuppyModel> pups = gson.getAllPuppies();

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Viewable displayHome() {
        return new Viewable("home");
    }

    @GET
    @Path("/kontakt")
    @Produces(MediaType.TEXT_HTML)
    public Viewable contact() {
        return new Viewable("contact");
    }

    @GET
    @Path("/omOss")
    @Produces(MediaType.TEXT_HTML)
    public Viewable aboutUs() {
        return new Viewable("aboutUs");
    }

    @GET
    @Path("/hundar")
    @Produces(MediaType.TEXT_HTML)
    public Viewable displayDogs(@QueryParam("kon") String gender) {
        return new Viewable("dogs", gson.getDogsByGender(gender));
    }

    @GET
    @Path("/valpkullar")
    @Produces(MediaType.TEXT_HTML)
    public String displayPuppies(@QueryParam("litter") String litter) {

//        return new Viewable("puppies", gson.getAllPuppies());
        return new Gson().toJson(gson.getAllPuppies());
    }

    @GET
    @Path("/shop")
    @Produces(MediaType.TEXT_HTML)
    public Viewable shop() {
        return new Viewable("shop", gson.getAllProducts());
    }

    @GET
    @Path("/shop/product")
    @Produces(MediaType.TEXT_HTML)
    public Viewable displayProducts(@QueryParam("id") String id) {
        return new Viewable("product", gson.getProductsById(id));
    }
    
    @GET
    @Path("/shop/cart")
    @Produces(MediaType.TEXT_HTML)
    public Viewable displayCart(@QueryParam("name") String name) {
        return new Viewable("product", gson.getProductsById(name));
    }
}