package bufferings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mia Gruvman
 */
public class PuppyModel {

    private String litter;
    private String mother;
    private String father;
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

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
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
