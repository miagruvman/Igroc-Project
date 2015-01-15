package bufferings;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.view.Viewable;
import java.util.List;
import javax.ws.rs.QueryParam;

@Path("/")
public class IgrocResource {
    private GsonWrapper gson = new GsonWrapper();
    private List<DogModel> dogs = gson.getAllDogs();
    private List<PuppyModel> puppies = gson.getAllPuppies();
    
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
    public Viewable displayPuppies(@QueryParam("litter") String litter) {
        return new Viewable("puppies", gson.getPuppiesByLitter(litter));
    }

//    public static class SampleModel {
//        
//        public String greeting;
//        public String name;
//
//        public SampleModel(String greeting, String name) {
//            this.greeting = greeting;
//            this.name = name;
//        }
//    }
}