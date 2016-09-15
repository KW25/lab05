
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private int agenumber;
    private String height;
    private int weight;
    private String name;
    private String address;
    private int ssn;
    private int phonenumber;
    private String dob;
    
    public int agenumber (int age);
    {
        agenumber = age;
        if (age > 18 || age < 50) 
        {
           System.out.println("Age is "age"") 
        }
    }
    
    public String height (int feet, int inches);
    {
        height = feet + "-" + inches;
    }
    
    public int weight (int pounds); 
    {
        weight = pounds;
    }
    public String name (String first, String last);
    {
        name = "first" + "last";
    }
    
    public String address (int streetnb, String streetnm);
    {
        address = streetnb + "streetnm";
    }
    
    public int ssn (int begin, int middle, int end);
    {
        ssn = begin + "-" middle "-" + end;
        if (age > 999)
        {
            System.out.println("Use a lower number")
        }
        else if (begin > 999)
        {
            System.out.println("Use a lower number")
        }
        
        else if (end > 9999)
        {
            System.out.println("Use a lower number")
        }
    } 
    
    public int phonenumber (int stanzaA, int stanzaB, int stanzaC);
    { 
        phonenumber = stanzaA + "-" + stanzaB + "-" + stanzaC;
        if (stanzaA > 999)
        {
            System.out.println("Use a lower number")
        }
        else if (stanzaB > 999)
        {
            System.out.println("Use a lower number")
        }
        else (stanzaC > 9999) 
        {
            System.out.println("Use a lower number")
        }
    }
}

