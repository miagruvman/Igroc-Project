package bufferings;

/**
 *
 * @author Mia Gruvman
 */
public class PuppyModel {
    
    private String litter;
    private String litter2;
    private String mom;
    private String dad;
    private String grandma;
    private String grandpa; 
    private String puppies;

    public String getLitter2() {
        return litter2;
    }

    public void setLitter2(String litter2) {
        this.litter2 = litter2;
    }
    
    public PuppyModel() {}

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

    public String getPuppies() {
        return puppies;
    }

    public void setPuppies(String puppies) {
        this.puppies = puppies;
    }
}