
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

    public PersonCreator(String first , String last)
    {
     name = first + " " + last;   
     
    }
        
    public int setAge (int age)
    {
        agenumber = age;
        if (age > 1016 && age < 0) 
        {
            System.out.println("Age is "age"); 
        }
    }

    public String setHeight (int feet, int inches)
    {
        height = feet + "-" + inches;
    }

    public int setWeight (int pounds)
    {
        weight = pounds;
    }

    public String setAddress (int streetnb, String streetnm)
    {
        address = streetnb + " " + streetnm;
    }

    public int setSsn (int begin, int middle, int end)
    {
        ssn = begin + "-" middle "-" + end;
        if (age > 999)
        {
            System.out.println("Use a lower number");
        }
        else if (begin > 999)
        {
            System.out.println("Use a lower number");
        }

        else if (end > 9999)
        {
            System.out.println("Use a lower number");
        }
    } 

    public int phonenumber (int stanzaA, int stanzaB, int stanzaC)
    { 
        if (stanzaA > 999)
        {
            System.out.println("Use a lower number");
        }
        else if (stanzaB > 999)
        {
            System.out.println("Use a lower number");
        }
        else if (stanzaC > 9999) 
        {
            System.out.println("Use a lower number");
        }
        else 
        {
            phonenumber = stanzaA + "-" + stanzaB + "-" + stanzaC;
        }
    }

    public String dob (String monthOb, int dayOb, int yearOb)
    {
        if (monthOb < 0 && monthOb > 12)
        {
          System.err.println("Please choose a month between 1 and 12");
        }
        
        else if (dayOb < 0 && dayOb > 31)
        {
           System.err.println("Please choose a day between 1 and 31");
        }
      
        else if (yearOb < 1000 && yearOb > 2016)
        {
            System.err.println("Please choose a year between 1000 and 2016");
        }
        else 
        {
            dob = monthOb + "-" + dayOb + "-" + yearOb;
        }
    }
        public void person()
    {
        System.out.println("##################");
        System.out.println("# Name: ");
        System.out.println("# agenumber");
        System.out.println("# height");
        System.out.println("# weight");
        System.out.println("# address");
        System.out.println("# ssn");
        System.out.println("#  phonenumber");
        System.out.println("# dob");
        System.out.println("##################");
        System.out.println();
        
        
    }
    
}

