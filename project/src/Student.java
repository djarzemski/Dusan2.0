public class Student {
  
  private String mail;
  
  /*
      0 - founders;
      1 - gentlemen;
      2 - fortes;
      3 - sprouts;
  */
  private int hall;
  
  
  /*
      0 - male;
      1 - female;
  */
  private int gender;
  
  private String name;
  
  private int year;
  
  public Student(String mail, String name, String hall, String year){
    setMail(mail);
    setName(name);
    setHall(hall);
    setYear(year);
  }
  
  public String setMail(String mail){
    this.mail = mail;
  }
  
  public String setName(String name){
    this.name = name;
  }
  
  public int setHall(String hall){
    if(hall=="Founders") this.hall = 0;
    if(hall=="Gentlemen") this.hall = 1;
    if(hall=="Fortes") this.hall = 2;
    if(hall=="Sprouts") this.hall = 3;
    
    setGender(this.hall);
  }
  
  public setGender(int hall){
    if(hall == 0 || hall == 1) this.gender = 0;
    if(hall == 2 || hall == 3) this.gender = 1;
  }
  
  public setYear(year){
   if(year == "YEAR 1") this.year = 1;
   if(year == "YEAR 2") this.year = 2;
   if(year == "YEAR 3") this.year = 3;
   if(year == "YEAR 4") this.year = 4;
   } 
 
  
}
