package bufferings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mia Gruvman
 */
public class PuppyModel {

    private String litter;
    private String mom;
    private String dad;
    private String grandma;
    private String grandpa;
    public List<Puppies> puppies= new ArrayList<>();
    
    public PuppyModel() {
    }
 
    public List<Puppies> getPuppies() {        
        return puppies;
    }

    public void setPuppies(List<Puppies> puppies) {
        this.puppies = puppies;
    }

    public String getLitter() {
        return litter;
    }

    public void setLitter(String litter) {
        this.litter = litter;
    }

    public String getMom() {
        return mom;
    }

    public void setMom(String mom) {
        this.mom = mom;
    }

    public String getDad() {
        return dad;
    }

    public void setDad(String dad) {
        this.dad = dad;
    }

    public String getGrandma() {
        return grandma;
    }

    public void setGrandma(String grandma) {
        this.grandma = grandma;
    }

    public String getGrandpa() {
        return grandpa;
    }

    public void setGrandpa(String grandpa) {
        this.grandpa = grandpa;
    }

}
